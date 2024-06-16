package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.TelaControleUsuarios;
import model.Usuario;


public class TabelaUsuarioControle {
    
    public ArrayList<Usuario> listaUsuarios() throws SQLException {
        
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        try {
            Connection conexao = new ConexaoDB().conectar();
            Statement stmt = conexao.createStatement();
            ResultSet st = stmt.executeQuery("SELECT * FROM usuarios");
            Usuario usuario;
            while(st.next()) {
                usuario = new Usuario(st.getString("Nome"), st.getString("Senha"));
                listaUsuarios.add(usuario);
            }    
        }
            catch (Exception e) {
        }
        return listaUsuarios;
    }
    
    public boolean removerUsuario(String nome, String senha) throws SQLException {
        
        PreparedStatement stmt = null;
        boolean deletadoSucesso = false;
        
        try {
        Connection conexao = new ConexaoDB().conectar();
        String sql = "DELETE FROM usuarios WHERE nome = ? AND senha = ?";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, senha);
        int fileirasAfetadas = stmt.executeUpdate();
        deletadoSucesso = fileirasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return deletadoSucesso;
    } 
}

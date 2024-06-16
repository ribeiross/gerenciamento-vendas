package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
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

}

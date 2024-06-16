
package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AutenticacaoDB {
    
    public void cadastrarUsuario(String nome, String senha) throws SQLException {
        String sql = "INSERT INTO usuarios (nome, senha) VALUES ('"+nome+"','"+senha+"')";
        Connection conexao = new ConexaoDB().conectar();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.execute();
        conexao.close();
        
    }
    
    public void logarUsuario(String nome, String senha) throws SQLException {
        String sql = "SELECT nome,senha FROM usuarios WHERE nome ='"+nome+"' AND senha = '"+senha+"'";
        Connection conexao = new ConexaoDB().conectar();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        rs.last();
        conexao.close();
        
    }    
    
}
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    
    public Connection conectar() throws SQLException {
        
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto", "root", "12345");
        return conexao;
    }
    
}

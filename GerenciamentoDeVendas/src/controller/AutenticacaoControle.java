
package controller;

import view.TelaLogin;
import view.TelaCadastro;
import java.sql.Connection;
import java.sql.SQLException;

public class AutenticacaoControle {
    
    public void cadastroUsuario(TelaCadastro view) throws SQLException {
        Connection conexao = new ConexaoDB().conectar();
        AutenticacaoDB cadastro = new AutenticacaoDB();
        cadastro.cadastrarUsuario(view.getUsuarioCadastro().getText(), view.getSenhaCadastro().getText());
    }
    
    public void loginUsuario(TelaLogin view) throws SQLException {
        Connection conexao = new ConexaoDB().conectar();
        AutenticacaoDB login = new AutenticacaoDB();
        login.logarUsuario(view.getUsuarioLogin().getText(), view.getSenhaLogin().getText());
    }    
}

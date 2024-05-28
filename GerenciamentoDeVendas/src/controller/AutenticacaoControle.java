
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class AutenticacaoControle {
    private List <Usuario> usuarios;
    
    public AutenticacaoControle() {
        usuarios = new ArrayList<>();
    }
    
    public void cadastrarUsuario(String nome, String senha) {
        // Metodo para cadastrar usuarios adicionando eles a ArrayList
        usuarios.add(new Usuario(nome,senha));
    }
    
    public boolean autenticarUsuario (String nome, String senha) {
        // Metodo simples para validar se um Usuario está devidamente cadastrado no sistema
        // Futuramente pode implementar outras formas de validação
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isAdmin (String nome, String senha) {
        // Metodo para validar se o usuario do sistema é um ADMIN
        // Alterar futuramente para tornar mais seguro
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals("admin") && usuario.getSenha().equals("admin")) {
                return true;
            }
        }
        return false;   
    }
}
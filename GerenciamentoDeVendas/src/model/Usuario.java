
package model;

/**
 *
 * @author Ribeiro
 */
public class Usuario {
    private String nomeUsuario;
    private String senha;
    private boolean isAdmin;
    
    public Usuario() {
    }
    
    public Usuario(String nomeUsuario, String senha, boolean isAdmin) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.isAdmin = isAdmin;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
}

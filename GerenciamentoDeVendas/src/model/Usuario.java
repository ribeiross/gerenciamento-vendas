
package model;


public class Usuario {
    
    private String nome;
    private String senha;
    private boolean isAdmin;
    
    public Usuario(String nome, String senha, boolean isAdmin) {
        this.nome = nome;
        this.senha = senha;
        this.isAdmin = isAdmin;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean isAdmin() {
        return isAdmin;
    }
    
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Admin: " + (isAdmin ? "Sim" : "Não"));
        
    }
    

}


package model;

/**
 *
 * @author Ribeiro
 */
public class Cliente {
    
    public String nomeCliente;
    private String clienteEndereco;
    private String telefone;
    
    //CONSTRUTORES
    public Cliente() {
        
    }
    
    public Cliente(String nomeCliente, String clienteEndereco, String telefone) {
        this.nomeCliente = nomeCliente;
        this.clienteEndereco = clienteEndereco;
        this.telefone = telefone;
    }
    
    //GETTERS E SETTERS
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getClienteEndereco() {
        return clienteEndereco;
    }

    public void setClienteEndereco(String clienteEndereco) {
        this.clienteEndereco = clienteEndereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}

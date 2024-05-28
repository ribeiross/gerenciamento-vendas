
package model;

/**
 *
 * @author Ribeiro
 */
public class Cliente {
    
    public String nomeCliente;
    private String clienteEndereco;
    private long telefoneCliente;
    
    //CONSTRUTORES
    public Cliente() {
        
    }
    
    public Cliente(String nomeCliente, String clienteEndereco, long telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.clienteEndereco = clienteEndereco;
        this.telefoneCliente = telefoneCliente;
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

    public long getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(long telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    
    
}

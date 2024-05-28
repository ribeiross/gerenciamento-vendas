package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
/**
 *
 * @author Ribeiro
 */
public class ClientesControle {
    private List <Cliente> clientes;
    
    public ClientesControle() {
        clientes = new ArrayList<>();
    }
    
    public void adicionarCliente(String nomeCliente, String clienteEndereco, long telefoneCliente) {
        clientes.add(new Cliente(nomeCliente,clienteEndereco,telefoneCliente));
        
    }
}

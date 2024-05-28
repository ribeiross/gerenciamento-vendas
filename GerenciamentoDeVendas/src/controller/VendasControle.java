package controller;

import java.util.ArrayList;
import java.util.List;
import model.Venda;
import model.Cliente;

public class VendasControle {
    private List <Venda> vendas;
    
    public VendasControle() {
        vendas = new ArrayList<>();
    }
    
    public void adicionarProduto(String produto, int quantidade, String cliente, double valorUnitario) {
        vendas.add(new Venda(produto,quantidade,cliente,valorUnitario));
        
    }
    
    public void calcularTotal(int quantidade, double valorUnitario) {
        double resultado = quantidade * valorUnitario;
        
    }
    
    public boolean validarCliente (String cliente, String nomeCliente) {
        for (Venda venda : vendas) {
            if (venda.getCliente().equals(nomeCliente)) {
                return true;
            }
        }
        return false;    
    }
    
}

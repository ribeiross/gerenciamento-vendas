
package model;
public class Vendas {
    
    private String produto;
    private int quantidade;
    private String cliente;
    private double valorUnitario;
    
    
    
   public Vendas (String produto, int quantidade, String cliente, double valorUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.cliente = cliente;
        this.valorUnitario = valorUnitario;
    }
    
   
    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public double getValorUnitario() {
        return valorUnitario;
    }
    
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
    public double calcularTotal() {
        return quantidade * valorUnitario;
    }
    
    
    public void exibirDetalhes() {
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor unitário: " + valorUnitario);
        System.out.println("Total da compra: " + calcularTotal());
    }
    
   
}

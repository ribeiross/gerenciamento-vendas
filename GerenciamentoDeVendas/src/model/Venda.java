
package model;
public class Venda {
    
    private String produto;
    private int quantidade;
    private String cliente;
    private double totalCompra;
    
    
   //CONSTRUTOR 
   public Venda (String cliente, String produto, int quantidade, double totalCompra) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.totalCompra = totalCompra;
    }
    
   //GETTERS E SETTERS
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
    
    public double getTotalCompra() {
        return totalCompra;
    }
    
    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
      
}

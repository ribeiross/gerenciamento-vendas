package controller;

import java.util.ArrayList;
import java.util.List;
import model.Produto;
/**
 *
 * @author Ribeiro
 */
public class ProdutosControle {
    private List <Produto> produtos;
    
    public ProdutosControle() {
        produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(int id, String nome, double preco, int quantidade) {
        produtos.add(new Produto(id,nome,preco,quantidade));
        
    }
}




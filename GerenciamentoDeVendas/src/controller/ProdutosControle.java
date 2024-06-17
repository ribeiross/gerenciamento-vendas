package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import view.TelaProdutos;

public class ProdutosControle {
    
    public ArrayList<Produto> listaProdutos() throws SQLException {
        
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        try {
            Connection conexao = new ConexaoDB().conectar();
            Statement stmt = conexao.createStatement();
            ResultSet st = stmt.executeQuery("SELECT * FROM produtos");
            Produto produto;
            while(st.next()) {
                produto = new Produto(st.getInt("id"),
                        st.getString("produto"), st.getDouble("preco"), st.getInt("quantidade"));
                listaProdutos.add(produto);
            }    
        }
            catch (Exception e) {
        }
        return listaProdutos;
    }
    
    public boolean removerProduto(String nome, int id, double preco, int quantidade) throws SQLException {
        
        PreparedStatement stmt = null;
        boolean deletadoSucesso = false;
        
        try {
        Connection conexao = new ConexaoDB().conectar();
        String sql = "DELETE FROM produtos WHERE produto = ? AND id = ? AND preco = ? AND quantidade = ?";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2, id);
        stmt.setDouble(3,preco);
        stmt.setInt(4,quantidade);
        int fileirasAfetadas = stmt.executeUpdate();
        deletadoSucesso = fileirasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return deletadoSucesso;
    }     

    public void adicionarProduto(TelaProdutos tela) {
        
        DefaultTableModel tabela = (DefaultTableModel)tela.getTabelaProdutos().getModel();
        int id = Integer.parseInt(tela.getCampoProdutoID().getText());
        String produto = tela.getCampoProdutoNome().getText();
        double preco = Double.parseDouble(tela.getCampoProdutoPreco().getText());
        int quantidade = Integer.parseInt(tela.getCampoProdutoQuantidade().getText());
        tabela.addRow(new Object[]{produto, id, preco, quantidade});
        try {        
        Connection conexao = new ConexaoDB().conectar();

        String sql = "INSERT INTO produtos (produto, id, preco, quantidade) VALUES ('"+produto+"','"+id+"','"+preco+"','"+quantidade+"')";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.executeUpdate();
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
        }
    }
    
    public void atualizarProduto(TelaProdutos tela) {
        
        DefaultTableModel tabela = (DefaultTableModel)tela.getTabelaProdutos().getModel();
        int fileiraSelecionada = tela.getTabelaProdutos().getSelectedRow();
        int id = Integer.parseInt(tela.getCampoProdutoID().getText());
        String produto = tela.getCampoProdutoNome().getText();
        double preco = Double.parseDouble(tela.getCampoProdutoPreco().getText());
        int quantidade = Integer.parseInt(tela.getCampoProdutoQuantidade().getText());
        try {
            Connection conexao = new ConexaoDB().conectar();
            String sql = "UPDATE produtos SET produto=?, preco=?, quantidade=? WHERE id =?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto);
            stmt.setDouble(2,preco);
            stmt.setInt(3,quantidade);
            stmt.setInt(4, id);            
            stmt.executeUpdate();
            tabela.setValueAt(produto, fileiraSelecionada, 0);            
            tabela.setValueAt(id, fileiraSelecionada, 1);
            tabela.setValueAt(preco, fileiraSelecionada, 2);
            tabela.setValueAt(quantidade, fileiraSelecionada, 3);
            stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();  
        }
    }
}




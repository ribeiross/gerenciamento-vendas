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
    
    public boolean removerProduto(int id, String nome, double preco, int quantidade) throws SQLException {
        
        PreparedStatement stmt = null;
        boolean deletadoSucesso = false;
        
        try {
        Connection conexao = new ConexaoDB().conectar();
        String sql = "DELETE FROM produtos WHERE id = ? AND produto = ? AND preco = ? AND quantidade = ?";
        stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setString(2, nome);
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
        tabela.addRow(new Object[]{id, produto, preco, quantidade});
        try {        
        Connection conexao = new ConexaoDB().conectar();

        String sql = "INSERT INTO produtos (id, produto, preco, quantidade) VALUES ('"+id+"','"+produto+"','"+preco+"','"+quantidade+"')";
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
            String sql = "UPDATE produtos SET id=?, produto=?, preco=?, quantidade=?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, produto);
            stmt.setDouble(3,preco);
            stmt.setInt(4,quantidade);
            stmt.executeUpdate();
            tabela.setValueAt(id, fileiraSelecionada, 0);
            tabela.setValueAt(produto, fileiraSelecionada, 1);
            tabela.setValueAt(preco, fileiraSelecionada, 2);
            tabela.setValueAt(quantidade, fileiraSelecionada, 3);
            stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();  
        }
    }
}




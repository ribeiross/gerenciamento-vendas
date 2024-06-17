package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Venda;
import view.TelaVendas;



public class VendasControle {
    public ArrayList<Venda> listaVendas() throws SQLException {
        
        ArrayList<Venda> listaVendas = new ArrayList<>();
        try {
            Connection conexao = new ConexaoDB().conectar();
            Statement stmt = conexao.createStatement();
            ResultSet st = stmt.executeQuery("SELECT * FROM vendas");
            Venda venda;
            while(st.next()) {
                venda = new Venda(st.getString("cliente"),
                        st.getString("produto"), st.getInt("quantidade"), st.getDouble("total_da_compra"));
                listaVendas.add(venda);
            }    
        }
            catch (Exception e) {
        }
        return listaVendas;
    }
        
    public boolean removerVenda(String cliente, String produto, int quantidade, double totalCompra) throws SQLException {
        
        PreparedStatement stmt = null;
        boolean deletadoSucesso = false;
        
        try {
        Connection conexao = new ConexaoDB().conectar();
        String sql = "DELETE FROM vendas WHERE cliente = ? AND produto = ? AND quantidade = ? AND total_da_compra = ?";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, cliente);
        stmt.setString(2, produto);
        stmt.setInt(3,quantidade);
        stmt.setDouble(4,totalCompra);
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
    
    public void adicionarVenda(TelaVendas tela) {
        
        DefaultTableModel tabela = (DefaultTableModel)tela.getTabelaVendas().getModel();
        String cliente = tela.getCampoCliente().getText();
        String produto = tela.getCampoProduto().getText();
        int quantidade = Integer.parseInt(tela.getCampoProdutoQuantidade().getText());        
        double totalCompra = Double.parseDouble(tela.getCampoTotalCompra().getText());
        
        PreparedStatement stmt = null;
        Connection conexao = null;
            try {        
            conexao = new ConexaoDB().conectar();
        
        // Verifica se o produto existe e checa quantidade atual no estoque
        String sqlVerificar = "SELECT quantidade FROM produtos WHERE produto = ?";
        stmt = conexao.prepareStatement(sqlVerificar);
        stmt.setString(1, produto);
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()) {
            int quantidadeAtual = rs.getInt("quantidade");
            int novaQuantidade = quantidadeAtual - quantidade;
            
            // Atualiza a quantidade de produtos
            String sqlUpdate = "UPDATE produtos SET quantidade = ? WHERE produto = ?";
            stmt.close(); 
            stmt = conexao.prepareStatement(sqlUpdate);
            stmt.setInt(1, novaQuantidade);
            stmt.setString(2, produto);
            stmt.executeUpdate();
            
            // Adiciona a fileira a tabela
            tabela.addRow(new Object[]{cliente, produto, quantidade, totalCompra});
            
            String sqlInserir = "INSERT INTO vendas (cliente, produto, quantidade, total_da_compra) VALUES (?, ?, ?, ?)";
            stmt.close();
            stmt = conexao.prepareStatement(sqlInserir);
            stmt.setString(1, cliente);
            stmt.setString(2, produto);
            stmt.setInt(3, quantidade);
            stmt.setDouble(4, totalCompra);
            stmt.executeUpdate();
        }
        
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(stmt != null) {
                        stmt.close();
                }
                    if(conexao != null) {
                        conexao.close();
                }
        }   catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void atualizarVenda(TelaVendas tela) {
    DefaultTableModel tabela = (DefaultTableModel)tela.getTabelaVendas().getModel();
    int fileiraSelecionada = tela.getTabelaVendas().getSelectedRow();
    String cliente = tela.getCampoCliente().getText();
    String produto = tela.getCampoProduto().getText();
    int novaQuantidade = Integer.parseInt(tela.getCampoProdutoQuantidade().getText());        
    double totalCompra = Double.parseDouble(tela.getCampoTotalCompra().getText());
    
    Connection conexao = null;
    PreparedStatement stmt = null;
    
    try {
        conexao = new ConexaoDB().conectar();
        
        // Adquire a quantidade atual da tabela
        String sqlSelect = "SELECT quantidade FROM produtos WHERE produto = ?";
        stmt = conexao.prepareStatement(sqlSelect);
        stmt.setString(1, produto);
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()) {
            int quantidadeAtual = rs.getInt("quantidade");
            int diferencaQuantidade = novaQuantidade - quantidadeAtual;
            
            // Update 'produtos' table with new quantity
            String sqlUpdateProdutos;
            if(diferencaQuantidade > 0) {
                // Se a diferença for positiva, subtrai a diferença do estoque
                sqlUpdateProdutos = "UPDATE produtos SET quantidade = quantidade - ? WHERE produto = ?";
            } else {
                // Se a diferença for negativa, adiciona a diferença ao estoque
                sqlUpdateProdutos = "UPDATE produtos SET quantidade = quantidade + ? WHERE produto = ?";
                diferencaQuantidade *= -1; 
            }
            
            stmt.close(); // Fecha o statement
            stmt = conexao.prepareStatement(sqlUpdateProdutos);
            stmt.setInt(1, diferencaQuantidade);
            stmt.setString(2, produto);
            stmt.executeUpdate();
            
            // Atualiza a tabela vendas
            String sqlUpdateVendas = "UPDATE vendas SET cliente=?, produto=?, quantidade=? WHERE total_da_compra=?";
            stmt.close(); // Close previous statement
            stmt = conexao.prepareStatement(sqlUpdateVendas);
            stmt.setString(1, cliente);
            stmt.setString(2, produto);
            stmt.setInt(3, novaQuantidade);
            stmt.setDouble(4, totalCompra);            
            stmt.executeUpdate();
            
            // Atualiza a JTable
            tabela.setValueAt(cliente, fileiraSelecionada, 0);            
            tabela.setValueAt(produto, fileiraSelecionada, 1);
            tabela.setValueAt(novaQuantidade, fileiraSelecionada, 2);
            tabela.setValueAt(totalCompra, fileiraSelecionada, 3);
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if(stmt != null) {
                stmt.close();
            }
            if(conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {
          e.printStackTrace();  
        }
    }
}
    
}


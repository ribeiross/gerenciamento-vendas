package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import view.TelaClientes;

public class ClientesControle {
    
    public ArrayList<Cliente> listaClientes() throws SQLException {
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try {
            Connection conexao = new ConexaoDB().conectar();
            Statement stmt = conexao.createStatement();
            ResultSet st = stmt.executeQuery("SELECT * FROM clientes");
            Cliente cliente;
            while(st.next()) {
                cliente = new Cliente(st.getString("Nome"),
                        st.getString("Endereco"), st.getString("Telefone"));
                listaClientes.add(cliente);
            }    
        }
            catch (Exception e) {
        }
        return listaClientes;
    }
    
    public boolean removerCliente(String nomeCliente, String clienteEndereco, String telefone) throws SQLException {
        
        PreparedStatement stmt = null;
        boolean deletadoSucesso = false;
        
        try {
        Connection conexao = new ConexaoDB().conectar();
        String sql = "DELETE FROM clientes WHERE nome = ? AND endereco = ? AND telefone =?";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nomeCliente);
        stmt.setString(2, clienteEndereco);
        stmt.setString(3,telefone);
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
    
    public void adicionarCliente(TelaClientes tela) {
        
        DefaultTableModel tabela = (DefaultTableModel)tela.getTabelaClientes().getModel();
        String nome = tela.getCampoClienteNome().getText();
        String endereco = tela.getCampoEndereco().getText();
        String telefone = tela.getCampoTelefone().getText();
        tabela.addRow(new Object[]{nome,endereco,telefone});
        try {        
        Connection conexao = new ConexaoDB().conectar();

        String sql = "INSERT INTO clientes (nome, endereco, telefone) VALUES ('"+nome+"','"+endereco+"','"+telefone+"')";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.executeUpdate();
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
        }
    }
    
    public void atualizarCliente(TelaClientes tela) {
        
        DefaultTableModel tabela = (DefaultTableModel)tela.getTabelaClientes().getModel();
        int fileiraSelecionada = tela.getTabelaClientes().getSelectedRow();
        String nome = tela.getCampoClienteNome().getText();
        String endereco = tela.getCampoEndereco().getText();
        String telefone = tela.getCampoTelefone().getText();
        try {
            Connection conexao = new ConexaoDB().conectar();
            String sql = "UPDATE clientes SET nome=?, endereco=?, telefone=?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, telefone);
            stmt.executeUpdate();
            tabela.setValueAt(nome, fileiraSelecionada, 0);
            tabela.setValueAt(endereco, fileiraSelecionada, 1);
            tabela.setValueAt(telefone, fileiraSelecionada, 2);            
            stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();  
        }
    }
}

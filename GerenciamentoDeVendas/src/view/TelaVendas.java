
package view;

import controller.VendasControle;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Venda;

/**
 *
 * @author Ribeiro
 */
public class TelaVendas extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaVendas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MarcadoresCadastro = new javax.swing.ButtonGroup();
        botaoVoltar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JToggleButton();
        campoProduto = new javax.swing.JTextField();
        campoCliente = new javax.swing.JTextField();
        campoTotalCompra = new javax.swing.JTextField();
        campoProdutoQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaVendas = new javax.swing.JTable();
        imagemVendas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1533, 887));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoVoltar.setContentAreaFilled(false);
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 620, 100, 30));

        botaoRemover.setContentAreaFilled(false);
        botaoRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverMouseClicked(evt);
            }
        });
        getContentPane().add(botaoRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 330, 230, 30));

        botaoAtualizar.setContentAreaFilled(false);
        botaoAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAtualizarMouseClicked(evt);
            }
        });
        getContentPane().add(botaoAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 260, 240, 40));

        botaoAdicionar.setContentAreaFilled(false);
        botaoAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAdicionarMouseClicked(evt);
            }
        });
        getContentPane().add(botaoAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 200, 250, 30));

        campoProduto.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        getContentPane().add(campoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 490, 40));

        campoCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        getContentPane().add(campoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 490, 40));

        campoTotalCompra.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        campoTotalCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTotalCompraKeyTyped(evt);
            }
        });
        getContentPane().add(campoTotalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 490, 40));

        campoProdutoQuantidade.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        campoProdutoQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoProdutoQuantidadeKeyTyped(evt);
            }
        });
        getContentPane().add(campoProdutoQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 490, 40));

        TabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Produto", "Quantidade", "Total Compra (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelaVendas.getTableHeader().setReorderingAllowed(false);
        TabelaVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaVendas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 700, 300));

        imagemVendas.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        imagemVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelasVendas.jpg"))); // NOI18N
        imagemVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imagemVendas.setMaximumSize(new java.awt.Dimension(1280, 720));
        imagemVendas.setMinimumSize(new java.awt.Dimension(1280, 720));
        imagemVendas.setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().add(imagemVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 1920, 870));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoProdutoQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoProdutoQuantidadeKeyTyped
        char caracterProdutoQuantidade = evt.getKeyChar();
        
        if(!Character.isDigit(caracterProdutoQuantidade))
            evt.consume();
    }//GEN-LAST:event_campoProdutoQuantidadeKeyTyped

    private void campoTotalCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTotalCompraKeyTyped
        // TODO add your handling code here:
        char caracterProdutoPreco = evt.getKeyChar();
        
        if(Character.isLetter(caracterProdutoPreco)&&!evt.isAltDown())
            evt.consume();
    }//GEN-LAST:event_campoTotalCompraKeyTyped

    private void botaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseClicked
        //Comandos para retornar para a tela principal (Possibilidade de implementar um if/else que analisa
        // a boolean isAdmin presente na classe AutenticacaoControle para decidir se vai retornar para o menu
        // de um admin ou de um usuario comum do sistema)
        this.toBack();
        setVisible(false);
        TelaAdmin telaDeAdmin = new TelaAdmin();
        telaDeAdmin.setVisible(true);
        telaDeAdmin.toFront();
    }//GEN-LAST:event_botaoVoltarMouseClicked

    private void botaoAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarMouseClicked
        if (campoCliente.getText() != "" || campoProduto.getText() != "" || campoProdutoQuantidade.getText() != "" || campoTotalCompra.getText() != "") {
            VendasControle controle = new VendasControle();
            controle.adicionarVenda(this);
            //Comandos para limpar os campos apos realizar a ação 
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos!");
        }
    }//GEN-LAST:event_botaoAdicionarMouseClicked

    private void botaoAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAtualizarMouseClicked
        int fileiraSelecionada  = TabelaVendas.getSelectedRow();
        DefaultTableModel tabela = (DefaultTableModel)TabelaVendas.getModel();
        if (fileiraSelecionada >=0) {
            VendasControle controle = new VendasControle();
            controle.atualizarVenda(this);
        } else {
            JOptionPane.showMessageDialog(null, "Algo de Errado aconteceu");
        }
        //Comandos para limpar os campos apos realizar a ação 
        limparCampos();
    }//GEN-LAST:event_botaoAtualizarMouseClicked

    private void botaoRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverMouseClicked
        //Remove a fileira de venda da tabela e também o deleta ela do banco de dados)
        int fileiraSelecionada = TabelaVendas.getSelectedRow();
        if (fileiraSelecionada >= 0) {
            try {
                DefaultTableModel tabela = (DefaultTableModel) TabelaVendas.getModel();
                String cliente = tabela.getValueAt(fileiraSelecionada, 0).toString();
                String produto = tabela.getValueAt(fileiraSelecionada, 1).toString();
                int quantidade = Integer.parseInt(tabela.getValueAt(fileiraSelecionada, 2).toString());                
                double totalCompra = Double.parseDouble(tabela.getValueAt(fileiraSelecionada, 3).toString());
                VendasControle controle = new VendasControle();
                boolean deletado = controle.removerVenda(cliente, produto, quantidade, totalCompra);
                
                if (deletado) {
                    tabela.removeRow(fileiraSelecionada);
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao deletar registro de venda."); 
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
                JOptionPane.showMessageDialog(this, "Selecione uma fileira para deletar.");
            }
        //Comandos para limpar os campos apos realizar a ação 
        limparCampos();
    }//GEN-LAST:event_botaoRemoverMouseClicked

    private void TabelaVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaVendasMouseClicked
        //Serve para ao selicionar uma fileira presente na tabela inserir as informações nos JTextFields
        int fileiraSelecionada = TabelaVendas.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)TabelaVendas.getModel();
        campoCliente.setText(model.getValueAt(fileiraSelecionada, 0).toString());
        campoProduto.setText(model.getValueAt(fileiraSelecionada, 1).toString());
        campoProdutoQuantidade.setText(model.getValueAt(fileiraSelecionada, 2).toString());
        campoTotalCompra.setText(model.getValueAt(fileiraSelecionada, 3).toString());
    }//GEN-LAST:event_TabelaVendasMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
        mostrarVenda();
        } catch (SQLException ex) {
            Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    public void limparCampos() {
        campoProduto.setText(" ");
        campoCliente.setText(" ");
        campoTotalCompra.setText(" ");
        campoProdutoQuantidade.setText(" ");
    }
    
    public void mostrarVenda() throws SQLException {
        
        VendasControle controle = new VendasControle();
        ArrayList<Venda> lista = controle.listaVendas();
        DefaultTableModel tabelaProdutos = (DefaultTableModel)TabelaVendas.getModel();
        Object [] fileira = new Object [4];
        for (int i = 0; i<lista.size();i++) {
            fileira[0] = lista.get(i).getCliente();
            fileira[1] = lista.get(i).getProduto();
            fileira[2] = lista.get(i).getQuantidade();
            fileira[3] = lista.get(i).getTotalCompra();
            tabelaProdutos.addRow(fileira);
        }
    }     
    public JTable getTabelaVendas() {
        return TabelaVendas;
    }

    public void setTabelaVendas(JTable TabelaVendas) {
        this.TabelaVendas = TabelaVendas;
    }

    public JTextField getCampoCliente() {
        return campoCliente;
    }

    public void setCampoCliente(JTextField campoCliente) {
        this.campoCliente = campoCliente;
    }

    public JTextField getCampoProduto() {
        return campoProduto;
    }

    public void setCampoProduto(JTextField campoProduto) {
        this.campoProduto = campoProduto;
    }

    public JTextField getCampoProdutoQuantidade() {
        return campoProdutoQuantidade;
    }

    public void setCampoProdutoQuantidade(JTextField campoProdutoQuantidade) {
        this.campoProdutoQuantidade = campoProdutoQuantidade;
    }

    public JTextField getCampoTotalCompra() {
        return campoTotalCompra;
    }

    public void setCampoTotalCompra(JTextField campoTotalCompra) {
        this.campoTotalCompra = campoTotalCompra;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup MarcadoresCadastro;
    private javax.swing.JTable TabelaVendas;
    private javax.swing.JToggleButton botaoAdicionar;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JTextField campoProduto;
    private javax.swing.JTextField campoProdutoQuantidade;
    private javax.swing.JTextField campoTotalCompra;
    private javax.swing.JLabel imagemVendas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

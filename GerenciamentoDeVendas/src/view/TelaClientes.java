package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ribeiro
 */
public class TelaClientes extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaClientes() {
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
        campoEndereco = new javax.swing.JTextField();
        campoClienteNome = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaClientes = new javax.swing.JTable();
        imagemClientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1533, 887));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
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

        campoEndereco.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        getContentPane().add(campoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 490, 40));

        campoClienteNome.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        getContentPane().add(campoClienteNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 490, 40));

        campoTelefone.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        campoTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTelefoneKeyTyped(evt);
            }
        });
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 490, 40));

        TabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelaClientes.getTableHeader().setReorderingAllowed(false);
        TabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 700, 300));

        imagemClientes.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        imagemClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaClientes.jpg"))); // NOI18N
        imagemClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imagemClientes.setMaximumSize(new java.awt.Dimension(1280, 720));
        imagemClientes.setMinimumSize(new java.awt.Dimension(1280, 720));
        imagemClientes.setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().add(imagemClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 1920, 870));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTelefoneKeyTyped
        char caracterProdutoQuantidade = evt.getKeyChar();
        
        if(!Character.isDigit(caracterProdutoQuantidade))
            evt.consume();
    }//GEN-LAST:event_campoTelefoneKeyTyped

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
            DefaultTableModel model = (DefaultTableModel)TabelaClientes.getModel();
        model.addRow(new Object[]{campoClienteNome.getText(), campoEndereco.getText(),
                                  campoTelefone.getText()});
        //Comandos para limpar os campos apos realizar a ação (Alterar futuramente para tornar em um metodo
        // presente em uma classe separada para tornar o codigo mais limpo) 
        campoClienteNome.setText(" ");
        campoEndereco.setText(" ");
        campoTelefone.setText(" ");
    }//GEN-LAST:event_botaoAdicionarMouseClicked

    private void botaoAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAtualizarMouseClicked
        int fileiraSelecionada  = TabelaClientes.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)TabelaClientes.getModel();
        if (fileiraSelecionada >=0) {
            model.setValueAt(campoClienteNome.getText(), fileiraSelecionada, 0);
            model.setValueAt(campoEndereco.getText(), fileiraSelecionada, 1);
            model.setValueAt(campoTelefone.getText(), fileiraSelecionada, 2);
        } else {
            JOptionPane.showMessageDialog(null, "Algo de Errado aconteceu");
        }
        //Comandos para limpar os campos apos realizar a ação (Alterar futuramente para tornar em um metodo
        // presente em uma classe separada para tornar o codigo mais limpo) 
        campoClienteNome.setText(" ");
        campoEndereco.setText(" ");
        campoTelefone.setText(" ");
    }//GEN-LAST:event_botaoAtualizarMouseClicked

    private void botaoRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverMouseClicked
        int fileiraSelecionada  = TabelaClientes.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)TabelaClientes.getModel();
        model.removeRow(fileiraSelecionada);
        //Comandos para limpar os campos apos realizar a ação (Alterar futuramente para tornar em um metodo
        // presente em uma classe separada para tornar o codigo mais limpo) 
        campoClienteNome.setText(" ");
        campoEndereco.setText(" ");
        campoTelefone.setText(" ");
    }//GEN-LAST:event_botaoRemoverMouseClicked

    private void TabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClientesMouseClicked
        //Serve para ao selicionar uma fileira presente na tabela inserir as informações nos JTextFields
        int fileiraSelecionada = TabelaClientes.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)TabelaClientes.getModel();
        campoClienteNome.setText(model.getValueAt(fileiraSelecionada, 0).toString());
        campoEndereco.setText(model.getValueAt(fileiraSelecionada, 1).toString());
        campoTelefone.setText(model.getValueAt(fileiraSelecionada, 2).toString());
    }//GEN-LAST:event_TabelaClientesMouseClicked

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
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup MarcadoresCadastro;
    private javax.swing.JTable TabelaClientes;
    private javax.swing.JToggleButton botaoAdicionar;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoClienteNome;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel imagemClientes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoVoltar.setContentAreaFilled(false);
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 620, 100, 30));

        botaoRemover.setContentAreaFilled(false);
        botaoRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botaoRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 330, 230, 30));

        botaoAtualizar.setContentAreaFilled(false);
        botaoAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botaoAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 260, 240, 40));

        botaoAdicionar.setContentAreaFilled(false);
        botaoAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Produto", "Quantidade", "Total Compra (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaVendas);
        if (TabelaVendas.getColumnModel().getColumnCount() > 0) {
            TabelaVendas.getColumnModel().getColumn(0).setResizable(false);
            TabelaVendas.getColumnModel().getColumn(1).setResizable(false);
            TabelaVendas.getColumnModel().getColumn(2).setResizable(false);
            TabelaVendas.getColumnModel().getColumn(3).setResizable(false);
        }

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

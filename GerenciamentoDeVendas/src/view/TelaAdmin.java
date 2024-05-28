
package view;

/**
 *
 * @author Ribeiro
 */
public class TelaAdmin extends javax.swing.JFrame {

    public TelaAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MarcadoresCadastro = new javax.swing.ButtonGroup();
        botaoDesconectar = new javax.swing.JButton();
        botaoProdutos = new javax.swing.JButton();
        botaoClientes = new javax.swing.JButton();
        botaoVendas = new javax.swing.JButton();
        botaoUsuarios = new javax.swing.JButton();
        imagemLogo = new javax.swing.JLabel();
        imagemAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoDesconectar.setContentAreaFilled(false);
        botaoDesconectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botaoDesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, 130, 20));

        botaoProdutos.setContentAreaFilled(false);
        botaoProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 200, 40));

        botaoClientes.setContentAreaFilled(false);
        botaoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClientesActionPerformed(evt);
            }
        });
        getContentPane().add(botaoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 200, 40));

        botaoVendas.setContentAreaFilled(false);
        botaoVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendasActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 200, 40));

        botaoUsuarios.setContentAreaFilled(false);
        botaoUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(botaoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 200, 30));

        imagemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N
        getContentPane().add(imagemLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 520, 470));

        imagemAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaAdmin.jpeg"))); // NOI18N
        imagemAdmin.setMaximumSize(new java.awt.Dimension(1280, 720));
        imagemAdmin.setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(imagemAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1533, 887));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClientesActionPerformed
        this.toBack();
        setVisible(false);
        TelaClientes telaDeClientes = new TelaClientes();
        telaDeClientes.setVisible(true);
        telaDeClientes.toFront();
    }//GEN-LAST:event_botaoClientesActionPerformed

    private void botaoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutosActionPerformed
        this.toBack();
        setVisible(false);
        TelaProdutos telaDeProdutos = new TelaProdutos();
        telaDeProdutos.setVisible(true);
        telaDeProdutos.toFront();
    }//GEN-LAST:event_botaoProdutosActionPerformed

    private void botaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendasActionPerformed
        this.toBack();
        setVisible(false);
        TelaVendas telaDeVendas = new TelaVendas();
        telaDeVendas.setVisible(true);
        telaDeVendas.toFront();
    }//GEN-LAST:event_botaoVendasActionPerformed

    private void botaoUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoUsuariosMouseClicked
        this.toBack();
        setVisible(false);
        TelaControleUsuarios telaDeControleUsuario = new TelaControleUsuarios();
        telaDeControleUsuario.setVisible(true);
        telaDeControleUsuario.toFront();
    }//GEN-LAST:event_botaoUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup MarcadoresCadastro;
    private javax.swing.JButton botaoClientes;
    private javax.swing.JButton botaoDesconectar;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoUsuarios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JLabel imagemAdmin;
    private javax.swing.JLabel imagemLogo;
    // End of variables declaration//GEN-END:variables
}

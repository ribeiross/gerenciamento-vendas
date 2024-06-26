
package view;

import controller.AutenticacaoDB;
import controller.AutenticacaoControle;
import javax.swing.JTextField;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
    private AutenticacaoDB controller;

    /**
     * Creates new form TelaLogin
     */
    public TelaCadastro() {
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

        usuarioCadastro = new javax.swing.JTextField();
        senhaCadastro = new javax.swing.JTextField();
        botaoConcluirCadastro = new javax.swing.JButton();
        imagemCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioCadastro.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        usuarioCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 400, 40));

        senhaCadastro.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        senhaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(senhaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 400, 40));

        botaoConcluirCadastro.setContentAreaFilled(false);
        botaoConcluirCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConcluirCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConcluirCadastroMouseClicked(evt);
            }
        });
        getContentPane().add(botaoConcluirCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 180, 30));

        imagemCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaCadastro.jpeg"))); // NOI18N
        imagemCadastro.setMaximumSize(new java.awt.Dimension(1280, 720));
        imagemCadastro.setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(imagemCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1533, 887));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioCadastroActionPerformed

    private void senhaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaCadastroActionPerformed

    private void botaoConcluirCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConcluirCadastroMouseClicked
       if(usuarioCadastro.getText().matches("") || senhaCadastro.getText().matches("")) {
           JOptionPane.showMessageDialog(rootPane, "Prencha todos os campos");
       } else {
        try {
        AutenticacaoControle cadastro = new AutenticacaoControle();
       cadastro.cadastroUsuario(this);
       } catch (SQLException sql) {
           
       }
        this.toBack();
        setVisible(false);
        TelaLogin telaDeLogin = new TelaLogin();
        telaDeLogin.setVisible(true);
        telaDeLogin.toFront();
       }
    }//GEN-LAST:event_botaoConcluirCadastroMouseClicked

    public JTextField getSenhaCadastro() {
        return senhaCadastro;
    }

    public void setSenhaCadastro(JTextField senhaCadastro) {
        this.senhaCadastro = senhaCadastro;
    }

    public JTextField getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(JTextField usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConcluirCadastro;
    private javax.swing.JLabel imagemCadastro;
    private javax.swing.JTextField senhaCadastro;
    private javax.swing.JTextField usuarioCadastro;
    // End of variables declaration//GEN-END:variables
}

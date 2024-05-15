/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Ribeiro
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        usuarioLogin = new javax.swing.JTextField();
        senhaLogin = new javax.swing.JPasswordField();
        botaoConectar = new javax.swing.JButton();
        imagemLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioLogin.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        usuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLoginActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 400, 40));

        senhaLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(senhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 400, 40));

        botaoConectar.setContentAreaFilled(false);
        botaoConectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botaoConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 180, 30));

        imagemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela Login.jpeg"))); // NOI18N
        imagemLogin.setMaximumSize(new java.awt.Dimension(1280, 720));
        imagemLogin.setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(imagemLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1533, 887));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConectar;
    private javax.swing.JLabel imagemLogin;
    private javax.swing.JPasswordField senhaLogin;
    private javax.swing.JTextField usuarioLogin;
    // End of variables declaration//GEN-END:variables
}

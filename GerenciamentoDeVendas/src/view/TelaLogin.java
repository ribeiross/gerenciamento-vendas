
package view;

import controller.AutenticacaoControle;
import javax.swing.JOptionPane;
public class TelaLogin extends javax.swing.JFrame {
    private AutenticacaoControle controller;
    
    public TelaLogin() {
        controller = new AutenticacaoControle();
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
        botaoCadastrar = new javax.swing.JButton();
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

        botaoCadastrar.setContentAreaFilled(false);
        botaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, 180, 30));

        botaoConectar.setContentAreaFilled(false);
        botaoConectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConectarMouseClicked(evt);
            }
        });
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

    private void botaoConectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConectarMouseClicked
       String nome = usuarioLogin.getText();
       String senha = new String(senhaLogin.getPassword());
       if (nome.equals("admin") && senha.equals("admin")) {
           this.toBack();
           setVisible(false);
           TelaAdmin telaDeAdmin = new TelaAdmin();
           telaDeAdmin.setVisible(true);
           telaDeAdmin.toFront();
       } else if (controller.autenticarUsuario(nome, senha)) {
           this.toBack();
           setVisible(false);
           TelaUsuarios telaDeUsuario = new TelaUsuarios();
           telaDeUsuario.setVisible(true);
           telaDeUsuario.toFront();   
       } else {
           JOptionPane.showMessageDialog(null, "USUÁRIO NÃO CADASTRADO");
       }
    }//GEN-LAST:event_botaoConectarMouseClicked

    private void botaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarMouseClicked
           this.toBack();
           setVisible(false);
           TelaCadastro telaDeCadastro = new TelaCadastro();
           telaDeCadastro.setVisible(true);
           telaDeCadastro.toFront();
    }//GEN-LAST:event_botaoCadastrarMouseClicked

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
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoConectar;
    private javax.swing.JLabel imagemLogin;
    private javax.swing.JPasswordField senhaLogin;
    private javax.swing.JTextField usuarioLogin;
    // End of variables declaration//GEN-END:variables
}

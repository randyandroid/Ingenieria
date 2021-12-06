/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.DbUsuarios;
import Modelo.DbUsuariosConsulta;
import Modelo.hash;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class RegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() {
         initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        NombreRegristro = new javax.swing.JLabel();
        ApellidoRegristro = new javax.swing.JLabel();
        NombreRegristro2 = new javax.swing.JLabel();
        UsuarioRegristro = new javax.swing.JLabel();
        NombreRegristro3 = new javax.swing.JLabel();
        xxx = new javax.swing.JLabel();
        UsuReg = new javax.swing.JTextField();
        EmaReg = new javax.swing.JTextField();
        NomReg = new javax.swing.JTextField();
        RepPwd = new javax.swing.JPasswordField();
        btnRegistrarReg = new javax.swing.JButton();
        btnSalirReg = new javax.swing.JButton();
        PwdReg = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        Rg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreRegristro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        NombreRegristro.setForeground(new java.awt.Color(0, 0, 0));
        NombreRegristro.setText("Nombre: ");
        fondo.add(NombreRegristro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        ApellidoRegristro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ApellidoRegristro.setForeground(new java.awt.Color(0, 0, 0));
        ApellidoRegristro.setText("Correo:");
        fondo.add(ApellidoRegristro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        NombreRegristro2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        NombreRegristro2.setForeground(new java.awt.Color(0, 0, 0));
        NombreRegristro2.setText("Confirmar Contraseña: ");
        fondo.add(NombreRegristro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, -1));

        UsuarioRegristro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        UsuarioRegristro.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioRegristro.setText("Usuario :");
        fondo.add(UsuarioRegristro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        NombreRegristro3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        NombreRegristro3.setForeground(new java.awt.Color(0, 0, 0));
        NombreRegristro3.setText("Contraseña : ");
        fondo.add(NombreRegristro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        xxx.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        xxx.setForeground(new java.awt.Color(0, 0, 0));
        xxx.setText("Registro ");
        fondo.add(xxx, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        UsuReg.setBackground(new java.awt.Color(255, 255, 255));
        UsuReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UsuReg.setForeground(new java.awt.Color(0, 0, 0));
        UsuReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuRegActionPerformed(evt);
            }
        });
        fondo.add(UsuReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 220, -1));

        EmaReg.setBackground(new java.awt.Color(255, 255, 255));
        EmaReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        EmaReg.setForeground(new java.awt.Color(0, 0, 0));
        EmaReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmaRegActionPerformed(evt);
            }
        });
        fondo.add(EmaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 220, -1));

        NomReg.setBackground(new java.awt.Color(255, 255, 255));
        NomReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NomReg.setForeground(new java.awt.Color(0, 0, 0));
        NomReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomRegActionPerformed(evt);
            }
        });
        fondo.add(NomReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 220, -1));

        RepPwd.setBackground(new java.awt.Color(255, 255, 255));
        RepPwd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RepPwd.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(RepPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 220, -1));

        btnRegistrarReg.setText("Registrar");
        btnRegistrarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRegActionPerformed(evt);
            }
        });
        fondo.add(btnRegistrarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 140, 40));

        btnSalirReg.setText("Salir ");
        btnSalirReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRegActionPerformed(evt);
            }
        });
        fondo.add(btnSalirReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 140, 40));

        PwdReg.setBackground(new java.awt.Color(255, 255, 255));
        PwdReg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PwdReg.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(PwdReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 220, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoRg.png"))); // NOI18N
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 130, -1));

        Rg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo rosa.jpg"))); // NOI18N
        fondo.add(Rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 500, 525));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuRegActionPerformed

    private void EmaRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmaRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmaRegActionPerformed

    private void NomRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomRegActionPerformed

    private void btnSalirRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRegActionPerformed
           //Login LG = new Login ();
            //LG.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnSalirRegActionPerformed

    private void btnRegistrarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRegActionPerformed
        // TODO add your handling code here:

        DbUsuarios obju = new DbUsuarios(); //instancia
        DbUsuariosConsulta objx = new DbUsuariosConsulta();

        String pass = new String(PwdReg.getPassword()); //obtengo contraseña
        String passCon = new String(RepPwd.getPassword());//obtengo confirmacion de contraseña

        //valido los datos ingresados al sistema
        if (NomReg.getText().equals("") || EmaReg.getText().equals("") || UsuReg.getText().equals("") || passCon.equals("")) {

            JOptionPane.showMessageDialog(null, "llene todos los campos");
        } else {

            if (pass.equals(passCon)) { //valido que las contraseñas sean iguales

                /*if (objx.ConsultarUsuario(UsuReg.getText()) == 0) {*/

                    String NuevoPass = hash.sha1(pass);

                    obju.setUsuario(UsuReg.getText());
                    obju.setPassword(NuevoPass);
                    obju.setNombre(NomReg.getText());
                    obju.setEmail(EmaReg.getText());
                    obju.setId_Tipo(1);

                    if (objx.RegistrarUsuario(obju)) {

                        JOptionPane.showMessageDialog(null, "Usuario Registrado");

                    } else {

                        JOptionPane.showMessageDialog(null, "Error al guardar");

                    }
               /* } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }*/

            } else {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");

            }

        }//fin de la validacion

        //fin boton
    }//GEN-LAST:event_btnRegistrarRegActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoRegristro;
    private javax.swing.JTextField EmaReg;
    private javax.swing.JTextField NomReg;
    private javax.swing.JLabel NombreRegristro;
    private javax.swing.JLabel NombreRegristro2;
    private javax.swing.JLabel NombreRegristro3;
    private javax.swing.JPasswordField PwdReg;
    private javax.swing.JPasswordField RepPwd;
    private javax.swing.JLabel Rg;
    private javax.swing.JTextField UsuReg;
    private javax.swing.JLabel UsuarioRegristro;
    private javax.swing.JButton btnRegistrarReg;
    private javax.swing.JButton btnSalirReg;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel xxx;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.DbConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class Paciente extends javax.swing.JFrame {

PreparedStatement ps;
ResultSet Res;


  public void Limpiar(){
        
         CodPac.setText(null);
         CedPac.setText(null);
         NssPac.setText(null);
         NomPac.setText(null);
         ApePac.setText(null);
         TelPac.setText(null);
         CelPac.setText(null);
         FechPac.setText(null);
         HisPac.setText(null);
         DirrPac.setText(null);
         EmePac.setText(null);
         OcuPac.setText(null);
         
        
    }
    public Paciente() {
        initComponents();
         this.setLocationRelativeTo(null);
         IDpac.setVisible(false);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ApePac = new javax.swing.JTextField();
        CedPac = new javax.swing.JTextField();
        CelPac = new javax.swing.JTextField();
        TelPac = new javax.swing.JTextField();
        DirrPac = new javax.swing.JTextField();
        OcuPac = new javax.swing.JTextField();
        HisPac = new javax.swing.JTextField();
        CodPac = new javax.swing.JTextField();
        NssPac = new javax.swing.JTextField();
        EmePac = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SexPac = new javax.swing.JComboBox<>();
        TipPac = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        NomPac = new javax.swing.JTextField();
        GuaPac = new javax.swing.JButton();
        IDpac = new javax.swing.JTextField();
        ConPac = new javax.swing.JButton();
        EdiPac = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        FechPac = new javax.swing.JTextField();
        ArsPac = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 57, -1));

        ApePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApePacActionPerformed(evt);
            }
        });
        jPanel1.add(ApePac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 150, 30));

        CedPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedPacActionPerformed(evt);
            }
        });
        jPanel1.add(CedPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 150, 30));

        CelPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelPacActionPerformed(evt);
            }
        });
        jPanel1.add(CelPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 150, 30));

        TelPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelPacActionPerformed(evt);
            }
        });
        jPanel1.add(TelPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 150, 30));

        DirrPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirrPacActionPerformed(evt);
            }
        });
        jPanel1.add(DirrPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 320, 30));

        OcuPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcuPacActionPerformed(evt);
            }
        });
        jPanel1.add(OcuPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 150, 30));

        HisPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HisPacActionPerformed(evt);
            }
        });
        jPanel1.add(HisPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 150, 30));

        CodPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodPacActionPerformed(evt);
            }
        });
        jPanel1.add(CodPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 150, 30));

        NssPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NssPacActionPerformed(evt);
            }
        });
        jPanel1.add(NssPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 150, 30));

        EmePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmePacActionPerformed(evt);
            }
        });
        jPanel1.add(EmePac, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 160, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 70, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 70, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cédula:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 70, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Celular:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 60, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 60, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ocupación:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 334, 80, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Direccion:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 120, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sexo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 40, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tipificación:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 80, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Historial Clínico:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 110, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("NSS:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 60, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Emergencias:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 90, 30));

        SexPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino" }));
        jPanel1.add(SexPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 120, -1));

        TipPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jPanel1.add(TipPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 130, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 70, 20));

        NomPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomPacActionPerformed(evt);
            }
        });
        jPanel1.add(NomPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 150, 30));

        GuaPac.setText("Guardar");
        GuaPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuaPacActionPerformed(evt);
            }
        });
        jPanel1.add(GuaPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 80, -1));

        IDpac.setEditable(false);
        jPanel1.add(IDpac, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 80, -1));

        ConPac.setText("Consultar");
        ConPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConPacActionPerformed(evt);
            }
        });
        jPanel1.add(ConPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 90, -1));

        EdiPac.setText("Editar");
        EdiPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdiPacActionPerformed(evt);
            }
        });
        jPanel1.add(EdiPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 80, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 20));

        FechPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechPacActionPerformed(evt);
            }
        });
        jPanel1.add(FechPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 150, 30));

        ArsPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArsPacActionPerformed(evt);
            }
        });
        jPanel1.add(ArsPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 150, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("ARS:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Inicio obj = new Inicio();
           obj.setVisible(true);
           dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ApePacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApePacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApePacActionPerformed

    private void CedPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedPacActionPerformed

    private void CelPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelPacActionPerformed

    private void TelPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelPacActionPerformed

    private void DirrPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirrPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DirrPacActionPerformed

    private void OcuPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcuPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OcuPacActionPerformed

    private void HisPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HisPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HisPacActionPerformed

    private void CodPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodPacActionPerformed

    private void NssPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NssPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NssPacActionPerformed

    private void EmePacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmePacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmePacActionPerformed

    private void NomPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomPacActionPerformed

    private void GuaPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuaPacActionPerformed
        // TODO add your handling code here:
        
        DbConexion obj = new DbConexion();
        
        Connection Conexion = null;
        
        try{
            
            Conexion = obj.getConexion();
            ps = Conexion.prepareStatement("INSERT INTO PACIENTES(Codigo,Cedula,Ars,NSS,Nombres,Apellidos,Telefono,Celular,FechaNacimiento,Historia,Sexo,Tipificacion,Direccion,Ocupacion,Emergencia) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,CodPac.getText());
           ps.setString(2,CedPac.getText());
            ps.setString(3,NssPac.getText());
            ps.setString(4,ArsPac.getText());
            ps.setString(5,NomPac.getText());
            ps.setString(6,ApePac.getText());
            ps.setString(7,TelPac.getText());
            ps.setString(8,CelPac.getText());
            ps.setString(9,FechPac.getText());
            ps.setString(10,HisPac.getText());
            ps.setString(11,SexPac.getSelectedItem().toString());
            ps.setString(12,TipPac.getSelectedItem().toString());
            ps.setString(13,DirrPac.getText());
            ps.setString(14,OcuPac.getText());
            ps.setString(15,EmePac.getText());
            
           int res =  ps.executeUpdate();
           
           if(res>0){
               
               JOptionPane.showMessageDialog(null, "DATOS GUARDADOS. ");
               Limpiar();
               
           }else{
               JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR. ");
           }
            
            Conexion.close();
            
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
        
    }//GEN-LAST:event_GuaPacActionPerformed

    private void FechPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechPacActionPerformed

    private void ArsPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArsPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArsPacActionPerformed

    private void EdiPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdiPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdiPacActionPerformed

    private void ConPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConPacActionPerformed
        // TODO add your handling code here:
        
         Connection Conexion = null;
         DbConexion obj = new DbConexion();
         
        try{

            Conexion = obj.getConexion();

            ps = Conexion.prepareStatement("SELECT *FROM PACIENTES WHERE Codigo = ?");
            ps.setString(1, CodPac.getText());
            Res = ps.executeQuery();

            if(Res.next()){

                IDpac.setText(Res.getString("idPacientes"));
                CodPac.setText(Res.getString("Codigo"));
                CedPac.setText(Res.getString("Cedula"));
                ArsPac.setText(Res.getString("Ars"));
                NssPac.setText(Res.getString("NSS"));
                NomPac.setText(Res.getString("Nombres"));
                ApePac.setText(Res.getString("Apellidos"));
                TelPac.setText(Res.getString("Telefono"));
                CelPac.setText(Res.getString("Celular"));
                HisPac.setText(Res.getString("Historia"));
                FechPac.setText(Res.getString("FechaNacimiento"));
                SexPac.setSelectedItem(Res.getString("Sexo"));
                TipPac.setSelectedItem(Res.getString("Tipificacion"));
                DirrPac.setText(Res.getString("Direccion"));
                OcuPac.setText(Res.getString("Ocupacion"));
                EmePac.setText(Res.getString("Emergencia"));

            }else{

                JOptionPane.showMessageDialog(null, "No existe paciente asociado a ese codigo");

            }

        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }

        
        
        
        
    }//GEN-LAST:event_ConPacActionPerformed

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
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApePac;
    private javax.swing.JTextField ArsPac;
    private javax.swing.JTextField CedPac;
    private javax.swing.JTextField CelPac;
    private javax.swing.JTextField CodPac;
    private javax.swing.JButton ConPac;
    private javax.swing.JTextField DirrPac;
    private javax.swing.JButton EdiPac;
    private javax.swing.JTextField EmePac;
    private javax.swing.JTextField FechPac;
    private javax.swing.JButton GuaPac;
    private javax.swing.JTextField HisPac;
    private javax.swing.JTextField IDpac;
    private javax.swing.JTextField NomPac;
    private javax.swing.JTextField NssPac;
    private javax.swing.JTextField OcuPac;
    private javax.swing.JComboBox<String> SexPac;
    private javax.swing.JTextField TelPac;
    private javax.swing.JComboBox<String> TipPac;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

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
public class Ars extends javax.swing.JFrame {

PreparedStatement ps;
ResultSet Res;
    /**
     * Creates new form Paciente
     */
    public Ars() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ApeArs = new javax.swing.JTextField();
        CedArs = new javax.swing.JTextField();
        CelArs = new javax.swing.JTextField();
        TelArs = new javax.swing.JTextField();
        FechNac = new javax.swing.JTextField();
        OcuArs = new javax.swing.JTextField();
        TipPlan = new javax.swing.JTextField();
        NomBus = new javax.swing.JTextField();
        NssBus = new javax.swing.JTextField();
        CobCon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NomArs = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CobArs = new javax.swing.JTextField();
        CobCli = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        SexArs = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CodArs = new javax.swing.JTextField();
        NumArs = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        BusArs = new javax.swing.JButton();
        IdArs = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ArsNom = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 57, -1));

        ApeArs.setEditable(false);
        ApeArs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApeArsActionPerformed(evt);
            }
        });
        jPanel1.add(ApeArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 150, 30));

        CedArs.setEditable(false);
        CedArs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedArsActionPerformed(evt);
            }
        });
        jPanel1.add(CedArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 150, 30));

        CelArs.setEditable(false);
        CelArs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelArsActionPerformed(evt);
            }
        });
        jPanel1.add(CelArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 150, 30));

        TelArs.setEditable(false);
        TelArs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelArsActionPerformed(evt);
            }
        });
        jPanel1.add(TelArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 150, 30));

        FechNac.setEditable(false);
        FechNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechNacActionPerformed(evt);
            }
        });
        jPanel1.add(FechNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 150, 30));

        OcuArs.setEditable(false);
        OcuArs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcuArsActionPerformed(evt);
            }
        });
        jPanel1.add(OcuArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 150, 30));

        TipPlan.setEditable(false);
        TipPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipPlanActionPerformed(evt);
            }
        });
        jPanel1.add(TipPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 150, 30));

        NomBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomBusActionPerformed(evt);
            }
        });
        jPanel1.add(NomBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 150, 30));

        NssBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NssBusActionPerformed(evt);
            }
        });
        jPanel1.add(NssBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 150, 30));

        CobCon.setEditable(false);
        CobCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobConActionPerformed(evt);
            }
        });
        jPanel1.add(CobCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 150, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cedula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 70, 20));

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
        jLabel8.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ARS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 80, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo Plan");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 60, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("NSS:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 60, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Cobertura Consultas");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 140, 20));

        NomArs.setEditable(false);
        NomArs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomArsActionPerformed(evt);
            }
        });
        jPanel1.add(NomArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 150, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ARS:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 50, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Cobertura Medicamentos");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 160, 20));

        CobArs.setEditable(false);
        CobArs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobArsActionPerformed(evt);
            }
        });
        jPanel1.add(CobArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 150, 30));

        CobCli.setEditable(false);
        CobCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobCliActionPerformed(evt);
            }
        });
        jPanel1.add(CobCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 150, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Cobertura Clinica");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 120, 20));

        SexArs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino" }));
        jPanel1.add(SexArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 140, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Codigo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 70, 20));

        CodArs.setEditable(false);
        CodArs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodArsActionPerformed(evt);
            }
        });
        jPanel1.add(CodArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 80, 30));

        NumArs.setEditable(false);
        NumArs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumArsActionPerformed(evt);
            }
        });
        jPanel1.add(NumArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 150, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("NSS:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 50, -1));

        BusArs.setText("Buscar");
        BusArs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusArsActionPerformed(evt);
            }
        });
        jPanel1.add(BusArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 110, 40));

        IdArs.setEditable(false);
        jPanel1.add(IdArs, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 50, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Nombre:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 70, 20));

        ArsNom.setEditable(false);
        ArsNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArsNomActionPerformed(evt);
            }
        });
        jPanel1.add(ArsNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 150, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Sexo:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 40, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CobCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CobCliActionPerformed

    private void CobArsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobArsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CobArsActionPerformed

    private void NomArsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomArsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomArsActionPerformed

    private void CobConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CobConActionPerformed

    private void NssBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NssBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NssBusActionPerformed

    private void NomBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomBusActionPerformed

    private void TipPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipPlanActionPerformed

    private void OcuArsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcuArsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OcuArsActionPerformed

    private void FechNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechNacActionPerformed

    private void TelArsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelArsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelArsActionPerformed

    private void CedArsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedArsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedArsActionPerformed

    private void ApeArsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApeArsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApeArsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio obj = new Inicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CodArsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodArsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodArsActionPerformed

    private void NumArsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumArsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumArsActionPerformed

    private void CelArsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelArsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelArsActionPerformed

    private void BusArsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusArsActionPerformed
        // TODO add your handling code here:
        
        Connection Conexion = null;
        DbConexion obj = new DbConexion();
         
        try{

            Conexion = obj.getConexion();

            ps = Conexion.prepareStatement("SELECT *FROM ARS WHERE  Cedula = ? OR Numero = ?");
            ps.setString(1, NomBus.getText());
            ps.setString(2, NssBus.getText());
            Res = ps.executeQuery();

            if(Res.next()){

                IdArs.setText(Res.getString("idArs"));
                CodArs.setText(Res.getString("Codigo"));
                ArsNom.setText(Res.getString("Nombre"));
                ApeArs.setText(Res.getString("Apellido"));
                CedArs.setText(Res.getString("Cedula"));
                CelArs.setText(Res.getString("Celular"));
                TelArs.setText(Res.getString("Telefono"));
                FechNac.setText(Res.getString("Fecha"));
                OcuArs.setText(Res.getString("Ocupacion"));
                SexArs.setSelectedItem(Res.getString("Sexo"));
                TipPlan.setText(Res.getString("Tipo"));
                NumArs.setText(Res.getString("Numero"));
                NomArs.setText(Res.getString("Ars"));
                CobArs.setText(Res.getString("CobMed"));
                CobCli.setText(Res.getString("CobClin"));
                CobCon.setText(Res.getString("CobCon"));

            }else{

                JOptionPane.showMessageDialog(null, "No existe paciente asociado a ese codigo");

            }

        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }

        
        
        
        
    }//GEN-LAST:event_BusArsActionPerformed

    private void ArsNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArsNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArsNomActionPerformed

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
            java.util.logging.Logger.getLogger(Ars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApeArs;
    private javax.swing.JTextField ArsNom;
    private javax.swing.JButton BusArs;
    private javax.swing.JTextField CedArs;
    private javax.swing.JTextField CelArs;
    private javax.swing.JTextField CobArs;
    private javax.swing.JTextField CobCli;
    private javax.swing.JTextField CobCon;
    private javax.swing.JTextField CodArs;
    private javax.swing.JTextField FechNac;
    private javax.swing.JTextField IdArs;
    private javax.swing.JTextField NomArs;
    private javax.swing.JTextField NomBus;
    private javax.swing.JTextField NssBus;
    private javax.swing.JTextField NumArs;
    private javax.swing.JTextField OcuArs;
    private javax.swing.JComboBox<String> SexArs;
    private javax.swing.JTextField TelArs;
    private javax.swing.JTextField TipPlan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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

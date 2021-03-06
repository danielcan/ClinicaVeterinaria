/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.view;

import ceutec.view.internal.Cita;
import ceutec.view.internal.Duenio;
import ceutec.view.internal.Medico;
import ceutec.view.internal.Paciente;

import ceutec.view.internal.Reporte;
import ceutec.view.internal.VentanaPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PC-lite
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        jDesktopPane1.removeAll();
        VentanaPrincipal pr = new VentanaPrincipal();
        pr.setVisible(true);
        jDesktopPane1.add(pr);  
        
      //  setColor(PBDuenio); 
       // ind_1.setOpaque(true);
        resetColor(new JPanel[]{PBDuenio,PBPaciente,PBMedico,PBCita,PBReporte});
    //    jProgressBar1.setValue(50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSMTextFullBeanInfo1 = new rojeru_san.RSMTextFullBeanInfo();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PBDuenio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PBPaciente = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PBMedico = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PBCita = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PBReporte = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PBReporte1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPBarra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 685, -1, -1));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PBDuenio.setBackground(new java.awt.Color(54, 33, 89));
        PBDuenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PBDuenioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PBDuenioMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceutec/icono/icons8_male_user_48px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Due??o");

        javax.swing.GroupLayout PBDuenioLayout = new javax.swing.GroupLayout(PBDuenio);
        PBDuenio.setLayout(PBDuenioLayout);
        PBDuenioLayout.setHorizontalGroup(
            PBDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBDuenioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        PBDuenioLayout.setVerticalGroup(
            PBDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBDuenioLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(PBDuenioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(PBDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 50));

        PBPaciente.setBackground(new java.awt.Color(54, 33, 89));
        PBPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PBPacienteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PBPacienteMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceutec/icono/icons8_dog_48px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Paciente");

        javax.swing.GroupLayout PBPacienteLayout = new javax.swing.GroupLayout(PBPaciente);
        PBPaciente.setLayout(PBPacienteLayout);
        PBPacienteLayout.setHorizontalGroup(
            PBPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        PBPacienteLayout.setVerticalGroup(
            PBPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBPacienteLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PBPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(PBPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 210, 40));

        PBMedico.setBackground(new java.awt.Color(54, 33, 89));
        PBMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PBMedicoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PBMedicoMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceutec/icono/icons8_doctor_male_30px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Medico");

        javax.swing.GroupLayout PBMedicoLayout = new javax.swing.GroupLayout(PBMedico);
        PBMedico.setLayout(PBMedicoLayout);
        PBMedicoLayout.setHorizontalGroup(
            PBMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBMedicoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        PBMedicoLayout.setVerticalGroup(
            PBMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBMedicoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(PBMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(PBMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, 40));

        PBCita.setBackground(new java.awt.Color(54, 33, 89));
        PBCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PBCitaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PBCitaMousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceutec/icono/icons8_test_passed_40px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cita");

        javax.swing.GroupLayout PBCitaLayout = new javax.swing.GroupLayout(PBCita);
        PBCita.setLayout(PBCitaLayout);
        PBCitaLayout.setHorizontalGroup(
            PBCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        PBCitaLayout.setVerticalGroup(
            PBCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBCitaLayout.createSequentialGroup()
                .addGroup(PBCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel2.add(PBCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 97, 32));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DANIEL");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 40));

        PBReporte.setBackground(new java.awt.Color(54, 33, 89));
        PBReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PBReporteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PBReporteMousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceutec/icono/icons8_account_48px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Auditoria");

        javax.swing.GroupLayout PBReporteLayout = new javax.swing.GroupLayout(PBReporte);
        PBReporte.setLayout(PBReporteLayout);
        PBReporteLayout.setHorizontalGroup(
            PBReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        PBReporteLayout.setVerticalGroup(
            PBReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBReporteLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(PBReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(PBReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 210, -1));

        PBReporte1.setBackground(new java.awt.Color(54, 33, 89));
        PBReporte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PBReporte1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PBReporte1MousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceutec/icono/icons8_account_48px.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Reporte");

        javax.swing.GroupLayout PBReporte1Layout = new javax.swing.GroupLayout(PBReporte1);
        PBReporte1.setLayout(PBReporte1Layout);
        PBReporte1Layout.setHorizontalGroup(
            PBReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBReporte1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        PBReporte1Layout.setVerticalGroup(
            PBReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBReporte1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(PBReporte1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(PBReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 210, 680));

        jPBarra.setBackground(new java.awt.Color(110, 65, 202));
        jPBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jPBarra.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 0, -1, -1));

        getContentPane().add(jPBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 850, 110));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(808, Short.MAX_VALUE)
                .addComponent(btnCerrar))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 840, 40));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 850, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
      int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del Login","Exit",dialog);
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    /**
     * 
     * @param evt 
     */
    private void PBDuenioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBDuenioMouseClicked
        // TODO add your handling code here:
       jDesktopPane1.removeAll();
        Duenio du = new Duenio();
        du.setVisible(true);
        jDesktopPane1.add(du);
    }//GEN-LAST:event_PBDuenioMouseClicked

    private void PBPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBPacienteMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Paciente pc = new Paciente();
        pc.setVisible(true);
        jDesktopPane1.add(pc);
    }//GEN-LAST:event_PBPacienteMouseClicked

    private void PBMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBMedicoMouseClicked
        // TODO add your handling code here:
         jDesktopPane1.removeAll();
        Medico md = new Medico();
        md.setVisible(true);
        jDesktopPane1.add(md);
    }//GEN-LAST:event_PBMedicoMouseClicked

    private void PBCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBCitaMouseClicked
        // TODO add your handling code here:
         jDesktopPane1.removeAll();
        Cita ct = new Cita();
        ct.setVisible(true);
        jDesktopPane1.add(ct);
    }//GEN-LAST:event_PBCitaMouseClicked

    private void PBDuenioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBDuenioMousePressed
        // TODO add your handling code here:
         setColor(PBDuenio); 
        resetColor(new JPanel[]{PBPaciente,PBMedico,PBCita,PBReporte});  
    }//GEN-LAST:event_PBDuenioMousePressed

    private void PBPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBPacienteMousePressed
        // TODO add your handling code here:
         setColor(PBPaciente); 
        resetColor(new JPanel[]{PBDuenio,PBMedico,PBCita,PBReporte});
    }//GEN-LAST:event_PBPacienteMousePressed

    private void PBMedicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBMedicoMousePressed
        // TODO add your handling code here:
        setColor(PBMedico); 
        resetColor(new JPanel[]{PBDuenio,PBPaciente,PBCita,PBReporte});
    }//GEN-LAST:event_PBMedicoMousePressed

    private void PBCitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBCitaMousePressed
        // TODO add your handling code here:
        setColor(PBCita); 
        resetColor(new JPanel[]{PBDuenio,PBPaciente,PBMedico,PBReporte});
    }//GEN-LAST:event_PBCitaMousePressed

    private void PBReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBReporteMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Reporte rp = new Reporte();
        rp.setVisible(true);
        jDesktopPane1.add(rp);
    }//GEN-LAST:event_PBReporteMouseClicked

    private void PBReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBReporteMousePressed
        // TODO add your handling code here:
         setColor(PBReporte); 
        resetColor(new JPanel[]{PBDuenio,PBPaciente,PBCita,PBMedico});
    }//GEN-LAST:event_PBReporteMousePressed

    private void PBReporte1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBReporte1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PBReporte1MouseClicked

    private void PBReporte1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBReporte1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBReporte1MousePressed

     private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(110,89,222));
    }
    
    private void resetColor(JPanel [] pane)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(54,33,89)); 
        }   
    }
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PBCita;
    private javax.swing.JPanel PBDuenio;
    private javax.swing.JPanel PBMedico;
    private javax.swing.JPanel PBPaciente;
    private javax.swing.JPanel PBReporte;
    private javax.swing.JPanel PBReporte1;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPBarra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private rojeru_san.RSMTextFullBeanInfo rSMTextFullBeanInfo1;
    // End of variables declaration//GEN-END:variables
  
}

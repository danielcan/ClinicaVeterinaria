/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.view;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-lite
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        animationClass1 = new AppPackage.AnimationClass();
        rSButtonRoundBeanInfo1 = new rojerusan.RSButtonRoundBeanInfo();
        rSButtonTriangleBeanInfo1 = new rojerusan.RSButtonTriangleBeanInfo();
        rSButtonRoundBeanInfo2 = new rojerusan.RSButtonRoundBeanInfo();
        rSButtonMetroBeanInfo1 = new rojerusan.RSButtonMetroBeanInfo();
        rSButtonIconIBeanInfo1 = new rojerusan.RSButtonIconIBeanInfo();
        rSButtonIconDBeanInfo1 = new rojerusan.RSButtonIconDBeanInfo();
        rSPopuMenu1 = new rojerusan.RSPopuMenu();
        evaluatorArc2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorArc2D();
        evaluatorColor1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorColor();
        progressCircleUI11 = new necesario.ProgressCircleUI1();
        rSButtonCircleIconBeanInfo1 = new rojerusan.RSButtonCircleIconBeanInfo();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        materialColor1 = new rojeru_san.efectos.MaterialColor();
        materialIcons1 = new rojeru_san.efectos.MaterialIcons();
        roboto1 = new rojeru_san.efectos.Roboto();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BtnIngresar = new rojerusan.RSButtonRound();
        rSMetroTextFullPlaceHolder1 = new rojerusan.RSMetroTextFullPlaceHolder();
        rSMetroTextPassPlaceHolderView2 = new rojerusan.RSMetroTextPassPlaceHolderView();
        rSLabelCircleImage1 = new rojerusan.RSLabelCircleImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnCerra = new javax.swing.JLabel();

        rSButtonMaterialIconOne1.setText("rSButtonMaterialIconOne1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnIngresar.setBackground(new java.awt.Color(110, 89, 222));
        BtnIngresar.setText("Ingresar");
        BtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
        });
        jPanel2.add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 180, 30));

        rSMetroTextFullPlaceHolder1.setForeground(new java.awt.Color(110, 89, 222));
        rSMetroTextFullPlaceHolder1.setBorderColor(new java.awt.Color(110, 89, 222));
        jPanel2.add(rSMetroTextFullPlaceHolder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        rSMetroTextPassPlaceHolderView2.setForeground(new java.awt.Color(110, 89, 222));
        rSMetroTextPassPlaceHolderView2.setBorderColor(new java.awt.Color(110, 89, 222));
        jPanel2.add(rSMetroTextPassPlaceHolderView2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        rSLabelCircleImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1200px-User_icon_2.svg.png"))); // NOI18N
        rSLabelCircleImage1.setColorBorde(new java.awt.Color(110, 89, 222));
        jPanel2.add(rSLabelCircleImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(110, 89, 252));
        jLabel1.setText("Contraseña:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 89, 252));
        jLabel2.setText("Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        BtnCerra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        BtnCerra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCerraMouseClicked(evt);
            }
        });
        jPanel2.add(BtnCerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerraMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del Login","Exit",dialog);
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_BtnCerraMouseClicked

    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseClicked
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnIngresarMouseClicked

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
                if ("Windows".equals(info.getName())) {//modificar el Ninbus a Windows
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnCerra;
    private rojerusan.RSButtonRound BtnIngresar;
    private AppPackage.AnimationClass animationClass1;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorArc2D evaluatorArc2D1;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorColor evaluatorColor1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.efectos.MaterialColor materialColor1;
    private rojeru_san.efectos.MaterialIcons materialIcons1;
    private necesario.ProgressCircleUI1 progressCircleUI11;
    private rojerusan.RSButtonCircleIconBeanInfo rSButtonCircleIconBeanInfo1;
    private rojerusan.RSButtonIconDBeanInfo rSButtonIconDBeanInfo1;
    private rojerusan.RSButtonIconIBeanInfo rSButtonIconIBeanInfo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private rojerusan.RSButtonMetroBeanInfo rSButtonMetroBeanInfo1;
    private rojerusan.RSButtonRoundBeanInfo rSButtonRoundBeanInfo1;
    private rojerusan.RSButtonRoundBeanInfo rSButtonRoundBeanInfo2;
    private rojerusan.RSButtonTriangleBeanInfo rSButtonTriangleBeanInfo1;
    private rojerusan.RSLabelCircleImage rSLabelCircleImage1;
    private rojerusan.RSMetroTextFullPlaceHolder rSMetroTextFullPlaceHolder1;
    private rojerusan.RSMetroTextPassPlaceHolderView rSMetroTextPassPlaceHolderView2;
    private rojerusan.RSPopuMenu rSPopuMenu1;
    private rojeru_san.efectos.Roboto roboto1;
    // End of variables declaration//GEN-END:variables
}
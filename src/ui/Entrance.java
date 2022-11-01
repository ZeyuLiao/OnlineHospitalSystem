/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.*;
import static java.awt.Image.SCALE_DEFAULT;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import model.Patient;

/**
 *
 * @author ZeyuLiao
 */
public class Entrance extends javax.swing.JFrame {

    /**
     * Creates new form Entrance
     */
    
//    public void theme(){
//        SwingTheme swingTheme=new SwingTheme();
//        swingTheme.init();
//        
//    }
    
    public Entrance() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabelSlogan = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxUserType = new javax.swing.JComboBox<>();
        jTextFieldAccount = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OnlineHospitalSystem");
        setLocation(new java.awt.Point(300, 150));

        jPanel2.setBackground(new java.awt.Color(149, 177, 182));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabelSlogan.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabelSlogan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSlogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSlogan.setText("SERVE ANY TIME");
        jPanel2.add(jLabelSlogan);
        jLabelSlogan.setBounds(120, 540, 280, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("User type");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 228, 93, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Account");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 287, 93, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 348, 93, 17);

        jComboBoxUserType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctors", "Hospital Admins", "Community Admin" }));
        jPanel1.add(jComboBoxUserType);
        jComboBoxUserType.setBounds(201, 225, 190, 23);

        jTextFieldAccount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldAccount);
        jTextFieldAccount.setBounds(201, 284, 190, 23);

        jPasswordFieldPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPasswordFieldPassword.setText("input ur code here");
        jPanel1.add(jPasswordFieldPassword);
        jPasswordFieldPassword.setBounds(201, 345, 190, 23);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(169, 445, 185, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Don't have account? Sign in here!");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(169, 514, 185, 17);
        jPanel1.add(jLabelLogo);
        jLabelLogo.setBounds(80, 90, 340, 70);
        ImageIcon logoHospital = new ImageIcon("src//image//Logo.png");
        logoHospital.setImage(logoHospital.getImage().getScaledInstance(jLabelLogo.getWidth(),jLabelLogo.getHeight(),SCALE_DEFAULT));
        jLabelLogo.setIcon(logoHospital);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(530, 10, 460, 580);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 540);
        ImageIcon bgDoctor = new ImageIcon("src//image//doctors.png");
        bgDoctor.setImage(bgDoctor.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),SCALE_DEFAULT));
        jLabel1.setIcon(bgDoctor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            MainMenu menu = new MainMenu();
            System.out.println(jComboBoxUserType.getSelectedIndex());
            menu.MainMenu(jComboBoxUserType.getSelectedIndex(),Integer.parseInt(jTextFieldAccount.getText()));
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(Entrance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
        // try{
        //     UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        //     }catch(Exception e){
        //     System.out.println("主题出错");
        //     e.printStackTrace();
        //     }
        // /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrance().setVisible(true);
            }
        });
        UserDao ud = new UserDao();
        ud.test();


        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSlogan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldAccount;
    // End of variables declaration//GEN-END:variables
}

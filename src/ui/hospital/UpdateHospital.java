/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.hospital;

import dao.CommunityDao;
import dao.HospitalDao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Hospital;

/**
 *
 * @author ziyu
 */
public class UpdateHospital extends javax.swing.JFrame {

    /**
     * Creates new form UpdateHospital
     */
    
    Hospital hospital;
    HospitalDao hDao;
    ArrayList<String> communityNames;
    public UpdateHospital(int hospitalId) throws Exception {
        CommunityDao communityDao= new CommunityDao();
        communityNames = communityDao.getCommunityNames();
        initComponents();
        
        //加一个刷新community combobox 
        hDao = new HospitalDao();
        hospital = hDao.getHospitalById(hospitalId);
        txtUpdateHName.setText(hospital.getHospitalName());
        cmbCommunity.setSelectedItem(hospital.getCommunity()); //目的：显示医院当前的community情况
        
        
        this.setVisible(true);
        
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHosName = new javax.swing.JLabel();
        lblBelongCom = new javax.swing.JLabel();
        txtUpdateHName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        String[] str = new String[communityNames.size()];
        int index = 0;
        for(String s: communityNames){
            str[index++] = s;
        }
        cmbCommunity = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHosName.setText("Hospital Name:");

        lblBelongCom.setText("Belong to community:");

        txtUpdateHName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateHNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Update Hospital Information");
        jLabel3.setToolTipText("");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmbCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(str));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBelongCom)
                            .addComponent(lblHosName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUpdateHName, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(cmbCommunity, 0, 1, Short.MAX_VALUE))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHosName)
                    .addComponent(txtUpdateHName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBelongCom)
                    .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String hName = txtUpdateHName.getText();
        String belongCommunity = cmbCommunity.getSelectedItem().toString();
        
        if(hName.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter a valid name");
        }
        hospital.setHospitalName(hName);
        try {
            hDao.updateHospital(hospital);
            JOptionPane.showMessageDialog(this,"Success");
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(UpdateHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUpdateHNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateHNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateHNameActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCommunity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBelongCom;
    private javax.swing.JLabel lblHosName;
    private javax.swing.JTextField txtUpdateHName;
    // End of variables declaration//GEN-END:variables
}

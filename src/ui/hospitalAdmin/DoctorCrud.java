/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospitalAdmin;

import dao.DoctorDao;
import ui.patient.*;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import dao.PatientDao;
import static java.awt.Image.SCALE_DEFAULT;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Doctor;


/**
 *
 * @author Ruolin 
 */
public class DoctorCrud extends javax.swing.JPanel {

    /**
     * Creates new form HomePage
     */
    DoctorDao dDao;
    public DoctorCrud() throws Exception{
        this.dDao = new DoctorDao();
        initComponents();
        showTable();
    }
    private Object[] addTableRow(Object[] row,Doctor d){
        row[0] = d.getDoctorID();
        row[1] = d.getName();
        row[2] = d.getPhoneNumber();
        row[3] = d.getDepartment();
        row[4] = d.getHospitalName();
        return row;
    }
    private void showTable() throws Exception{
        DefaultTableModel model = (DefaultTableModel)jTableDoctor.getModel();
        model.setRowCount(0);
        
        ArrayList<Doctor> dList = dDao.getAllDoctor();
        
        for(Doctor d:dList){
            Object[] row = new Object[10];
            addTableRow(row,d);
            
            model.addRow(row);     
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDoctor = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jButtonView = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jPanelRight = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelHospitalName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelPhoto = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelDepartment = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jButtonRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(149, 177, 182));
        setPreferredSize(new java.awt.Dimension(968, 429));

        jTableDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DoctorID", "Name", "PhoneNumber", "Department", "Hospital Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDoctor);

        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_add.png"))); // NOI18N
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jComboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Name", "DOB", "Phone Number", "Community Name" }));

        jButtonView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_view.png"))); // NOI18N
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_delete.png"))); // NOI18N
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_update.png"))); // NOI18N
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_search.png"))); // NOI18N
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jPanelRight.setBackground(new java.awt.Color(149, 177, 182));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Hospital Name:");

        jLabelHospitalName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Phone Number: ");

        jLabelPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelHospitalName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 179, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabelPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabelPhoto);
        jLabelPhoto.setBounds(10, 20, 180, 170);

        jLabelName.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelName.setText("Name");
        jPanel2.add(jLabelName);
        jLabelName.setBounds(10, 210, 180, 40);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Doctor Id:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Department:");

        jLabelDepartment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout jPanelRightLayout = new javax.swing.GroupLayout(jPanelRight);
        jPanelRight.setLayout(jPanelRightLayout);
        jPanelRightLayout.setHorizontalGroup(
            jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRightLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRightLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelRightLayout.setVerticalGroup(
            jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_refresh.png"))); // NOI18N
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelRight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 5, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        AddDoctor add = new AddDoctor();
//        add.setBounds(100, 100, 750, 500);
        add.setVisible(true);
        try {
            showTable();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jTableDoctor.getSelectedRow();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this,"Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)jTableDoctor.getModel();
        int doctorID = Integer.parseInt(model.getValueAt(selectedIndex,0).toString());
        try{
            Doctor d = dDao.getDoctorById(doctorID);
            jLabelId.setText(d.getDoctorID()+"");
            jLabelName.setText(d.getName());
            jLabelPhoneNumber.setText(d.getPhoneNumber());
            jLabelDepartment.setText(d.getDepartment());
            jLabelHospitalName.setText(d.getHospitalName());
            ImageIcon photo = new ImageIcon(d.getPhotoAddress());
            photo.setImage(photo.getImage().getScaledInstance(jLabelPhoto.getWidth(),jLabelPhoto.getHeight(),SCALE_DEFAULT));
            jLabelPhoto.setIcon(photo);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jTableDoctor.getSelectedRow();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)jTableDoctor.getModel();
        int doctorID = Integer.parseInt(model.getValueAt(selectedIndex,0).toString());
        
        int n = JOptionPane.showConfirmDialog(null, "Confirm to delete Doctor "+doctorID + "account?", "",JOptionPane.YES_NO_OPTION);//0/1
        try{
            if(n==0)
                dDao.deleteDoctor(doctorID);
            showTable();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jTableDoctor.getSelectedRow();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this,"Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)jTableDoctor.getModel();
        int docterId = Integer.parseInt(model.getValueAt(selectedIndex,0).toString());
        try {
            UpdateDoctor up = new UpdateDoctor(docterId);
            up.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        
        String keyword = jComboBoxSearch.getSelectedItem().toString();
        String input = JOptionPane.showInputDialog("Please input a value");
        ArrayList<Doctor> dList = new ArrayList<>();  
        try{
            switch(keyword){
                case "Id": { 
                    Doctor d = dDao.getDoctorById(Integer.parseInt(input)); 
                    dList.add(d); 
                    break;}
                case "Name":{ 
                    dList = dDao.getDoctorByHospitalName(input);  
                    break;}
                case "DOB":{ 
                    dList = dDao.getDoctorByDepartment(input);
                    break;}
                case "Community Name":{ 
                    dList = dDao.getDoctorByHospitalName(input);
                    break;}

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        DefaultTableModel model = (DefaultTableModel)jTableDoctor.getModel();
        
        model.setRowCount(0);
        
        for(Doctor d:dList){
            Object[] row = new Object[10];
            addTableRow(row,d);
            
            model.addRow(row);     
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        try {
            // TODO add your handling code here:
            showTable();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDepartment;
    private javax.swing.JLabel jLabelHospitalName;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelRight;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDoctor;
    // End of variables declaration//GEN-END:variables
}

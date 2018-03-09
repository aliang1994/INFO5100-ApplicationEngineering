/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.*;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Wenqing
 */
public class ViewAirlinerPanel extends javax.swing.JPanel {
    private MasterFlightSchedule ms;
    private AirlinerDirectory ad;
    private CustomerDirectory cd;
    private JPanel CardPanel;
    private Airliner air;

    /**
     * Creates new form ViewAirlinerPanel
     */
    
    public ViewAirlinerPanel(MasterFlightSchedule ms, AirlinerDirectory ad, CustomerDirectory cd, JPanel CardPanel, Airliner air) {
        this.ms = ms;
        this.ad = ad;
        this.cd = cd;
        this.CardPanel = CardPanel;
        this.air = air;
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DateTxt = new javax.swing.JTextField();
        NameTxt = new javax.swing.JTextField();
        UpdateBut = new javax.swing.JButton();
        SaveBut = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();

        jLabel3.setText("Date Created:");

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setText("View Airliner");

        jLabel2.setText("Name of Airliner:");

        DateTxt.setEnabled(false);

        NameTxt.setEnabled(false);

        UpdateBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        UpdateBut.setText("Update");
        UpdateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButActionPerformed(evt);
            }
        });

        SaveBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SaveBut.setText("Save");
        SaveBut.setEnabled(false);
        SaveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButActionPerformed(evt);
            }
        });

        BackBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BackBut.setText("<< Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(UpdateBut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(SaveBut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBut)
                    .addComponent(SaveBut)
                    .addComponent(BackBut))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        CardPanel.remove(this);
        CardLayout layout = (CardLayout) CardPanel.getLayout();
        layout.previous(CardPanel);
    }//GEN-LAST:event_BackButActionPerformed

    private void UpdateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButActionPerformed
        NameTxt.setEditable(true);
        NameTxt.setEnabled(true);
        SaveBut.setEnabled(true);
    }//GEN-LAST:event_UpdateButActionPerformed

    private void SaveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButActionPerformed
        air.setName(NameTxt.getText());
        DateTxt.setText(air.getDateCreated().toString());
        JOptionPane.showMessageDialog(null,"Airliner Information Updated");
        
        NameTxt.setEditable(false);
        NameTxt.setEnabled(false);
        SaveBut.setEnabled(false);
    }//GEN-LAST:event_SaveButActionPerformed

    public void setNameTxt(String s){
        NameTxt.setText(s);
    }
    
    public void setDateTxt(Date d){
        DateTxt.setText(d.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JTextField DateTxt;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JButton SaveBut;
    private javax.swing.JButton UpdateBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
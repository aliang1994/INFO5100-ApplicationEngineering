/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wenqing
 */
public class ManageAccount extends javax.swing.JPanel {
    private JPanel CardContainer;
    private AccountDirectory ad;

    /**
     * Creates new form ManageAccount
     */
    public ManageAccount(JPanel Container, AccountDirectory ad) {
        initComponents();
        this.CardContainer = Container;
        this.ad = ad;
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)accountTable.getModel();
        dtm.setRowCount(0);
        for(Account acc: ad.getAd()){
            Object[] row = new Object[4];
            row[0]=acc;
            row[1]=acc.getRoutingNo();
            row[2]=acc.getAccountNo();
            row[3]=acc.getBalance();
            dtm.addRow(row);
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
        accountTable = new javax.swing.JTable();
        searchBut = new javax.swing.JButton();
        ViewBut = new javax.swing.JButton();
        DeleteBut = new javax.swing.JButton();
        accNoTxt = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();

        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "bank name", "routing", "checking", "balance"
            }
        ));
        jScrollPane1.setViewportView(accountTable);

        searchBut.setText("Search");
        searchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButActionPerformed(evt);
            }
        });

        ViewBut.setText("View Details");
        ViewBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButActionPerformed(evt);
            }
        });

        DeleteBut.setText("Delete Account");
        DeleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButActionPerformed(evt);
            }
        });

        backbutton.setText("<< back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(searchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accNoTxt)))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backbutton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DeleteBut)
                                .addGap(18, 18, 18)
                                .addComponent(ViewBut, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBut)
                    .addComponent(accNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBut)
                    .addComponent(ViewBut))
                .addGap(32, 32, 32)
                .addComponent(backbutton)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButActionPerformed
        Account res = ad.searchAccount(accNoTxt.getText());
        if(res==null){
            JOptionPane.showMessageDialog(null,"Account does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            ViewAccountPanel vac = new ViewAccountPanel(CardContainer, res);
            CardContainer.add("ViewAccountPanel",vac);
            CardLayout layout = (CardLayout) CardContainer.getLayout();
            layout.next(CardContainer);
        }
    }//GEN-LAST:event_searchButActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
         CardContainer.remove(this);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.previous(CardContainer);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void DeleteButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButActionPerformed
        int sl = accountTable.getSelectedRow();
        if(sl<0){
            JOptionPane.showMessageDialog(null,"Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
            
        }
        else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete it?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Account acc = (Account) accountTable.getValueAt(sl, 0);
                ad.deleteAcccount(acc);
                populateTable();
                
            }
            
        }
    }//GEN-LAST:event_DeleteButActionPerformed

    private void ViewButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButActionPerformed
        int sl = accountTable.getSelectedRow();
        if(sl<0){
            JOptionPane.showMessageDialog(null,"Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
                      
        }
        else{
            Account acc = (Account) accountTable.getValueAt(sl, 0);
            ViewAccountPanel vac = new ViewAccountPanel(CardContainer, acc);
            CardContainer.add("ViewAccountPanel",vac);
            CardLayout layout = (CardLayout) CardContainer.getLayout();
            layout.next(CardContainer);      
        }
    }//GEN-LAST:event_ViewButActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBut;
    private javax.swing.JButton ViewBut;
    private javax.swing.JTextField accNoTxt;
    private javax.swing.JTable accountTable;
    private javax.swing.JButton backbutton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBut;
    // End of variables declaration//GEN-END:variables
}
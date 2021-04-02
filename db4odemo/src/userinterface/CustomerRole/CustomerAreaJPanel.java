/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginJPanel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
      
        this.userAccount = account;
        this.ecosystem = ecosystem;
        ecosystem = dB4OUtil.retrieveSystem();
        //valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        LeftJPanel = new javax.swing.JPanel();
        Placeorderbtn = new javax.swing.JButton();
        Vieworderbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        RightJPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        LeftJPanel.setBackground(new java.awt.Color(255, 204, 204));

        Placeorderbtn.setText("Place Order");
        Placeorderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceorderbtnActionPerformed(evt);
            }
        });

        Vieworderbtn.setText("View Order");
        Vieworderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VieworderbtnActionPerformed(evt);
            }
        });

        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftJPanelLayout = new javax.swing.GroupLayout(LeftJPanel);
        LeftJPanel.setLayout(LeftJPanelLayout);
        LeftJPanelLayout.setHorizontalGroup(
            LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Vieworderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Placeorderbtn)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LeftJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Placeorderbtn, Vieworderbtn, jButton1});

        LeftJPanelLayout.setVerticalGroup(
            LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftJPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(Placeorderbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Vieworderbtn)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(LeftJPanel);

        RightJPanel.setBackground(new java.awt.Color(255, 102, 102));
        RightJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(RightJPanel);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceorderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceorderbtnActionPerformed
        // TODO add your handling code here:
        PlaceOrder placeOrder = new PlaceOrder(RightJPanel, userAccount, ecosystem);
        RightJPanel.add("PlaceOrder", placeOrder);
        CardLayout layout = (CardLayout) RightJPanel.getLayout();
        layout.next(RightJPanel);
    }//GEN-LAST:event_PlaceorderbtnActionPerformed

    private void VieworderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VieworderbtnActionPerformed
        // TODO add your handling code here:
        ViewOrder orderStatus = new ViewOrder(RightJPanel, ecosystem, userAccount);
        RightJPanel.add("ViewOrder", orderStatus);
        CardLayout layout = (CardLayout)RightJPanel.getLayout();
        layout.next(RightJPanel);
    }//GEN-LAST:event_VieworderbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(ecosystem);
         LoginJPanel loginPanel = new LoginJPanel(userProcessContainer,ecosystem);
        userProcessContainer.add("LoginJPanel", loginPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftJPanel;
    private javax.swing.JButton Placeorderbtn;
    private javax.swing.JPanel RightJPanel;
    private javax.swing.JButton Vieworderbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}

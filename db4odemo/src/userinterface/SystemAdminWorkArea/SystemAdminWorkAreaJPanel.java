/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import userinterface.LoginJPanel;
import userinterface.MainJFrame;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        ecosystem = dB4OUtil.retrieveSystem();
        //populateTree();
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
        jPanel3 = new javax.swing.JPanel();
        deliverypplbtn = new javax.swing.JButton();
        customersbtn = new javax.swing.JButton();
        restuarantsbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        RightPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deliverypplbtn.setText("Delivery People");
        deliverypplbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverypplbtnActionPerformed(evt);
            }
        });
        jPanel3.add(deliverypplbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 120, -1));

        customersbtn.setText("Customers");
        customersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersbtnActionPerformed(evt);
            }
        });
        jPanel3.add(customersbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));

        restuarantsbtn.setText("Restuarants");
        restuarantsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restuarantsbtnActionPerformed(evt);
            }
        });
        jPanel3.add(restuarantsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 120, -1));

        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 120, -1));

        jSplitPane1.setLeftComponent(jPanel3);

        RightPanel.setBackground(new java.awt.Color(255, 102, 102));
        RightPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(RightPanel);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageCustomer() {
        userinterface.SystemAdminWorkArea.ManageCustomerJPanel ManageCustomer = new userinterface.SystemAdminWorkArea.ManageCustomerJPanel(RightPanel,ecosystem);
        RightPanel.add("ManageCustomerJPanel",ManageCustomer);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.next(RightPanel);
    }
    private void ManageDeliveryPeople() {
        userinterface.SystemAdminWorkArea.ManageDeliveryJPanel ManageDP = new userinterface.SystemAdminWorkArea.ManageDeliveryJPanel(RightPanel,ecosystem);
        RightPanel.add("ManageDeliveryJPanel",ManageDP);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.next(RightPanel);
    }
    private void ManageRestuarants() {
        userinterface.SystemAdminWorkArea.ManageRestuarants mr = new userinterface.SystemAdminWorkArea.ManageRestuarants(RightPanel,ecosystem);
        RightPanel.add("ManageRestuarants",mr);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.next(RightPanel);
    }
    private void customersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersbtnActionPerformed
        // TODO add your handling code here:
        ManageCustomer();
    }//GEN-LAST:event_customersbtnActionPerformed

    private void deliverypplbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverypplbtnActionPerformed
        // TODO add your handling code here:
        ManageDeliveryPeople();
    }//GEN-LAST:event_deliverypplbtnActionPerformed

    private void restuarantsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restuarantsbtnActionPerformed
        // TODO add your handling code here:
        ManageRestuarants();
    }//GEN-LAST:event_restuarantsbtnActionPerformed
private void backAction() {
         LoginJPanel LoginJPanel = new LoginJPanel(userProcessContainer,ecosystem);
        userProcessContainer.add("LoginJPanel", LoginJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(ecosystem);
        backAction();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RightPanel;
    private javax.swing.JButton customersbtn;
    private javax.swing.JButton deliverypplbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton restuarantsbtn;
    // End of variables declaration//GEN-END:variables
}

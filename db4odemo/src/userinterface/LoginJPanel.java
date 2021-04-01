/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Karthik
 */
public class LoginJPanel extends javax.swing.JPanel {

    private JPanel container;
    private EcoSystem system;
    //private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;
    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.container=container;
        this.system=system;
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUserNamelabel = new javax.swing.JLabel();
        jPasswordLabel = new javax.swing.JLabel();
        juserNameTextField = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 153));

        jUserNamelabel.setForeground(new java.awt.Color(255, 255, 255));
        jUserNamelabel.setText("UserName");

        jPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordLabel.setText("Password");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLoginButton.setText("LOGIN");
        jLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN CREDENTIALS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jUserNamelabel)
                        .addGap(40, 40, 40)
                        .addComponent(juserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPasswordLabel)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLoginButton)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordLabel, jUserNamelabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUserNamelabel)
                    .addComponent(juserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordLabel)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLoginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
    private void changeviewingJPanel(UserAccount useraccount) {
        if(useraccount != null) {
            if (userAccount instanceof Customer){
                    container.add("workArea", userAccount.getRole().createWorkArea(container, (Customer)userAccount, system));
            }else if(userAccount instanceof Restaurant){
                    container.add("workArea", userAccount.getRole().createWorkArea(container, (Restaurant)userAccount, system));
            }else if(userAccount instanceof DeliveryMan){
                    container.add("workArea", userAccount.getRole().createWorkArea(container, (DeliveryMan)userAccount, system));
            }else{
                 container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, system));
            }
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }
    }
    private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonActionPerformed
        // TODO add your handling code here:
        String userName = juserNameTextField.getText();
        char[] passwordCharArray = jPasswordField1.getPassword();
        String password = String.valueOf(passwordCharArray);
        userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        if(userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            juserNameTextField.setText("");
            jPasswordField1.setText("");
            changeviewingJPanel(userAccount);
        }
    }//GEN-LAST:event_jLoginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLoginButton;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jPasswordLabel;
    private javax.swing.JLabel jUserNamelabel;
    private javax.swing.JTextField juserNameTextField;
    // End of variables declaration//GEN-END:variables
}
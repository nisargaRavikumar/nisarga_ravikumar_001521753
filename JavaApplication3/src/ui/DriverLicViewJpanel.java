/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import model.DriverLicInfo;

/**
 *
 * @author nisar
 */
public class DriverLicViewJpanel extends javax.swing.JPanel {

    DriverLicInfo license;
    BufferedImage bufferedImage;
    public DriverLicViewJpanel(DriverLicInfo license) {
        initComponents();
        this.license= license;
        displayProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        DOILbl = new javax.swing.JLabel();
        DOELbl = new javax.swing.JLabel();
        LicNoLbl = new javax.swing.JLabel();
        PicLbl = new javax.swing.JLabel();
        LicNoTxtFld = new javax.swing.JTextField();
        DOITxtFld = new javax.swing.JTextField();
        DOETxtFLd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BldTypeTxtFld = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Driver License Info");

        DOILbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DOILbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DOILbl.setText("Date of Issurance");

        DOELbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DOELbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DOELbl.setText("Date of Expiry");

        LicNoLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LicNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LicNoLbl.setText("License number");

        PicLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PicLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PicLbl.setText("Picture");

        LicNoTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LicNoTxtFldActionPerformed(evt);
            }
        });

        DOITxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOITxtFldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Blood Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DOELbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LicNoLbl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DOILbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addComponent(BldTypeTxtFld)
                    .addComponent(DOETxtFLd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DOITxtFld)
                    .addComponent(LicNoTxtFld))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DOELbl, DOILbl, LicNoLbl, PicLbl, jLabel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LicNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LicNoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOILbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOITxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOELbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOETxtFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BldTypeTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DOELbl, DOILbl, LicNoLbl, PicLbl, jLabel2});

    }// </editor-fold>//GEN-END:initComponents

    private void LicNoTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LicNoTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LicNoTxtFldActionPerformed

    private void DOITxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOITxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOITxtFldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BldTypeTxtFld;
    private javax.swing.JLabel DOELbl;
    private javax.swing.JTextField DOETxtFLd;
    private javax.swing.JLabel DOILbl;
    private javax.swing.JTextField DOITxtFld;
    private javax.swing.JLabel LicNoLbl;
    private javax.swing.JTextField LicNoTxtFld;
    private javax.swing.JLabel PicLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables

private void displayProduct() {
        LicNoTxtFld.setText(license.getLicNo());
        DOITxtFld.setText(license.getIssuedDate());
        DOETxtFLd.setText(license.getExpireyDate());
        BldTypeTxtFld.setText(license.getBloodType());
        if(license.getPicture() == null) {
            String imagePath;
            imagePath = "";
            license.setPicture(imagePath);
        }
        try {
            bufferedImage = ImageIO.read(new File(license.getPicture()));
            lblImage.setIcon(new ImageIcon(new ImageIcon(bufferedImage).getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT)));
        } catch (IOException e) {

        }
}
}

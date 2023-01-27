/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.tugas.tif;

import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.text.*;


/**
 *
 * @author lenovo
 */
public class Hal2Update extends javax.swing.JFrame {
    String ayah,pekerjaan1,pendidikan1,pendapatan1,ibu,pekerjaan2,pendidikan2,pendapatan2,wali,pekerjaan3,pendidikan3,pendapatan3;
    String alamat2,jarak,trans,foto,pil1,pil2;
    String nomor,nama,alamat,jk,tempat,tl,agama,prov,kab,kec,asal,jurusan,telp,email;
    public Hal2Update() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        nomorLabel = new javax.swing.JLabel();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Pendapatan1Field = new javax.swing.JTextField();
        Pendidikan1Field = new javax.swing.JTextField();
        Pekerjaan1Field = new javax.swing.JTextField();
        AyahField = new javax.swing.JTextField();
        IbuField = new javax.swing.JTextField();
        Pekerjaan2Field = new javax.swing.JTextField();
        Pendidikan2Field = new javax.swing.JTextField();
        Pendapatan2Field = new javax.swing.JTextField();
        TransField = new javax.swing.JTextField();
        JarakField = new javax.swing.JTextField();
        Alamat2Field = new javax.swing.JTextField();
        Pendapatan3Field = new javax.swing.JTextField();
        Pendidikan3Field = new javax.swing.JTextField();
        Pekerjaan3Field = new javax.swing.JTextField();
        WaliField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        FotoLabel = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 147, 43));

        nomorLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomorLabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabelClose1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelClose1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose1.setText("X");
        jLabelClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });

        jLabelMin1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMin1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin1.setText("_");
        jLabelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(48, 51, 107));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Berikutnya");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Kembali");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Biodata Ayah");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Nama Ayah");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Pekerjaan");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Pendidikan");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Pendapatan");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Biodata Ibu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nama Ibu");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Pekerjaan");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Pendidikan");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Pendapatan");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Biodata Wali");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Nama Wali");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Pekerjaan");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Pendidikan");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Pendapatan");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Informasi mahasiswa");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Alamat");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Jarak");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Transportasi");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Foto");

        Pendapatan1Field.setToolTipText("");
        Pendapatan1Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Pendapatan1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pendapatan1FieldActionPerformed(evt);
            }
        });
        Pendapatan1Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pendapatan1FieldKeyTyped(evt);
            }
        });

        Pendidikan1Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pendidikan1FieldKeyTyped(evt);
            }
        });

        Pekerjaan1Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pekerjaan1FieldKeyTyped(evt);
            }
        });

        AyahField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AyahFieldKeyTyped(evt);
            }
        });

        IbuField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IbuFieldKeyTyped(evt);
            }
        });

        Pekerjaan2Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pekerjaan2FieldKeyTyped(evt);
            }
        });

        Pendidikan2Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pendidikan2FieldKeyTyped(evt);
            }
        });

        Pendapatan2Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pendapatan2FieldKeyTyped(evt);
            }
        });

        TransField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TransFieldKeyTyped(evt);
            }
        });

        JarakField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JarakFieldKeyTyped(evt);
            }
        });

        Pendapatan3Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pendapatan3FieldKeyTyped(evt);
            }
        });

        Pendidikan3Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pendidikan3FieldKeyTyped(evt);
            }
        });

        Pekerjaan3Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pekerjaan3FieldKeyTyped(evt);
            }
        });

        WaliField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                WaliFieldKeyTyped(evt);
            }
        });

        jButton3.setText("Upload");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(Pendapatan2Field))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AyahField)
                            .addComponent(IbuField)
                            .addComponent(Pekerjaan2Field)
                            .addComponent(Pendidikan2Field)
                            .addComponent(Pendapatan1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pendidikan1Field)
                            .addComponent(Pekerjaan1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(WaliField)
                            .addComponent(Pekerjaan3Field)
                            .addComponent(Pendidikan3Field)
                            .addComponent(Pendapatan3Field)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JarakField)
                            .addComponent(Alamat2Field, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(TransField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(FotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9)
                    .addComponent(AyahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WaliField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10)
                    .addComponent(Pekerjaan1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pekerjaan3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11)
                    .addComponent(Pendidikan1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pendidikan3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12)
                    .addComponent(Pendapatan1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pendapatan3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel17))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel18)
                    .addComponent(IbuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alamat2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel19)
                    .addComponent(Pekerjaan2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JarakField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel20)
                    .addComponent(Pendidikan2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel21)
                    .addComponent(Pendapatan2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(FotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(nomorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin1)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose1)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClose1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabelMin1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(nomorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        // TODO add your handling code here:
        System.exit(0); // keluar program
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        RegisterForm rf = new RegisterForm();
        rf.setVisible(true);
        rf.pack();
        rf.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Hal3Update data2 = new Hal3Update();
        data2.nomor = nomor;
        data2.nama = nama;
        data2.alamat = alamat;
        data2.prov = prov;
        data2.kab = kab;
        data2.kec = kec;
        data2.jk = jk;
        data2.tempat = tempat;
        data2.tl = tl;
        data2.agama = agama;
        data2.asal = asal;
        data2.jurusan = jurusan;
        data2.telp = telp;
        data2.email = email;
        data2.ayah = AyahField.getText();
        data2.pekerjaan1 = Pekerjaan1Field.getText();
        data2.pendidikan1 = Pendidikan1Field.getText();
        data2.pendapatan1 = Pendapatan1Field.getText();
        data2.ibu = IbuField.getText();
        data2.pekerjaan2 = Pekerjaan2Field.getText();
        data2.pendidikan2 = Pendidikan2Field.getText();
        data2.pendapatan2 = Pendapatan2Field.getText();
        data2.wali = WaliField.getText();
        data2.pekerjaan3 = Pekerjaan3Field.getText();
        data2.pendidikan3 = Pendidikan3Field.getText();
        data2.pendapatan3 = Pendapatan3Field.getText();
        data2.alamat2 = Alamat2Field.getText();
        data2.jarak = JarakField.getText();
        data2.trans = TransField.getText();
        data2.foto = foto;
        dispose();
        data2.setVisible(true);
        data2.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Pendapatan1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pendapatan1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pendapatan1FieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    JFileChooser chooser = new JFileChooser();
    Hal3Daftar data2 = new Hal3Daftar();
    chooser.showOpenDialog(null);
    File f = chooser.getSelectedFile();
    foto = f.getAbsolutePath();
    try {
    ImageIcon gambar=new ImageIcon(ImageIO.read(new File(f.getAbsolutePath())));//get the image from file chooser and scale it to match JLabel size
    FotoLabel.setIcon(gambar);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Hal1Update nn = new Hal1Update();
        nn.nomor = nomor;
        nn.ayah = ayah;
        nn.pekerjaan1 = pekerjaan1;
        nn.pendidikan1 = pendidikan1;
        nn.pendapatan1 = pendapatan1;
        nn.ibu = ibu;
        nn.pekerjaan2 = pekerjaan2;
        nn.pendidikan2 = pendidikan2;
        nn.pendapatan2 = pendapatan2;
        nn.wali = wali;
        nn.pekerjaan3 = pekerjaan3;
        nn.pendidikan3 = pendidikan3;
        nn.pendapatan3 = pendapatan3;
        nn.alamat2 = alamat2;
        nn.jarak = jarak;
        nn.trans = trans;
        nn.foto = foto;
        nomorLabel.setText(nomor);
        AyahField.setText(ayah);
        Pekerjaan1Field.setText(pekerjaan1);
        Pendidikan1Field.setText(pendidikan1);
        Pendapatan1Field.setText(pendapatan1);
        IbuField.setText(ibu);
        Pekerjaan2Field.setText(pekerjaan2);
        Pendidikan2Field.setText(pendidikan2);
        Pendapatan2Field.setText(pendapatan2);
        WaliField.setText(wali);
        Pekerjaan3Field.setText(pekerjaan3);
        Pendidikan3Field.setText(pendidikan3);
        Pendapatan3Field.setText(pendapatan3);
        Alamat2Field.setText(alamat2);
        JarakField.setText(jarak);
        TransField.setText(trans);
        ImageIcon gambar=new ImageIcon(foto);//get the image from file chooser and scale it to match JLabel size
        FotoLabel.setIcon(gambar);
    }//GEN-LAST:event_formWindowOpened

    private void Pendapatan1FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pendapatan1FieldKeyTyped
        char caracter = evt.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    evt.consume();
                }
                if((Pendapatan1Field.getText() + evt.getKeyChar()).length()>20){
                    evt.consume();
        }
    }//GEN-LAST:event_Pendapatan1FieldKeyTyped

    private void Pendapatan3FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pendapatan3FieldKeyTyped
        char caracter = evt.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    evt.consume();
                }
                if((Pendapatan3Field.getText() + evt.getKeyChar()).length()>20){
                    evt.consume();
        }
    }//GEN-LAST:event_Pendapatan3FieldKeyTyped

    private void JarakFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JarakFieldKeyTyped
        char caracter = evt.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    evt.consume();
                }
        if((JarakField.getText() + evt.getKeyChar()).length()>2){
                    evt.consume();
        }
    }//GEN-LAST:event_JarakFieldKeyTyped

    private void Pendapatan2FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pendapatan2FieldKeyTyped
        char caracter = evt.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    evt.consume();
                }
                if((Pendapatan1Field.getText() + evt.getKeyChar()).length()>20){
                    evt.consume();
        }
    }//GEN-LAST:event_Pendapatan2FieldKeyTyped

    private void TransFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TransFieldKeyTyped
         if((TransField.getText() + evt.getKeyChar()).length()>15){
                    evt.consume();
        }
    }//GEN-LAST:event_TransFieldKeyTyped

    private void AyahFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AyahFieldKeyTyped
         if((AyahField.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }//GEN-LAST:event_AyahFieldKeyTyped

    private void WaliFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WaliFieldKeyTyped
        if((WaliField.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }//GEN-LAST:event_WaliFieldKeyTyped

    private void IbuFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IbuFieldKeyTyped
        if((IbuField.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }//GEN-LAST:event_IbuFieldKeyTyped

    private void Pekerjaan1FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pekerjaan1FieldKeyTyped
        if((Pekerjaan1Field.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }//GEN-LAST:event_Pekerjaan1FieldKeyTyped

    private void Pekerjaan3FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pekerjaan3FieldKeyTyped
        if((Pekerjaan3Field.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }//GEN-LAST:event_Pekerjaan3FieldKeyTyped

    private void Pekerjaan2FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pekerjaan2FieldKeyTyped
        if((Pekerjaan2Field.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }//GEN-LAST:event_Pekerjaan2FieldKeyTyped

    private void Pendidikan1FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pendidikan1FieldKeyTyped
        if((Pendidikan1Field.getText() + evt.getKeyChar()).length()>20){
                    evt.consume();
        }
    }//GEN-LAST:event_Pendidikan1FieldKeyTyped

    private void Pendidikan3FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pendidikan3FieldKeyTyped
        if((Pendidikan3Field.getText() + evt.getKeyChar()).length()>20){
                    evt.consume();
        }
    }//GEN-LAST:event_Pendidikan3FieldKeyTyped

    private void Pendidikan2FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pendidikan2FieldKeyTyped
        if((Pendidikan2Field.getText() + evt.getKeyChar()).length()>20){
                    evt.consume();
        }
    }//GEN-LAST:event_Pendidikan2FieldKeyTyped
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hal2Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hal2Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hal2Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hal2Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hal2Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat2Field;
    private javax.swing.JTextField AyahField;
    private javax.swing.JLabel FotoLabel;
    private javax.swing.JTextField IbuField;
    private javax.swing.JTextField JarakField;
    private javax.swing.JTextField Pekerjaan1Field;
    private javax.swing.JTextField Pekerjaan2Field;
    private javax.swing.JTextField Pekerjaan3Field;
    private javax.swing.JTextField Pendapatan1Field;
    private javax.swing.JTextField Pendapatan2Field;
    private javax.swing.JTextField Pendapatan3Field;
    private javax.swing.JTextField Pendidikan1Field;
    private javax.swing.JTextField Pendidikan2Field;
    private javax.swing.JTextField Pendidikan3Field;
    private javax.swing.JTextField TransField;
    private javax.swing.JTextField WaliField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nomorLabel;
    // End of variables declaration//GEN-END:variables
}

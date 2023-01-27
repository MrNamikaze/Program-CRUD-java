/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.tugas.tif;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;

/**
 *
 * @author Teknik Informatika
 */
public class Hal1Update extends javax.swing.JFrame {
        String ayah,pekerjaan1,pendidikan1,pendapatan1,ibu,pekerjaan2,pendidikan2,pendapatan2,wali,pekerjaan3,pendidikan3,pendapatan3;
        String alamat2,jarak,trans,foto,pil1,pil2;
        String nomor,nama,alamat,jk,tempat,tl,agama,prov,kab,kec,asal,jurusan,telp,email;
        public Hal1Update() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    SimpleDateFormat tgl1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nomorLabel = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        NamaField = new javax.swing.JTextField();
        AlamatField = new javax.swing.JTextField();
        NoField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        TempatField = new javax.swing.JTextField();
        LakiButton = new javax.swing.JRadioButton();
        PerempuanButton = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        AgamaCombo = new javax.swing.JComboBox<>();
        AsalField = new javax.swing.JTextField();
        JurusanField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        ProvField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        KabField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        KecField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 147, 43));

        nomorLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomorLabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("_");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(nomorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 548, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(nomorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(48, 51, 107));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nama Lengkap");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Alamat Domisili");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("No. Tlp");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("TTL");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Jenis Kelamin");

        buttonGroup1.add(LakiButton);
        LakiButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LakiButton.setForeground(new java.awt.Color(255, 255, 255));
        LakiButton.setText("Laki - Laki");
        LakiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LakiButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(PerempuanButton);
        PerempuanButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PerempuanButton.setForeground(new java.awt.Color(255, 255, 255));
        PerempuanButton.setText("Perempuan");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Asal Sekolah:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Jurusan");

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Berikutnya");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Agama");

        AgamaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Islam", "Kristen", "Budha", "Hindu", "Konghucu", "Protestan" }));

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Kembali");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Provinsi");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Kabupaten/kota");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Kecamatan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14)
                            .addComponent(jLabel6)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NamaField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AlamatField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AsalField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JurusanField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(ProvField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(KabField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(KecField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(LakiButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(PerempuanButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(TempatField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel15)
                                        .addGap(30, 30, 30)
                                        .addComponent(AgamaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NamaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AlamatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ProvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(KabField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(KecField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(LakiButton)
                    .addComponent(PerempuanButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(TempatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(AgamaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AsalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JurusanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(55, 55, 55)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0); // keluar program
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Hal2Update hal3 = new Hal2Update();
       hal3.nomor = nomor;
       hal3.nama = NamaField.getText();
       hal3.alamat = AlamatField.getText();
       hal3.jk = LakiButton.getText();
       hal3.agama = AgamaCombo.getSelectedItem().toString();
       hal3.tempat = TempatField.getText();
       tgl1 = new SimpleDateFormat("dd-M-yyyy");
       hal3.tl = tgl1.format(jDateChooser1.getDate()).toString();
       hal3.prov = ProvField.getText();
       hal3.kab = KabField.getText();
       hal3.kec = KecField.getText();
       hal3.asal = AsalField.getText();
       hal3.jurusan = JurusanField.getText();
       hal3.telp = NoField.getText();
       hal3.email = EmailField.getText();
       hal3.ayah = ayah;
       hal3.pekerjaan1 = pekerjaan1;
       hal3.pendidikan1 = pendidikan1;
       hal3.pendapatan1 = pendapatan1;
       hal3.ibu = ibu;
       hal3.pekerjaan2 = pekerjaan2;
       hal3.pendidikan2 = pendidikan2;
       hal3.pendapatan2 = pendapatan2;
       hal3.wali = wali;
       hal3.pekerjaan3 = pekerjaan3;
       hal3.pendidikan3 = pendidikan3;
       hal3.pendapatan3 = pendapatan3;
       hal3.alamat2 = alamat2;
       hal3.jarak = jarak;
       hal3.trans = trans;
       hal3.foto = foto;
       hal3.pil1 = pil1;
       hal3.pil2 = pil2;
       dispose();
       hal3.setVisible(true);
       hal3.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void LakiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LakiButtonActionPerformed
        Hal2Daftar hal3 = new Hal2Daftar();
        if(LakiButton.isSelected()){
        hal3.jk="Laki-Laki";
        hal3.jk=LakiButton.getText();
        }else if(PerempuanButton.isSelected()){
        hal3.jk="Perempuan";
        hal3.jk=PerempuanButton.getText();
        }
    }//GEN-LAST:event_LakiButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DashAdmin nn = new DashAdmin();
        nn.nomor = nomor;
        nn.nama = nama;
        nn.alamat = alamat;
        nn.prov = prov;
        nn.kab = kab;
        nn.kec = kec;
        nn.jk = jk;
        nn.tempat = tempat;
        nn.tl = tl;
        nn.agama = agama;
        nn.asal = asal;
        nn.jurusan = jurusan;
        nn.telp = telp;
        nn.email = email;
        nomorLabel.setText(nomor);
        NamaField.setText(nama);
        AlamatField.setText(alamat);
        ProvField.setText(prov);
        KabField.setText(kab);
        KecField.setText(kec);
        TempatField.setText(tempat);
        AsalField.setText(asal);
        JurusanField.setText(jurusan);
        NoField.setText(telp);
        EmailField.setText(email);
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated
    private void NamaFieldKeyTyped(java.awt.event.KeyEvent evt) {                                   
        if((NamaField.getText() + evt.getKeyChar()).length()>50){
                    evt.consume();
        }
    }                                  

    private void AlamatFieldKeyTyped(java.awt.event.KeyEvent evt) {                                     
        if((AlamatField.getText() + evt.getKeyChar()).length()>100){
                    evt.consume();
        }
    }                                    

    private void ProvFieldKeyTyped(java.awt.event.KeyEvent evt) {                                   
        if((ProvField.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }                                  

    private void KabFieldKeyTyped(java.awt.event.KeyEvent evt) {                                  
        if((KabField.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }                                 

    private void KecFieldKeyTyped(java.awt.event.KeyEvent evt) {                                  
        if((KecField.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }                                 

    private void TempatFieldKeyTyped(java.awt.event.KeyEvent evt) {                                     
        if((TempatField.getText() + evt.getKeyChar()).length()>15){
                    evt.consume();
        }
    }                                    

    private void AsalFieldKeyTyped(java.awt.event.KeyEvent evt) {                                   
        if((AsalField.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }                                  

    private void JurusanFieldKeyTyped(java.awt.event.KeyEvent evt) {                                      
        if((JurusanField.getText() + evt.getKeyChar()).length()>15){
                    evt.consume();
        }
    }                                     

    private void NoFieldKeyTyped(java.awt.event.KeyEvent evt) {                                 
        if((NoField.getText() + evt.getKeyChar()).length()>14){
                    evt.consume();
        }
    }                                

    private void EmailFieldKeyTyped(java.awt.event.KeyEvent evt) {                                    
        if((EmailField.getText() + evt.getKeyChar()).length()>30){
                    evt.consume();
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Hal1Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hal1Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hal1Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hal1Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hal1Update().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AgamaCombo;
    private javax.swing.JTextField AlamatField;
    private javax.swing.JTextField AsalField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField JurusanField;
    private javax.swing.JTextField KabField;
    private javax.swing.JTextField KecField;
    private javax.swing.JRadioButton LakiButton;
    private javax.swing.JTextField NamaField;
    private javax.swing.JTextField NoField;
    private javax.swing.JRadioButton PerempuanButton;
    private javax.swing.JTextField ProvField;
    private javax.swing.JTextField TempatField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nomorLabel;
    // End of variables declaration//GEN-END:variables
}

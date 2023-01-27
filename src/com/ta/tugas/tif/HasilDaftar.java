/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.tugas.tif;
import com.ta.tugas.tif.KoneksiMySql;
import com.mysql.jdbc.PreparedStatement;
import java.util.Random;
import java.lang.String;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class HasilDaftar extends javax.swing.JFrame {
    String ayah,pekerjaan1,pendidikan1,pendapatan1,ibu,pekerjaan2,pendidikan2,pendapatan2,wali,pekerjaan3,pendidikan3,pendapatan3;
    String alamat2,jarak,trans,foto1,pil1,pil2;
    String nama,alamat,jk,tempat,tl,agama,prov,kab,kec,asal,jurusan,telp,email;
    Random nm = new Random();
    int mn = 1000+nm.nextInt(8999);
    String nomor = String.valueOf(mn);
    private Connection koneksi;
    public HasilDaftar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 147, 43));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Calon Mahasiswa");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin1)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose1)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMin1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(48, 51, 107));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Kembali");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Simpan");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(416, 416, 416)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        // TODO add your handling code here:
        System.exit(0); // keluar program
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        Hal3Daftar h3d = new Hal3Daftar();
        h3d.setVisible(true);
        h3d.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        jTextArea1.setText("Nomor peserta: "+nomor+"\nNama: "+nama+"\nAlamat domisili: "+alamat+"\nProvinsi: "+prov+"\tKabupaten/kota: "+kab+"\tKecamatan"+kec+
        "\nJenis kelamin: "+jk+"\nTTL: "+tempat+", "+tl+"\nAgama: "+agama+"\nAsal sekolah: "+asal+"\nJurusan: "+jurusan+"\nNo telp: "+telp+
                "\nE-mail: "+email+"\nNama Ayah: "+ayah+"\nPekerjaan: "+pekerjaan1+"\nPendidikan: "+pendidikan1+"\nPendapatan: "+pendapatan1+
        "\nNama Ibu: "+ibu+"\nPekerjaan: "+pekerjaan2+"\nPendidikan: "+pendidikan2+"\nPendapatan: "+pendapatan2+"\nNama Wali: "+wali+"\nPekerjaan: "+pekerjaan3+"\nPendidikan: "+pendidikan3+"\nPendapatan: "+pendapatan3+
                "\nAlamat: "+alamat2+"\nJarak: "+jarak+"\nTransportasi: "+trans+"\nPilihan 1: "+pil1+"\nPilihan 2: "+pil2);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HalDpn nn = new HalDpn();
        try {
          
          Statement stat = (Statement)KoneksiMySql.koneksiDatabase().createStatement();
          String query = "INSERT INTO camaba(nomor,nama,alamat1,prov,kab,kec,jk,tempat,tanggal,agama,asal,jurusan,telp,email,ayah,pekerjaan1,pendidikan1,pendapatan1,ibu,pekerjaan2,pendidikan2,pendapatan2,wali,pekerjaan3,pendidikan3,pendapatan3,alamat2,jarak,trans,foto,pil1,pil2) "
                    + "VALUES('"+nomor+"','"+nama+"','"+alamat+"','"+prov+"','"+kab+"','"+kec+"','"+jk+"','"+tempat+"','"+tl+"','"+agama+"','"+asal+"','"+jurusan+"','"+telp+"','"+email+"','"+ayah+"','"+pekerjaan1+"','"+pendidikan1+"','"+pendapatan1+"','"+ibu+"','"+pekerjaan2+"','"+pendidikan2+"','"+pendapatan2+"','"+wali+"','"+pekerjaan3+"','"+pendidikan3+"','"+pendapatan3+"','"+alamat2+"','"+jarak+"','"+trans+"','"+foto1+"','"+pil1+"','"+pil2+"')";
          
          PreparedStatement p=(PreparedStatement) KoneksiMySql.koneksiDatabase().prepareStatement(query);
          boolean execute = p.execute(query);
          JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (SQLException ex){
          JOptionPane.showMessageDialog(this, "Terjadi error pada saat input data");
          System.out.print(ex);
          
        } 
        dispose();
        nn.setVisible(true);
        nn.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HasilDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HasilDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HasilDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HasilDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HasilDaftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

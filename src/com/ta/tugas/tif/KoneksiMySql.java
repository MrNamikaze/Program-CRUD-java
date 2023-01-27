package com.ta.tugas.tif;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
 
/**
 *
 * @author www.kangsunu.web.id
 *
 * MORE JAVA BASIC TUTORIAL VISIT: //www.kangsunu.web.id/
 */
public class KoneksiMySql{
 
    private static Connection koneksi;
 
    
    public static Connection koneksiDatabase() { //<-- untuk koneksi ke database
        // Cek Driver
        try {
            Class.forName("com.mysql.jdbc.Driver"); //<-- nama driver untuk koneksi ke MySQL
 
            // Cek Database
            try {
                String url, user, password,url1;
                url1 = "jdbc:mysql://localhost:3306/tugas_akhir_java1";
                url = "jdbc:mysql://localhost:3306"; //alamat DB
                user = "root";
                password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Sukses");
                String sql = "CREATE DATABASE IF NOT EXISTS tugas_akhir_java1";
                try (Connection conn = DriverManager.getConnection(url, user, password);
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.execute();
                } catch (Exception e) {
                    e.printStackTrace();
                    }
                koneksi = DriverManager.getConnection(url1,user,password);
                System.out.println("Connected to the database....");
                Statement st = koneksi.createStatement();
                int c =st.executeUpdate("CREATE TABLE IF NOT EXISTS `tugas_akhir_java1`.`camaba` ( `nomor` CHAR(8) NOT NULL , `nama` VARCHAR(50) NOT NULL , `alamat1` VARCHAR(100) NOT NULL , `prov` VARCHAR(30) NOT NULL , `kab` VARCHAR(30) NOT NULL , `kec` VARCHAR(30) NOT NULL , `jk` VARCHAR(15) NOT NULL , `tempat` VARCHAR(15) NOT NULL , `tanggal` VARCHAR(15) NOT NULL , `agama` VARCHAR(10) NOT NULL , `asal` VARCHAR(30) NOT NULL , `jurusan` VARCHAR(15) NOT NULL , `telp` VARCHAR(14) NOT NULL , `email` VARCHAR(30) NOT NULL , `ayah` VARCHAR(30) NOT NULL , `pekerjaan1` VARCHAR(30) NOT NULL , `pendidikan1` VARCHAR(20) NOT NULL , `pendapatan1` VARCHAR(15) NOT NULL , `ibu` VARCHAR(30) NOT NULL , `pekerjaan2` VARCHAR(30) NOT NULL , `pendidikan2` VARCHAR(20) NOT NULL , `pendapatan2` VARCHAR(15) NOT NULL , `wali` VARCHAR(30) NOT NULL , `pekerjaan3` VARCHAR(30) NOT NULL , `pendidikan3` VARCHAR(20) NOT NULL , `pendapatan3` VARCHAR(15) NOT NULL , `alamat2` VARCHAR(30) NOT NULL , `jarak` VARCHAR(8) NOT NULL , `trans` VARCHAR(15) NOT NULL , `foto` VARCHAR(250) NOT NULL , `pil1` VARCHAR(30) NOT NULL , `pil2` VARCHAR(30) NOT NULL , PRIMARY KEY (`nomor`)) ENGINE = InnoDB;");
                System.out.println("Table have been created.");
                System.out.println(c+" Row(s) have been affected");
                
            } catch (SQLException se) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal! " + se);
                System.exit(0);
            }
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan! \n" + cnfe);
            System.exit(0);
        }
        return koneksi;
        
    }
 
    public static void main(String[] kon) {
        new KoneksiMySql().koneksiDatabase();
    }
}
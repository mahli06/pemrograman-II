/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9;

/**
 *
 * @author Asus A409
 */
import java.sql.Statement;
import javax.swing.JOptionPane;

public class update {
     koneksi konek = new koneksi();

//, String nama, String alamat, String jenis
    public void update(int nim, String nama, String alamat, String jenis) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_alamat = "update datamahasiswa set alamat='" + alamat + "'where nim='" + nim + "'";
            String sql_nama = "update datamahasiswa set nama='" + nama + "'where nim='" + nim + "'";
             String sql_jenis = "update datamahasiswa set gender='" + jenis + "'where nim='" + nim + "'";
           
           
//String sql_nim = "update identitas set nim ='" + nim + "' where nim = '" + nim + "'";
            //    String sql = "update identitas set nim ='" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jenis);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public static void main(String[] args) {
        update ganti = new update ();
        ganti.update(1023, "Ilham Asrofi", "Desa Pagergung,DSN Tanggung", "L");
        
    }
}
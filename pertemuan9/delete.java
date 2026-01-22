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

public class delete {
      koneksi konek = new koneksi();
   

    public void delete(int nim) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

              String sql = "delete from datamahasiswa where nim = '" + nim + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    public static void main(String[] args) {
        delete hapus = new delete ();
        hapus.delete(1023);
    }
}
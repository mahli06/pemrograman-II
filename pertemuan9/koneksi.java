/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9;

/**
 *
 * @author Asus A409
 */
import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;

public class koneksi {
    
    Connection con = null;
    
     public void koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost:3306/mahasiswa";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
           JOptionPane.showMessageDialog(null, "Sukses Koneksi");
        }

        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        System.exit(0);
        }
}
    public static void main(String[] args) {
        koneksi koneksi = new koneksi();
        koneksi.koneksi();
    }

}
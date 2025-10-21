/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Asus A409
 */
public class utama {
    public static void main(String[] args) {
    classmahasiswa m1 = new classmahasiswa("2455201023", "MUHAMMAD ILHAM A", 2);
    m1.nilaitambahan(1.5); // prosedur awal
    m1.tampilData();
    
    // contoh prosedur parameter
    m1.ubahNama("MUHAMMAD ILHAM ASROFI");
    
    // contoh fungsi parameter
    double hasilAkhir = m1.hitungNilaiAkhir(3.5, 4);
        System.out.println("Nilai Akhir: " + hasilAkhir);
        
        System.out.println (m1.predikat());
    }
}

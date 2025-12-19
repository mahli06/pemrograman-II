/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.smt03;

/**
 *
 * @author Asus A409
 */
public class MahasiswaUnu extends Mahasiswa implements Kelulusan {

    public MahasiswaUnu(String nama, String nim, String prodi, double ipk) {
        super(nama, nim, prodi, ipk);
    }

    // Polimorfisme (override)
    @Override
    public String cekKelulusan() {
        if (getIpk() >= 3.00) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }
}

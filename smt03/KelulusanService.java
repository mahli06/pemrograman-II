/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.smt03;

/**
 *
 * @author Asus A409
 */
public class KelulusanService {

    public String prosesKelulusan(String nama, String nim, String prodi, double ipk) {
        MahasiswaUnu mhs = new MahasiswaUnu(nama, nim, prodi, ipk);

        return  "Nama   : " + mhs.getNama() + "\n" +
                "NIM    : " + mhs.getNim() + "\n" +
                "Prodi  : " + mhs.getProdi() + "\n" +
                "IPK    : " + mhs.getIpk() + "\n" +
                "Status : " + mhs.cekKelulusan();
    }
}


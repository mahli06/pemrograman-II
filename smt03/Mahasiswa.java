/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.smt03;

/**
 *
 * @author Asus A409
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String nim, String prodi, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    // Getter (enkapsulasi)
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public double getIpk() {
        return ipk;
    }
}

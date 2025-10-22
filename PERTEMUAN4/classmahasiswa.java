/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN4;

/**
 *
 * @author Asus A409
 */
public class classmahasiswa {
    public String nim = "";
    private String nama = "";
    private double ipk = 0;
    private String predikat = "";
    
    //konstruktor method khusus yang dibuat untuk class
    public classmahasiswa(String nim, String nama , double ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
    public void tampilData () {
        System.out.println(nim);
        System.out.println(nama);
        System.out.println(ipk);
    }
    public String predikat() {
        if(ipk>=3.5){
           predikat= "cumlaude";
        }
        else if (ipk>=3.25){
            predikat="saya mencintai";
        }
        return predikat;
    
    }
    // prosedur dengan parameter
    public void ubahNama(String namaBaru){
        this.nama = namaBaru;
        System.out.println("Nama telah diubah menjadi: " + this.nama);
    }
    
    //fungsi dengan parameter
    double hitungNilaiAkhir(double NilaiUTS, double NilaiUAS){
         double NilaiAkhir = (NilaiUTS * 0.4) + (NilaiUAS * 0.6);
         return NilaiAkhir;
    }
    
    public void nilaitambahan (double nilaitambahan){
        ipk = ipk + nilaitambahan;
    }
   
 
}

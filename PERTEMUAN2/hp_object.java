/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN2;

/**
 *
 * @author Asus A409
 */
public class hp_object {
    String merek;
    String tipe;
    int harga;
    
    public hp_object(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }
    
    public void tampilkanData(){
        System.out.println("merek: " + merek);
        System.out.println("tipe: " + tipe);
        System.out.println("harga: " + harga);
    }   
}

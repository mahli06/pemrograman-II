/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_Inheritance_pewarisan;

/**
 *
 * @author Asus A409
 */
class Kendaraan {
    String merk = "Yamaha";

    void info() {
        System.out.println("Ini adalah kendaraan bermerek: " + merk);
    }
}

// Motor mewarisi sifat dari Kendaraan
class Motor extends Kendaraan {
    String tipe = "NMax";

    void tampil() {
        info(); // method dari parent class
        System.out.println("Tipe motor: " + tipe);
    }
}
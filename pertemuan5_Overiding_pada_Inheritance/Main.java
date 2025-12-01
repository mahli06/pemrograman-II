/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_Overiding_pada_Inheritance;

/**
 *
 * @author Asus A409
 */
public class Main {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        Kucing k = new Kucing();

        h.suara();
        k.suara();  // memakai hasil overriding
    }
}
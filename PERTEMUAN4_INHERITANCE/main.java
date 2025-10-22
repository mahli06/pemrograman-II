/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN4_INHERITANCE;

/**
 *
 * @author Asus A409
 */
public class main {
   public static void main(String[]args) {
       Enemy monster = new Enemy();
       zombie zumbi = new zombie();
       pocong plantsvszombie = new pocong();
       burung teke_duwek = new burung();
       
       monster.attack();
       zumbi.walk();
       plantsvszombie.jump();
       teke_duwek.walk();
       teke_duwek.jump();
       teke_duwek.fly();       
   } 
}

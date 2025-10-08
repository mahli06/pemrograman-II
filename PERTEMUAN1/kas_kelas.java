/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN1;

import java.util.Scanner;

/**
 *
 * @author Asus A409
 */
public class kas_kelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM KAS KELAS ===");
        System.out.print("Masukkan jumlah siswa: ");
        int n = input.nextInt();

        // Array untuk menyimpan data
        String[] nama = new String[n];
        int[] iuran = new int[n];

        // Input data siswa dan iuran
        for (int i = 0; i < n; i++) {
            System.out.println("\nSiswa ke-" + (i+1));
            System.out.print("Nama siswa : ");
            nama[i] = input.next();
            System.out.print("Iuran kas  : ");
            iuran[i] = input.nextInt();
        }

        // Hitung total kas & cari yang bayar paling b
}
}

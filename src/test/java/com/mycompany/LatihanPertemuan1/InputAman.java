/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

import java.util.Scanner;
import java.util.InputMismatchException; 
/**
 *
 * @author Hype GLK
 */
public class InputAman {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Masukkan angka bulat: ");
            int angka = scan.nextInt(); // Error jika user input huruf
            System.out.println("Angka yang Anda masukkan: " + angka);
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harus berupa angka, bukan huruf!");
                // Gunanya agar program tidak melanjutkan kode yang butuh angka
                } finally {
            // Blok ini selalu dijalankan
            System.out.println("Blok Finally: Selesai.");
            scan.close();
        }
    }
}

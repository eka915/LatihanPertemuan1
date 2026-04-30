/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

import java.util.Scanner;
/**
 *
 * @author Hype GLK
 */
public class LoopWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angkaRahasia = 7;
        int tebakan = 0;
        // Selama tebakan tidak sama dengan angka rahasia, ulangi
        while (tebakan != angkaRahasia) {
            System.out.print("Tebak angka (1-10): ");
            tebakan = scan.nextInt();
            
            if (tebakan != angkaRahasia) {
                System.out.println("Salah! Coba lagi.");
            }
        }
        
        System.out.println("Benar! Angka rahasianya adalah " + angkaRahasia);
        scan.close();
    }
}

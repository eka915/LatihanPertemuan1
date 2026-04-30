/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class RunKalkulator {
    public static void main(String[] args) {
        // Buat object kalkulator
        KalkulatoroOP calc = new KalkulatoroOP();
        
        // Gunakan object tersebut
        int hasil = calc.tambah(10, 5);
        System.out.println("Hasil Tambah: " + hasil);
        System.out.println("Hasil Kurang: " + calc.kurang(10, 5));
    }
}

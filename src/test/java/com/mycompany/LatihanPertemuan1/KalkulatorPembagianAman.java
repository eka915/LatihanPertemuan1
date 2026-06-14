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
public class KalkulatorPembagianAman {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        
        while(!valid) {
            try{
                System.out.print("Masukkan angka pertama:");
                int angka1 = scan.nextInt();
                System.out.print("Masukkan angka kedua:");
                int angka2 = scan.nextInt();
                int hasil = angka1 / angka2;
                System.out.println("Hasil pemabagian:" + hasil);
                
                valid = true;
             } catch (InputMismatchException e) {
                System.out.println("Error:input harus berupa angka!");
                scan.nextLine();
            }catch (ArithmeticException e) {
                System.out.println("Error:Tidak bisa membagi dengan angka nol!");
            } finally {
                System.out.println("Program selesai dijalankan.");
            }
        }
        scan.close();
    }
}

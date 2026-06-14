/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan14;
import java.util.ArrayList;
/**
 *
 * @author Hype GLK
 */
public class LoopArrayList {
    public static void main (String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(10);
        angka.add(20);
        angka.add(30);
        angka.add(40);
        angka.add(50);
        
        System.out.println("=== Looping Angka===");
        for (Integer num : angka)
            System.out.println("Angka: " + num);
    }
}

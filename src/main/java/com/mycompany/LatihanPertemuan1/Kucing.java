/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Meong meong");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan15.newpackage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author Hype GLK
 */
public class InsertMahasiswa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("--- INPUT DATA MAHASISWA ---");
        System.out.println("NIM : ");
        String nim = scan.nextLine();
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("IPK :");
        double ipk= scan.nextDouble();
        String sql = "INSERT INTO tb_mhs (nim, nama, ipk) VALUES (?, ?, ?)";
        try {
            Connection conn = KoneksiDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            pstmt.setString(2, nama);
            pstmt.setDouble(3, ipk);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data berhasil disimpan");
            } else {
                System.out.println("Gagal menyimpan data.");
            }
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        }
        scan.close();
    }
}

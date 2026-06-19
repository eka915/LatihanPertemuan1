/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan15.newpackage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Hype GLK
 */
public class TampilMahasiswa {
    public static void main(String[] args) {
        String sql = "SELECT * FROM tb_mhs";
        
        try {
            Connection conn = KoneksiDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            // Eksekusi Query (Mengembalikan ResultSet)
            ResultSet rs = pstmt.executeQuery();
            
            System.out.println("\n--- DATA MAHASISWA ---");
            System.out.println("NIM\t| Nama\t\t| IPK");
            System.out.println("---------------------------------");
            
            // Looping selama ada baris data (rs.next())
            while (rs.next()) {
                // Ambil data berdasarkan nama kolom atau index
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                double ipk = rs.getDouble("ipk");
                
                System.out.println(nim + "\t| " + nama + "\t| " + ipk);
            }
            
            // Tutup
            rs.close();
            pstmt.close();
            conn.close();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
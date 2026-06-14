/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan14;
import java.util.ArrayList; // Import wajib
/**
 *
 * @author Hype GLK
 */
public class DemoArrayList {
    public static void main(String[] args) {
        // 1. Deklarasi ArrayList
        // NamaClass<NamaTipeData> namaVariabel = new NamaClass<>();
        ArrayList<String> namaTeman = new ArrayList<>();
         
        // 2. Menambahkan Data (add)
        namaTeman.add("Krisna");
        namaTeman.add("Rey");
        namaTeman.add("Babay");
        
        System.out.println("Isi ArrayList: " + namaTeman);
        
        // 3. Mengambil data (get) berdasarkan index
        System.out.println("Data Index 0: " + namaTeman.get(0));
        System.out.println("Data Index 2: " + namaTeman.get(2));
        
        // 4. Mengubah data (set)
        namaTeman.set(1, "Putri"); // Ganti "Olan" Jadi "Haidar"
        System.out.println("Setelah diubah: " + namaTeman);
        
        // 5. Menghapus data (remove)
        namaTeman.remove(0); // Hapus index 0 (Krisna)
        System.out.println("Setelah dihapus: " + namaTeman);
        
        // 6. Ukuran ArrayList (size)
        System.out.println("Jumlah Data: " + namaTeman.size());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb04;
import java.util.HashMap;
/**
 *
 * @author bastianhafid408
 */
public class HashMapLat {
    public static void main(String[] args) {
        // membuat objek hashmap
        HashMap<Integer, String> days = new HashMap<>();
        
        // mengisi nilai ke objek days
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");
        
        // mencetak semua isi dari objek days
        System.out.println("Isi objek days: " + days);
        
        // mengambil hari senin
        System.out.println("Hari kedua: " + days.get(2));
        
        // menghapus malam minggu
        days.remove(1);
        System.out.println("Isi objek days: " + days);
        // menghapus semua hari 
        days.clear();
        System.out.println("Isi objek days: " + days);
        
        // mengubah hari menggu menjadi hari ahad
        days.put(1, "Ahad");
        
        // mengubah hari rabu menjadi rabo
        days.replace(4, "Rabo");
        
        // mencetak semua isi dari objek days
        System.out.println("Isi objek days: " + days);
    }
}

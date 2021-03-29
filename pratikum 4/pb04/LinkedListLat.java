/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb04;
// LinkedListLat
import java.util.LinkedList;
/**
 *
 * @author bastianhafid408
 */

public class LinkedListLat {
    public static void main(String[] args){
        //Membuat Instance/Objek dari LinkedListLat
        LinkedList<String> buah = new LinkedList<>();
        
        //Menambahkan Data pada Objek buah
        buah.add("Apel");
        buah.add("Banana");
        buah.add("Cerry");
        buah.add("Pelem");

        //Mencetak/Menampilkan Data
        System.out.println("Nama Buah: "+buah);
        
        //Menghitung Jumlah/Ukuran pada Objek LinkedListLat
        System.out.println("Jumlah Buah: "+buah.size());
        
//        /Menambahkan Data pada Objek buah
        buah.add("Apel");
        buah.add("Banana");
        buah.add("Cerry");
        buah.add("Pelem");
 
        //Mengambil Data pada Urutan Teratas
        System.out.println("Data Teratas: "+buah.getFirst());
        //Mengambil Data pada Urutan Terbawah
        System.out.println("Data Terbawah: "+buah.getLast());
        //Mengambil Data pada Nomor Index 1
        System.out.println("Data NoIndex 1: "+buah.get(1)); 
        //Mengambil Data pada Nomor Index 3
        System.out.println("Data NoIndex 3: "+buah.get(3)); 
        
        //Menambahkan Data pada Objek buah
        buah.add("Apel");
        buah.add("Banana");
        buah.add("Cerry");
        buah.add("Pelem");

        buah.removeFirst(); //Menghapus Data pada Urutan Paling Atas
        buah.removeLast(); //Menghapus Data pada Urutan Paling Bawah
        buah.remove(1); //Menghapus Data pada No Index 1

        //Mencetak Data
        System.out.println(buah);
        
        
    }
}
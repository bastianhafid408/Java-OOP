/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;
import java.util.Scanner;
/**
 *
 * @author bastianhafid408
 */
public class mobil {
    String warna;
    int tahunProduksi;
    
    void hidupkanMobil(){
        System.out.println("Hidup kan mobil : "+warna);
    }
    void matikanMobil(){
        System.out.println("Matikan mobil : "+warna);
    }
    void ubahGigi(){
        System.out.println("Ubah Gigi : "+warna);
    }
    
    public static void main(String[] args){
        //membuat objek
        mobil mobilku = new mobil();
        mobil mobilmu = new mobil();
        //utk inputan 
        System.out.println("== Untuk Inputan mobil ==");
        //Inputan
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan warna mobilku  = ");
	mobilku.warna = input.nextLine(); // utk int
        System.out.println("Masukan tahun produksi mobilku = ");
	mobilku.tahunProduksi = input.nextInt();
        
        System.out.println("Masukan warna mobilku  = ");
	mobilku.warna = input.nextLine(); // utk int
        System.out.println("Masukan tahun produksi mobilku = ");
	mobilku.tahunProduksi = input.nextInt();
        
        //memanggil atribut dan memberi nilai
//        mobilku.warna ="Hitam";
//        mobilku.tahunProduksi = 2006;
//        mobilmu.warna = "Hijau";
//        mobilmu.tahunProduksi = 2010;
            
        System.out.println("Warna = "+mobilku.warna);
        System.out.println("Tahun = "+mobilku.tahunProduksi);
        
        System.out.println("Warna = "+mobilmu.warna);
        System.out.println("Tahun = "+mobilmu.tahunProduksi);
        
        mobilku.hidupkanMobil();
        mobilku.matikanMobil();
        mobilku.ubahGigi();
        
        //Hafid BS - A11.2019.11762
    }
}

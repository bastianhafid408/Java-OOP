/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3;

import java.util.Scanner;

/**
 * Hafid Bastian - A11.2019.11762
 * @author bastianhafid408
 */
public class mobil2demo {
    String warna;
    int tahunProduksi;
    
    public void hidupkanMobil(){
        System.out.println("Hidup kan mobil : "+warna);
    }
    public void matikanMobil(){
        System.out.println("Matikan mobil : "+warna);
    }
    public void ubahGigi(){
        System.out.println("Ubah Gigi : "+warna);
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }
    public mobil2demo(String warna, int tahunProduksi){ 
        this.warna = warna; 
        this.tahunProduksi = tahunProduksi; 
    } 
    public void info(){ 
        System.out.println("Warna: " + this.warna); 
        System.out.println("Tahun: " + this.tahunProduksi);
    } 
}
class konstruktor{
    public static void main(String[] args){
        //membuat objek
          mobil2demo mobilku = new mobil2demo("merah",2003);
//        mobil2 mobilmu;
//        mobilmu = new mobil2();
          
        
//        //utk inputan 
//        System.out.println("== Untuk Inputan mobil ==");
//        // //Inputan
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Masukan warna mobilku  = ");
//	mobilku.warna = input.nextLine(); 
//        System.out.println("Masukan tahun produksi mobilku = ");
//	mobilku.tahunProduksi = input.nextInt();
        
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("Masukan warna mobilmu  = ");
//	mobilmu.warna = input2.nextLine(); 
//        System.out.println("Masukan tahun produksi mobilmu = ");
//	mobilmu.tahunProduksi = input2.nextInt();

        // memanggil atribut dan memberi nilai
//       mobilku.warna ="Hitam";
//       mobilku.tahunProduksi = 2006;
//       mobilmu.warna = "Hijau";
//       mobilmu.tahunProduksi = 2010;
            
        System.out.println("Warna = "+mobilku.warna);
        System.out.println("Tahun = "+mobilku.tahunProduksi);
        
//        System.out.println("Warna = "+mobilmu.warna);
//        System.out.println("Tahun = "+mobilmu.tahunProduksi);
        
        mobilku.hidupkanMobil();
        mobilku.matikanMobil();
        mobilku.ubahGigi();
        mobilku.info(); 
        //Hafid BS - A11.2019.11762
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

import java.util.Scanner;

/**
 * Hafid Bastian - A11.2019.11762
 * @author bastianhafid408
 */
class mobil2 {
    private String warna;
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
   public static void main(String[] args){
        //membuat objek
        mobil2 mobilku = new mobil2();
        mobil2 mobilmu;
        mobilmu = new mobil2();
        
        //utk inputan 
        System.out.println("== Untuk Inputan mobil ==");
        // //Inputan
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan warna mobilku  = ");
	mobilku.warna = input.nextLine(); 
        System.out.println("Masukan tahun produksi mobilku = ");
	mobilku.tahunProduksi = input.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukan warna mobilmu  = ");
	mobilmu.warna = input2.nextLine(); 
        System.out.println("Masukan tahun produksi mobilmu = ");
	mobilmu.tahunProduksi = input2.nextInt();

        // memanggil atribut dan memberi nilai
//       mobilku.warna ="Hitam";
//       mobilku.tahunProduksi = 2006;
//       mobilmu.warna = "Hijau";
//       mobilmu.tahunProduksi = 2010;
            
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


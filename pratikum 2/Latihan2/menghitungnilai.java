/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;
//import java.util.Scanner;
/**
 * A11.2019.11762 - Hafid Bastian S
 * @author bastianhafid408
 */
class menghitungnilai {
    String nama,nim;
    double nilaiUts,nilaiTugas,nilaiUas;
    double uts,uas,tugas,akhir;
    
    void hitungNilai(){
        uts = nilaiUts*0.35;
        uas = nilaiUas*0.45;
        tugas = nilaiTugas*0.20;
        akhir = uts+uas+tugas;
    }
    void cetakNilai(){
        System.out.println("===HITUNG NILAI===");
        System.out.println("Nim : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Nilai Tugas : "+nilaiTugas+"\t20%\t"+":"+((float)tugas));
        System.out.println("Nilai UTS : "+nilaiUts+"\t35%\t"+":"+(float)uts);
        System.out.println("Nilai UAS : "+nilaiUas+"\t45%\t"+":"+(float)uas);
        System.out.println("Nilai Akhir : "+(float)akhir);
    }
    
    public static void main(String[] args){
        menghitungnilai siswa = new menghitungnilai();
        siswa.nama = "Hafid Bastian S";
        siswa.nim  = "A11.2019.11762";
        siswa.nilaiTugas = 80.0;
        siswa.nilaiUts = 90.0;
        siswa.nilaiUas = 87.0;
        
//        System.out.println("== Untuk Inputan Nilai Siswa ==");
//        //Inputan
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nama                  = ");
//	      siswa.nama = input.nextLine(); 
//        System.out.println("Nim                   = ");
//	      siswa.nim = input.nextLine();
//        System.out.println("Nilai Tugas ( Float ) = ");
//        siswa.nilaiTugas = input.nextDouble();
//        System.out.println("Nilai Uts( Float )    = ");
//	      siswa.nilaiUts = input.nextDouble();
//        System.out.println("Nilai Uas ( Float )   = ");
//	      siswa.nilaiUas = input.nextDouble();
        
       siswa.hitungNilai();
       siswa.cetakNilai();
        
    }
}

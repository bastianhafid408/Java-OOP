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
public class matematika {
    void pertambahan (int bil1,int bil2){
        System.out.println("Pertambahan");
        System.out.println("Hasil\t: "+bil1+" + "+bil2+" = "+(bil1 + bil2));
    }
    void pengurangan (int bil1,int bil2){
        System.out.println("\nPengurangan");
        System.out.println("Hasil\t: "+bil1+" - "+bil2+" = "+(bil1 - bil2));
    }
    void perkalian (int bil1,int bil2){
        System.out.println("\nPerkalian");
        System.out.println("Hasil\t: "+bil1+" * "+bil2+" = "+(bil1 * bil2));
    }
    void pembagian (int bil1,int bil2){
        System.out.println("\nPembagian");
        System.out.println("Hasil\t: "+bil1+" / "+bil2+" = "+(bil1 / bil2));
    }
}

class matematikademo{
    public static void main (String[] args){
        matematika hasil = new matematika();
        
        //int
        hasil.pertambahan(20, 20);
        hasil.pengurangan(10, 5);
        hasil.perkalian(10, 20);
        hasil.pembagian(20,2);
             
        
        //inputan
        Scanner inputhasil = new Scanner(System.in);
        System.out.println("===\nInputan Untuk Matematika===");
        System.out.println("==Penjumlahan===");
        System.out.print("Masukan input bilangan 1\t:");
        int bil1= inputhasil.nextInt();
        System.out.print("Masukan input bilangan 2\t:");
        int bil2= inputhasil.nextInt();
        hasil.pertambahan(bil1, bil2);
        
        System.out.println("\n==Pengurangan===");
        System.out.print("Masukan input bilangan 1\t:");
        bil1 = inputhasil.nextInt();
        System.out.print("Masukan input bilangan 2\t:");
        bil2= inputhasil.nextInt();
        hasil.pengurangan(bil1, bil2);
        
        System.out.println("\n==Perkalian===");
        System.out.print("Masukan input bilangan 1\t:");
        bil1 = inputhasil.nextInt();
        System.out.print("Masukan input bilangan 2\t:");
        bil2= inputhasil.nextInt();
        hasil.perkalian(bil1, bil2);
   
        System.out.println("\n==Pembagian===");
        System.out.print("Masukan input bilangan 1\t:");
        bil1 = inputhasil.nextInt();
        System.out.print("Masukan input bilangan 2\t:");
        bil2= inputhasil.nextInt();
        hasil.pembagian(bil1, bil2);
    }
}



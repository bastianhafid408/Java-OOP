/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3;
import java.util.Scanner;
/**
 * Hafid Bastian S - A11.2019.11762
 * @author bastianhafid408
 */
public class matematikaDemo {
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
        System.out.println("Masukan input bilangan 1\t:");
        int bil1= inputhasil.nextInt();
        System.out.println("Masukan input bilangan 2\t:");
        int bil2= inputhasil.nextInt();
        
        hasil.pertambahan(bil1, bil2);
        hasil.pengurangan(bil1, bil2);
        hasil.perkalian(bil1, bil2);
        hasil.pembagian(bil1, bil2);
    }
}

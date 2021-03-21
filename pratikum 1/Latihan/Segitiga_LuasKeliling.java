/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.Scanner; //utk mengambil nilai dari keyboard
/**
 * Hafid Bastian S - A11.2019.11762
 * @author bastianhafid408
 */
public class Segitiga_LuasKeliling {
    public static void main(String[] args){
        int a,t,sisi,luas,keliling;
        a = 10;
        t = 2;
        sisi = 3;
        
        System.out.println("====Luas Segitiga====");
        luas =(a*t)/2;
        System.out.println("Diketahui :");
        System.out.println("Alas    : "+a);
        System.out.println("Tinggi  : "+t);
        System.out.println("Ditanya : L ?");
        System.out.println("Dijawab : L = a * t / 2");
        System.out.println("luas = "+a+ "*"+t+ "/2 = " +luas);
        System.out.println("Jadi hasil dari luas adalah "+luas+" cm");
        System.out.println("=====================");
       
        
        System.out.println("====Keliling Segitiga====");
        keliling = 3*sisi;
        System.out.println("Diketahui :");
        System.out.println("Sisi    : 3");
        System.out.println("Ditanya : Keliling Segitiga");
        System.out.println("Dijawab : K = 3*sisi");
        System.out.println("Keliling = 3 "+ "* "+sisi+ " = " +keliling);
        System.out.println("Jadi hasil dari keliling adalah "+keliling+" cm");
        System.out.println("========================");
        
        //Inputan
        Scanner input = new Scanner(System.in);
        //keliling
        System.out.println("Masukan sisi   = ");
	sisi = input.nextInt(); // utk int
        System.out.println("Masukan tinggi = ");
	t = input.nextInt();
        System.out.println("Masukan alas   = ");
	a = input.nextInt();
        
        int hasil1,hasil2;
        hasil1 = 3*sisi;
        hasil2 = (a*t)/2;
        
        System.out.println("========================");
        System.out.println("===========Inputan=============");
        System.out.println("===========Keliling============");
        System.out.println("Sisi    : "+sisi);
        System.out.println("Rumus Keliling segitiga : K = 3*sisi");
        System.out.println("Keliling = 3 "+ "* "+sisi+ " = " +hasil1);
        System.out.println("Jadi hasil dari luas adalah "+hasil1+" cm");
        System.out.println("========================");
        
        System.out.println("========================");
        System.out.println("===========Luas================");
        System.out.println("Alas    : "+a);
        System.out.println("Tinggi  : "+t);
        System.out.println("Rumus Luas segitiga : L = a * t / 2");
        System.out.println("luas = "+a+ "*"+t+ "/2 = " +hasil2);
        System.out.println("Jadi hasil dari luas adalah "+hasil2+" cm");
        System.out.println("===============================");
        
    }
}

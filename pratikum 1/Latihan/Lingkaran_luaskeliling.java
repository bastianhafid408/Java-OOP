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
public class Lingkaran_luaskeliling {
    public static void main(String[] args){
        int phi,r,luas,keliling;
        phi = 22/7;
        r = 7;
        
        System.out.println("====Luas Lingkaran====");
        luas = phi*r*r;
        System.out.println("Diketahui :");
        System.out.println("phi   = 22/7");
        System.out.println("r     = 7");
        System.out.println("Ditanya = Luas Lingkaran?");
        System.out.println("Dijawab : phi*r*r");
        System.out.println("luas = "+phi+ " * "+r+ " * "+r+" = "+luas);
        System.out.println("Jadi hasil dari luas adalah "+luas+" cm");
        System.out.println("=====================");
        
        System.out.println("====Keliling Lingkaran====");
        keliling = 2*phi*r;
        System.out.println("Diketahui :");
        System.out.println("Diketahui :");
        System.out.println("phi   = 22/7");
        System.out.println("r     = 7");
        System.out.println("Ditanya : Keliling lingkaran?");
        System.out.println("Dijawab : 2*phi*r ");
        System.out.println("Keliling = 2 "+ " * "+phi+ " * "+r+ " = "+keliling);
        System.out.println("Jadi hasil dari keliling adalah "+keliling+" cm");
        System.out.println("===========================");
        
        //inputan
        Scanner input = new Scanner(System.in);
        //keliling
        System.out.println("Masukan jari - jari  = ");
	r = input.nextInt(); // utk int
        
        float hasil1,hasil2;
        hasil1 = 2*phi*r;
        hasil2 = phi*r*r;
                
        System.out.println("========================");
        System.out.println("===========Inputan=============");
        System.out.println("===========Keliling============");
        System.out.println("Jari - jari    : "+r);
        System.out.println("Rumus Keliling lingkaran  : K = 2*phi*r");
        System.out.println("Keliling = 2 "+ " * "+phi+ " * "+r+ " = "+hasil1);
        System.out.println("Jadi hasil dari keliling adalah "+hasil1+" cm");
        System.out.println("========================");        
        
        System.out.println("========================");
        System.out.println("===========Luas================");
        System.out.println("Jari - jari    : "+r);
        System.out.println("Rumus Luas lingkaran : L =phi*r*r");
        System.out.println("luas = "+phi+ " * "+r+ " * "+r+" = "+hasil2);
        System.out.println("Jadi hasil dari luas adalah "+hasil2+" cm");
        System.out.println("===============================");
        
    }
}

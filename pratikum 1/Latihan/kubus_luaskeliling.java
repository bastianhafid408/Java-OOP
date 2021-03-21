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
public class kubus_luaskeliling {
    public static void main(String[] args){
        int sisi,luas,keliling;
        sisi = 5 ;
        
        System.out.println("====Luas Kubus====");
        luas = 6*sisi*sisi;
        System.out.println("Diketahui :");
        System.out.println("Sisi = 5");
        System.out.println("Ditanya : Luas Kubus");
        System.out.println("Dijawab : L = 6*sisi*sisi");
        System.out.println("Luas = 6 "+ " * "+sisi+" * "+sisi+ " = "+luas);
        System.out.println("Jadi hasil dari luas adalah "+luas+" cm");
        System.out.println("=====================");
        
        
        System.out.println("====Keliling Kubus====");
        keliling = 12*sisi;
        System.out.println("Diketahui :");
        System.out.println("Sisi = 5");
        System.out.println("Ditanya : Keliling Kubus");
        System.out.println("Dijawab : K = 12*sisi");
        System.out.println("Keliling : 12"+ " * "+sisi+ " = "+keliling);        
        System.out.println("Jadi hasil dari keliling adalah "+keliling+" cm");
        System.out.println("=====================");
        
        //inputan
        Scanner input = new Scanner(System.in);
        //keliling
        System.out.println("Masukan sisi  = ");
	sisi = input.nextInt(); //utk int
        
        int hasil1,hasil2;
        hasil1 = 12*sisi;
        hasil2 = 6*sisi*sisi;
        
        System.out.println("========================");
        System.out.println("===========Inputan=============");
        System.out.println("===========Keliling============");
        System.out.println("Sisi  : "+sisi);
        System.out.println("Rumus Keliling Kubus: K = 12*sisi");
        System.out.println("Keliling : 12"+ " * "+sisi+ " = "+hasil1);  
        System.out.println("Jadi hasil dari Keliling adalah "+hasil1+" cm");
        System.out.println("========================"); 
        
        System.out.println("========================");
        System.out.println("===========Inputan=============");
        System.out.println("===========Luas============");
        System.out.println("Sisi   : "+sisi);
        System.out.println("Rumus Keliling Kubus: L = 6*sisi*sisi");
        System.out.println("Keliling : 12"+ " * "+sisi+ " = "+hasil2);  
        System.out.println("Jadi hasil dari luas adalah "+hasil2+" cm");
        System.out.println("========================"); 
        
    }
    
}

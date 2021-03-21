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
public class Data_Pribadi {
    public static void main(String  [] args){
        System.out.println("NIM       : A11.2019.11762");
        System.out.println("Nama      : Hafid Bastian S");
        System.out.println("Alamat    : Desa Getasrejo, Grobogan, Jawa Tengah, Indonesia");
        System.out.println("Kota      : Grobogan");
        System.out.println("Kode Pos  : 58152");
        System.out.println("Telp      : +62895358021874");
        System.out.println("Hp        : +62895358021874");
        System.out.println("Email     : bastianhafid408@gmail.com");
        
        //inputan
        System.out.println("==Inputan Data Diri==");
        Scanner input = new Scanner(System.in);
        //Deklarasi
        String nim,nama,alamat,kota,kode_pos,telp,hp,email;
        
        System.out.println("Masukan Nim       = ");
	nim = input.nextLine(); // utk String
        System.out.println("Masukan Nama      = ");
	nama = input.nextLine(); 
        System.out.println("Masukan Alamat    = ");
	alamat= input.nextLine(); 
        System.out.println("Masukan Kota      = ");
	kota= input.nextLine(); 
        System.out.println("Masukan Kode pos  = ");
	kode_pos= input.nextLine(); 
        System.out.println("Masukan Telp      = ");
	telp = input.nextLine(); 
        System.out.println("Masukan Hp        = ");
	hp= input.nextLine(); 
        System.out.println("Masukan Email     = ");
	email= input.nextLine(); 
        
        System.out.println("===Hasil Data Diri===");
        System.out.println("NIM       : "+nim);
        System.out.println("Nama      : "+nama);
        System.out.println("Alamat    : "+alamat);
        System.out.println("Kota      : "+kota);
        System.out.println("Kode Pos  : "+kode_pos);
        System.out.println("Telp      : "+telp);
        System.out.println("Hp        : "+hp);
        System.out.println("Email     : "+email);
        System.out.println("====================");
        
        
        
    }
}

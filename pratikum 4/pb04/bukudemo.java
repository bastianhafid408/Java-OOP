/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb04;

import java.util.Scanner;

/**
 * Hafid Bastian - A11.2019.11762
 *
 * @author bastianhafid408
 */
class buku {

    String judul, pengarang, penerbit;
    int tahun;

    public buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public void info() {
        System.out.println("Judul     :" + this.judul);
        System.out.println("Pengarang :" + this.pengarang);
        System.out.println("Penerbit  :" + this.penerbit);
        System.out.println("Tahun     :" + this.tahun);
    }
}

public class bukudemo {

    public static void main(String[] args) {
        System.out.println("Nama\t: Hafid Bastian");
        System.out.println("Nim\t: A11.2019.11762");
        System.out.println("Kelas\t: A11.4416");
        System.out.println("==========================\n");

        buku buku1 = new buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        buku buku2 = new buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
        buku1.info();
        buku2.info();

        System.out.println("\n===Modifikasi===");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Buku : ");
        int n = input.nextInt();

        //Deklarasi array
        String judul[] = new String[n];
        String pengarang[] = new String[n];
        String penerbit[] = new String[n];
        int tahun[] = new int[n];

        //Input data ke array
        for (int i = 0; i < n; i++) {
            System.out.print("Judul " +( i+1 )+" : ");
            judul[i] = input.next();
            System.out.print("Pengarang  :");
            pengarang[i] = input.next();
            System.out.print("Penerbit   :");
            penerbit[i] = input.next();
            System.out.print("Tahun      :");
            tahun[i] = input.nextInt();
            input.nextLine();
        }
        //cetak array
        System.out.println("Output Yang telah anda inputkan");
        for (int i = 0; i < n; i++) {
            buku bukubaru = new buku(judul[i], pengarang[i], penerbit[i], tahun[i]);
            bukubaru.info();
        }
    }
}

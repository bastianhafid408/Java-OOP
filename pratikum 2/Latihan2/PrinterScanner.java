/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;
//import java.util.Scanner; //utk mengambil nilai dari keyboard
/**
 * Hafid Bastain - A11.2019.11762
 * @author bastianhafid408
 */
public class PrinterScanner {
    String Tinta,Cattridge;
    int kertas = 0;
    int ccd = 0;
    
    void FotoCopy(){
        kertas = kertas + 1;
        System.out.println("Hasil FotoCopy berupa gambar / teks :"+kertas);
    }
    void CetakDokumen(){
        kertas = kertas + 2;
        System.out.println("Hasil FotoCopy berupa gambar / teks :"+kertas);
    }
    void ScanDokumen(){
        ccd = ccd + 1;
        System.out.println("Jumlah Sensor Sinar pantulan (CCD) : "+ccd);
        System.out.println("Cetak scan gambar atau teks");
    }
}

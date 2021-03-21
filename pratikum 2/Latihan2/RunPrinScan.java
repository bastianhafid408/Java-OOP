/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package Latihan2;

/**
 * Hafid BAstian S - A11.2019.11762
 * @author bastianhafid408
 */
public class RunPrinScan {
    public static void main(String[] args){
        PrinterScanner tipe = new PrinterScanner();
        
        tipe.Tinta = "Tinta Epson 664 Original (B.C.M.Y) untuk L300 L310 L360";
        tipe.Cattridge = "Cartridge Tinta CISS Epson L110 L120 L360 Black Cyan Magenta Yellow";
        tipe.kertas = 1 ;
        tipe.ccd = 1;
     
        System.out.println("===Epson L360===");
        System.out.println("Tipe Tinta Printer Scanner Epson L360 : "+tipe.Tinta);
        System.out.println("Tipe Cattridge Printer Scanner Epson L360 :"+tipe.Cattridge);
        System.out.println("Jumlah kertas yang disiapkan :"+tipe.kertas);
        System.out.println("Jumlah CCD yang disiapkan :"+tipe.ccd);
        
        tipe.FotoCopy();
        tipe.CetakDokumen();
        tipe.ScanDokumen();
    }
}

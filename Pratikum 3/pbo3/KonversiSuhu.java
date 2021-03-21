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
public class KonversiSuhu {
    void kelvin(double suhu){      
        System.out.println("Konversi Suhu Kelvin");
        System.out.println("Rumus\t: K = °C + 273,15 ");
        System.out.println("Hasil K \t:"+suhu+" + 273,15 = "+(suhu+273.15)+" K");
    }
    void fahrenheit(double suhu){
        System.out.println("\nKonversi Suhu Fahrenheit");
        System.out.println("Rumus\t: °F = °C × 1,8 + 32 ");
        System.out.println("Hasil °F\t:"+suhu+" x 1,8 + 32 = "+(suhu*1.8+32)+" °F");
    }
    void rankine(double suhu){
        System.out.println("\nKonversi Suhu Rankine");
        System.out.println("Rumus\t: °Ra = C × 1,8 + 491,67 ");
        System.out.println("Hasil °Ra\t:"+suhu+" x 1,8 + 491,67 = "+(suhu*1.8+491.67)+" °Ra");
    }
    void delisle(double suhu){
        System.out.println("\nKonversi Suhu Delisle ");
        System.out.println("Rumus\t: °De = (100 − °C) × 1,5");
        System.out.println("Hasil °De\t:(100 - "+suhu+" ) x 1,5 = "+((100-suhu)*1.5)+" °De");
    } 
    void newton(double suhu){
        System.out.println("\nKonversi Suhu Newton");
        System.out.println("Rumus\t: °N = °C × 33/100");
        System.out.println("Hasil °N\t:"+suhu+" x 33 / 100 = "+(suhu*33/100)+" °N");
    }
    void réaumur (double suhu){
        System.out.println("\nKonversi Suhu Réaumur");
        System.out.println("Rumus\t: °Ré = °C × 0,8 ");
        System.out.println("Hasil °Ré\t:"+suhu+" x 0,8 = "+(suhu*0.8)+" °Ré");
    }
    void rømer (double suhu){
        System.out.println("\nKonversi Suhu Rømer");
        System.out.println("Rumus\t: °Rø = °C × 21/40 + 7,5");
        System.out.println("Hasil °Rø:"+suhu+" x 21/40 + 7,5 = "+(suhu*21/40+7.5)+" °Rø");
    }
        
}
class KonversiSuhuDemo{
    public static void main(String[] args){
        KonversiSuhu hasil = new KonversiSuhu();
        
        hasil.kelvin(2.2);
        hasil.fahrenheit(9.2);
        hasil.rankine(3.2);
        hasil.delisle(7.8);
        hasil.newton(5.5);
        hasil.réaumur(5.9);
        hasil.rømer(2.22);
        
        //inputan
          //inputan
        Scanner inputhasil = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("=Inputan Konversi Suhu=");
        System.out.println("=====Input Kelvin======");
        System.out.print("Masukan input bilangan desimal\t:");
        double suhu= inputhasil.nextDouble();
        hasil.kelvin(suhu);
        
        System.out.println("\n=====Input Fahrenheit======");
        System.out.print("Masukan input bilangan desimal\t:");
        suhu= inputhasil.nextDouble();
        hasil.fahrenheit(suhu);
        
        System.out.println("\n=====Input Rankine======");
        System.out.print("Masukan input bilangan desimal\t:");
        suhu= inputhasil.nextDouble();
        hasil.rankine(suhu);
        
        System.out.println("\n=====Input Delisle======");
        System.out.print("Masukan input bilangan desimal\t:");
        suhu= inputhasil.nextDouble();
        hasil.delisle(suhu);
        
        System.out.println("\n=====Input Newton=======");
        System.out.print("Masukan input bilangan desimal\t:");
        suhu= inputhasil.nextDouble();
        hasil.newton(suhu);
        
        System.out.println("\n=====Input Réaumur======");
        System.out.print("Masukan input bilangan desimal\t:");
        suhu= inputhasil.nextDouble();
        hasil.réaumur(suhu);
        
        System.out.println("\n=====Input Rømer=======");
        System.out.print("Masukan input bilangan desimal\t:");
        suhu= inputhasil.nextDouble();
        hasil.rømer(suhu);
        System.out.println("=======================");
    }
}



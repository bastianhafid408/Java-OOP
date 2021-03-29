/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb04;
import java.util.Scanner;
/**
 * Hafid Bastian - A11.2019.11762
 * @author bastianhafid408
 */
class konversi {
    int detik;
    public konversi( int detik){
        this.detik=detik;      
    }
    public void info(){
        System.out.println("\nKonversi  detik ke hari, jam, menit, detik");
        System.out.println("Detik\t: "+(this.detik)+" Detik");
        System.out.println("Hari\t: "+this.detik+" / 86400         \t  : "+(this.detik/86400)+" Hari");
        System.out.println("Jam\t: ( "+this.detik+" % 86400 ) /3600\t  : "+(this.detik%86400)/3600+" Jam");
        System.out.println("Menit\t: ( "+this.detik+" % 3600 ) / 60\t  : "+(this.detik%3600)/60+" Menit");
        System.out.println("Detik\t: ( "+this.detik+" % 60 ) % 60  \t  : "+(this.detik%60)%60+" Detik");
    }
}

public class konversidemo{
    public static void main(String[] args){
        System.out.println("=======================");
        System.out.println("Nama\t: Hafid Bastian");
        System.out.println("Nim\t: A11.2019.11762");
        System.out.println("Kelas\t: A11.4416");
        System.out.println("=======================");
        
        konversi detik = new konversi(180061);
        detik.info();
        
        System.out.println("\n====Modifikasi=======");
       // membuat variabel dan Scanner
        String kon;
        Scanner input= new Scanner(System.in);

        // mengambil input
        System.out.println("=====================================");
        System.out.println("=======Inputkan nama Konversi========");
        System.out.println("==(Detik)==(Hari)==(Jam)==(Menit)====");
        System.out.print("Masukan nama Konversi : ");
        kon = input.nextLine();

        switch(kon){
            case "Detik":
                System.out.print("Berapa Kali anda akan menggunakan konversi : ");
                int n = input.nextInt();

                //Deklarasi array
                int dtk[] = new int[n];

                //Input data ke array
                for (int i = 0; i < n; i++) {
                    System.out.print("Konversi Detik " +( i+1 )+" : ");
                    dtk[i] = input.nextInt();
                    input.nextLine();
                }
                //cetak array
                System.out.println("Output Yang telah anda inputkan");
                for (int i = 0; i < n; i++) {
                    konversi dtkbaru = new konversi(dtk[i]);
                    dtkbaru.info();
                }
                break;
  
            case "Menit":
                System.out.print("Berapa Kali anda akan menggunakan konversi : ");
                int m = input.nextInt();

                //Deklarasi array
                int mnt[] = new int[m];

                //Input data ke array
                for (int i = 0; i < m; i++) {
                    System.out.print("Konversi menit " +( i+1 )+" : ");
                    mnt[i] = input.nextInt();
                    input.nextLine();
                }
                //cetak array
                System.out.println("Output Yang telah anda inputkan");
                for (int i = 0; i < m; i++) {
                    konversi dtkbaru = new konversi(mnt[i]);
                    dtkbaru.info();
                }
                break;
            default:
                System.out.println("Sayah!");
        }
    }
}

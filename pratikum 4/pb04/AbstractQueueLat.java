/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb04;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
/**
 *
//  * @author bastianhafid408
 */
public class AbstractQueueLat {
    public static void main(String[] argv) throws Exception
    {
        // membuat object AbstractQueue
        AbstractQueue<Integer> AQ = new LinkedBlockingQueue<>();
  
        // menambah element
        AQ.add(10);
        AQ.add(20);
        AQ.add(30);
  
        // mencetak queue
        System.out.println("AbstractQueue : " + AQ);
        
        //hapus
        // megambambil kemballi head
        int head = AQ.remove();
  
        // print head
        System.out.println("head : " + head);
  
        // print the modified
        System.out.println("AbstractQueue1 setelah pengangkatan head : " + AQ);
  
        // hapus semua element
        AQ.clear();
  
        // print sehabis di modifikasi
        System.out.println("AbstractQueue  : " + AQ);
    }
}


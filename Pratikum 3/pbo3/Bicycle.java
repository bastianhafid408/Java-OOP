/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3;

/**
 *
 * @author bastianhafid408
 */
public class Bicycle {
    int speed = 0;
    int gear = 0;   
    
//  Bicycle(int speed, int gear){
//      this.gear = gear ;
//       his.speed = speed;    
//    }
        
    void changeGear (int newValue){
        gear = gear + newValue;
//      gear =   +newValue;
//      System.out.println("Gear\t:"+ gear+" + "+newValue+" = "+gear);
        System.out.println("Gear\t:"+gear);
    }
    void speedUp (int increment){
        speed = speed + increment;
//      speed =  +increment;
        System.out.println("Speed\t:"+ speed);
//      System.out.println("Speed\t:"+ speed+" + "+increment+" = "+speed);
    }
}
class BicyleDemo{
    public static void main (String[] args){
        Bicycle bike = new Bicycle();
//      Bicycle bike = new Bicycle(10,2);
        
        bike.speed=10;
        bike.gear=2;
        
        bike.speedUp(10);
        bike.changeGear(2);
    }
}
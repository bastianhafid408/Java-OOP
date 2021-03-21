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
public class BicycleDemo {
    public static void main (String[] args){
        Bicycle bike = new Bicycle();
//        Bicycle bike = new Bicycle(10,2);
        
        bike.speed=10;
        bike.gear=2;
        
        bike.speedUp(10);
        bike.changeGear(2);
       
    }
}

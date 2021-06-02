/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo9pratikum;

/**
 *
 * @author bastianhafid408
 */
public class Account {
    protected double balance ;
    protected Account(double initBalance) {
        balance = initBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amt){
        balance = balance +amt;
    }
    public void withdraw(double amt) throws OverdraftException{
        if (amt<=balance) {
            balance = balance - amt;
        } else {
            throw new OverdraftException("Dana Anda tidak cukup", amt-balance);
        }
    }

public static void main (String[] args) {
        int i;
        Account [] accounts = new Account[100];
        accounts[0] = new Account(2000000);
        accounts[1] = new Account(0);
        for (i = 0; i<2; i++) {
            double b = accounts[i].getBalance();
            System.out.println("Saldo akhir account ke " + i +" =" +b);
            try {
                accounts[i].withdraw(1000000);
            }catch (OverdraftException ode) {
                System.err.println("Eksepsi account "+i+" = " +ode);
            }
        }
    }
}

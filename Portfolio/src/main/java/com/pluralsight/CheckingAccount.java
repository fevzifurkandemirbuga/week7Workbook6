package com.pluralsight;

public class CheckingAccount extends Account{

    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void deposit(double amount){

        super.setBalance(super.getBalance()+amount);

    }

    public void withdraaw(double amount){
        if(super.getBalance()<amount){
            System.out.println("Transaction declined: insufficient funds");
        }
        else{
            super.setBalance(super.getBalance()-amount);
        }
    }

    @Override
    public double getValue() {
        return super.getBalance();
    }
}

package com.pluralsight;

public class CreditCard extends Account{

    public CreditCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void charge(double amount){
        super.setBalance(super.getBalance() + amount);
    }

    public void pay(double amount){

        super.setBalance(super.getBalance() - amount);

    }


    @Override
    public double getValue() {
        return super.getBalance();
    }
}

package com.pluralsight;

public class App {

    public static void main(String[] args) {
        Account account1= new CheckingAccount("pam", "123456", 12500);
        Valuable account2=new CheckingAccount("gary", "654321", 1500);
        CheckingAccount account3= new CheckingAccount("ted","789987",2000);


        Portfolio portfolio=new Portfolio("adam","zack");
        portfolio.add(account1);
        portfolio.add(account2);
        portfolio.add(account3);

        System.out.println(portfolio.getMostValuable().toString());

    }

}

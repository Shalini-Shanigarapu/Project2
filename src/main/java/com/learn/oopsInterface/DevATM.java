package com.learn.oopsInterface;

public class DevATM implements ATM, ATM1{
    @Override
    public  void deposit(){
        System.out.println("Deposit amount");

    }
    @Override
    public  void withdrawal(){
        System.out.println("withdraw amount");

    }
    @Override
    public  void ministatement(){
        System.out.println("print statement");

    }

    @Override
    public void pin() {
        System.out.println("change pin number");

    }

    @Override
    public void balance() {
        System.out.println("check available balance");

    }
}

package com.learn.oopsInterface;

import com.learn.oopsAbstraction.Calculator;

public class UserATM {
    public static void main(String[] args){
        ATM a1 = new DevATM();
        ATM1 a2 = new DevATM();
        a1.deposit();
        a1.withdrawal();
        a1.ministatement();
        a2.pin();
        a2.balance();
        Calculator cl = new Both();
        cl.add(1,3);
        cl.add(5,4,3);
        ATM a3 = new Both();
        a3.deposit();
        a3.ministatement();
        a3.withdrawal();

    }
}

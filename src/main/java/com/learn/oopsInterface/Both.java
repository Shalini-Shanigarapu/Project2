package com.learn.oopsInterface;

import com.learn.oopsAbstraction.Calculator;

public class Both extends Calculator implements ATM {
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void add(int a, int b, int c) {
        System.out.println(a+b+c);

    }

    @Override
    public void deposit() {
        System.out.println("dd");
    }

    @Override
    public void withdrawal() {
        System.out.println("dff");

    }

    @Override
    public void ministatement() {
        System.out.println("dd");

    }
}

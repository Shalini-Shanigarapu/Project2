package com.learn.oopsAbstraction;

public class DevCal extends Calculator {
    @Override
    public void add(int a,int b){
        System.out.println(a+b);
    }
    @Override
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

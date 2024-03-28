package com.learn.oopsAbstraction;

public class UserCal {
    public static void main(String[] args){

        Calculator cal = new DevCal();
        cal.add(100,120);
        cal.add(1,2,3);
    }
}

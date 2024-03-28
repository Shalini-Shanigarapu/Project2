package com.learn.oopsInheritance;

public class InheritanceOverRide extends InheritanceChild1{
    @Override
    public void test5()
    {
        System.out.println("Method OverRide");
    }

    public static void main(String[] args){
        InheritanceOverRide ior = new InheritanceOverRide();
        ior.test5();




    }



}

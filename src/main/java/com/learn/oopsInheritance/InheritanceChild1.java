package com.learn.oopsInheritance;

public class InheritanceChild1 extends InheritanceChild{
    public static void main(String[] args){
        InheritanceChild1 ic1=new InheritanceChild1();
        ic1.test3();
        ic1.test1();
        System.out.println(ic1.str);
        System.out.println(ic1.a);

    }
    public void test5(){
        System.out.println("OverRide");
    }
}

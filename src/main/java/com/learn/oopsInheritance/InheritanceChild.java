package com.learn.oopsInheritance;

import com.learn.javaBasic.SampleProgram;

public class InheritanceChild extends InheritanceParent{
    public static void main(String[] args){
        InheritanceChild ic = new InheritanceChild();
        SampleProgram sampleProgram = new SampleProgram();
        ic.test1();
        test2();
        SampleProgram.sample2();
        sampleProgram.sample1();

    }
    public void test3(){
        System.out.println("program");
    }
}

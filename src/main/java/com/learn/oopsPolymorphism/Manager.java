package com.learn.oopsPolymorphism;

public class Manager extends Employee{
    @Override
    public void work() {
        System.out.println("Manager is Managing");

    }
    @Override
    public void task(){
        System.out.println("In progress");
    }
}

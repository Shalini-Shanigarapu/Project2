package com.learn.oopsEncapsulation;

public class LoginPage {
    public static void main(String[] args){

        GmailLogin gmailLogin = new GmailLogin();
        gmailLogin.setUsername("shalini@gmail.com");
        String A=gmailLogin.getUsername();
        gmailLogin.setPassword("Shalu123");
        String B=gmailLogin.getPassword();
        System.out.println(A+" "+B);

    }
}

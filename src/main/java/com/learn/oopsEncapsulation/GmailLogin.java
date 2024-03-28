package com.learn.oopsEncapsulation;

import java.util.Objects;

public class GmailLogin {
    private String username;
    private String password;
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getUsername(){
        if(username =="shalini@gmail.com"){
            return("valid username");
        }else
            return ("invalid username");
    }
    public String getPassword(){
        if(password == "Shalu123")
        {
            return("valid password");
        }else
            return ("invalid password");

    }

}

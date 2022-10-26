package com.codingPractice;

import java.util.*;
import java.lang.*;

class User{
    private int id;
    private String username;
    private String password;
    
    User(int id,String username,String password){
        this.id=id;
        this.username=username;
        this.password=password;
    }
    
    public int getId(){
        return this.id;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    
    public void setId(int id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
}

class UserBO{
    public User[] getUsers(){
        User[] obj = new User[]{new User(1,"Louis","rxfsuzA2345"),new User(2,"Messie","hpphmf1:"),new User(3,"Steve","opefKt"),new User(4,"Kallis","23456778"),new User(5,"Wipro","A$%")};
        return obj;
    }
    private String encryptPassword(String password){
        String Enc="";
        int ascii;
        for(char c:password.toCharArray()){
            ascii=(int)c;
            ascii++;
            c=(char)ascii;
            Enc=Enc+c;
        }
        return Enc;
    }
    boolean validate(String username,String password){
        User[] u = getUsers();
        int flag = 0;
        String Enp = encryptPassword(password);
        for(int i=0;i<u.length;i++){
            if(username.equals(u[i].getUsername())){
                if(Enp.equals(u[i].getPassword())){
                    flag = 1;
                }
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
}

class Coding1{
    public static void main(String args[]){
        String uname,pass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Username:");
        uname=sc.nextLine();
        System.out.println("Password:");
        pass=sc.nextLine();
        
        UserBO ub = new UserBO();
        boolean result = ub.validate(uname,pass);
        if(result == true) {
        	System.out.println("Login Successfull");
        }
        else {
        	System.out.println("Incorrect username/password");
        }
    }
}

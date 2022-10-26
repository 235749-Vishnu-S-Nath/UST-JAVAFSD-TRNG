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
    public User getUsers(){
        User[] obj = new User(1,"Louise","rxfsuzA2345"),new User(2,"Messie","hpphmf1:"),new User(3,"Steve","opefKt"),new User(4,"Kallis","23456778"),new User(5,"Wipro","A$%");
        return obj;
    }
    private String encryptPassword(String password){
        String Enc="";
        for(char c:password.toCharArray()){
            System.out.print(c);
        }
        return password;
    }
}

class Main{
    UserBO ub = new UserBO();
    User u = ub.getUsers();
    System.out.println(ub.encryptPassword("Vishnu"));
    
}

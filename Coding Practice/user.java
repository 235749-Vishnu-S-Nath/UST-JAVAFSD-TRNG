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
        User[] obj = new User[100];
        return obj;
    }
    private String encryptPassword(String password){
        
    }
}

class Main{
    
}

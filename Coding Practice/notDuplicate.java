import java.util.*;
import java.util.Scanner;
public class Main{
public static void main(String args[]){
    int j,i;
    String a="malayalam";
    for(i=0;i<a.length();i++){
       int f=0;
        for( j=0;j<a.length();j++){
            if(a.charAt(i)==a.charAt(j)){
                f++;
            }
        }
        if(f==1){
          System.out.println(a.charAt(i));
        }
    }
    
}
}

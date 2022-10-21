import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String spl[] = str.split(" ");
		for(int i=0;i<spl.length;i++){
		    StringBuffer sb = new StringBuffer(spl[i]);
		    System.out.print(sb.reverse()+" ");
		}
	}
}

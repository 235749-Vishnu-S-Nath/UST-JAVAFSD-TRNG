package ExceptionDay4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ustjavafsdb216\\output.txt"))){
			while((line = br.readLine())!=null) {
				System.out.println("Line => "+line);
			}
		}catch(IOException e) {
			System.out.println("IOException in try block => "+e.getMessage());
		}
	}

}

package ExceptionDay4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Throws_IOException {

	public static void findFile() throws IOException{
		File newFile = new File("C:\\Users\\ustjavafsdb216\\newFile1.txt");
		FileInputStream stream = new FileInputStream(newFile);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findFile();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}

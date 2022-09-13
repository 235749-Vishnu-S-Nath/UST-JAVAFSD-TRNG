package Exceptions;

import java.io.File;

public class File_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\ustjavafsdb216");
		String fileList[] = f.list();
		for(String str:fileList) {
			System.out.println(str);
		}
	}

}

package Enums;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParserDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = "14/10/2020";
		LocalDate localdate = LocalDate.parse(date,formatter);
		System.out.println("Parsed local date: "+localdate);
	}

}

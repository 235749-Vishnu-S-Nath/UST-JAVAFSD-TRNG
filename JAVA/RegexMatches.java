package Enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	private static final String REGEX = "\\bcat\\b";
	private static final String INPUT = "cat cat cat cattie cat";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		int count =0;
		while(m.find()) {
			count++;
			System.out.println("match number "+count);
			System.out.println("Start(): "+m.start());
			System.out.println("end(): "+m.end());
		}
	}

}



import java.util.Scanner;


import handle.Matching;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		String str;
		str = in.nextLine();
		str = Matching.inPut(str);
		
		System.out.println(str);
	}
	

}

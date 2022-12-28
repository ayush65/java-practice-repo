
package javaBasics;

import java.util.Scanner;

public class CharCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		char ch = sc.next().trim().charAt(0);
		
		System.out.println(ch); 
		
		if(ch >='a' && ch <= 'z') {
			System.out.println("It is a small letter");
		}
		else {
			System.out.println("it is a capital letter");
		}
	}

}

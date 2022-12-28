package javaBasics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a =  0;
		int b = 1;
		int sum = a + b;
		
		while (sum < n) { 
			int temp = a; 
			a = a + b;
			b = temp;
			sum++;
		}

	    System.out.println(a);
	}

}

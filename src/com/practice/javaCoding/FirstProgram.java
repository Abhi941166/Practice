package com.practice.javaCoding;

import java.util.Scanner;

public class FirstProgram {

	
	public class OddEven {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        
	        if (num % 2 == 0) {
	            System.out.println(num + " is Even.");
	        } else {
	            System.out.println(num + " is Odd.");
	        }
	        
	        scanner.close();
	    }
	}
}

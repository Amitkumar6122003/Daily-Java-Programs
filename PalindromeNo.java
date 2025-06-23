package com.mock;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
	
		int number  = sc.nextInt();
		int originalNumber = number;
		int reversed = 0;
		
		while (number !=0)
		{
			int digit = number %10;
			reversed= reversed*10+digit;
			number /=10;
		}
		if(originalNumber == reversed)
		{
			System.out.println(originalNumber + "is palindrome");
		}
		else
		{
			System.out.println(originalNumber + "is not palindrome");
		}
		
		

	}

}

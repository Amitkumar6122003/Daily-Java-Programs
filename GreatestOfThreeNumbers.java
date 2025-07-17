package com.practise;

import java.util.Scanner;

public class Greatestofthreenumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b= sc.nextInt();
		
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("greatest number is :"+a);
		}
		else if(b>c)
		{
			System.out.println("Gretest number is :"+b);
		}
		else if(a>c)
		{
			System.out.println("Greatest number is:"+c);
		}
		else
		{
			System.out.println("Any two are equal");
		}

	}

}

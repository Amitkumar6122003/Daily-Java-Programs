package com.practise;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the first number:");
         int a= sc.nextInt();
         
         System.out.println("Enter the second number");
         int b= sc.nextInt();
         
         if(a>b)
         {
        	 System.out.println("Greatest number:"+a);
        	 
         }
         
         else if(b>a)
         {
        	 System.out.println("Greatest number:"+b);
         }
         else
         {
        	 System.out.println("Both are equal");
         }
	}   

}

package com.practise;

import java.util.Scanner;

public class PrimeNUmberorNot {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int num=sc.nextInt();
	    int count=0;
	    for(int i=1;i<=num; i++)
	    {
	    	if(num%i==0)
	    	{
	    		count++;
	    	}
	    }
	    if(count==2)
	    {
	    	System.out.println(+num+ "is prime number");
	    }
	    else
	    {
	    	System.out.println(+num+ "is not prime number");
	    }
	}

}

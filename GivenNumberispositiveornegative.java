package com.practise;

import java.util.Scanner;

public class GivenNumberispositiveornegative {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the number");
       int num=sc.nextInt();
       if(num>0) {
    	  
    	  System.out.println("number is positive:"+num);
       }
       else if(num<0)
       {
    	   System.out.println("number is negative:"+num);
       }
       else
       {
    	   System.out.println("number is zero");
       }
	}

}

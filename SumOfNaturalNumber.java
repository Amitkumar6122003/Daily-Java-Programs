package com.practise;

import java.util.Scanner;

public class SumOfNaturalNumber {

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbebr");
		
		int n=sc.nextInt();
		int sum = n*(n+1)/2;
		System.out.println("sum of first "+n+" natural number is:" + sum);

	}

}

package com.string;

import java.util.Scanner;

public class Checkpass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String username= new String("amit");
		String password= new String("kadam");
		
		System.out.println("enter the username");
		String u = sc.nextLine();
		
		System.out.println("enter the password");
		String p = sc.nextLine();
		
		if(username.equals(u) && password.equals(p))
		{
			System.out.println("login succesfully");
		}
		else
		{
			System.out.println("wrong password");
		}

	}

}

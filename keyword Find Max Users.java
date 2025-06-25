package com.keywordexample;

public class User {
	public static final int MAX_user = 3;
    static int userCount = 0;
    
    public User()
    {
    	if (userCount>= User.MAX_user)
    	{
    		System.out.println("Cannot create user. Max user limit exceeded!");
    	}
    	else
    	{
    		System.out.println("User created successfully. Current user count: " + userCount);
    	}
    }

}

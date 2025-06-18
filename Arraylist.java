package com.collection;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=1; i<=10; i++)
		{
			al.add(i);
		}
		
		ArrayList<Integer> check = new ArrayList<>();
		check.add(10);
		check.add(11);
		check.add(12);
		
		System.out.println("Maiin list:" +al);
		System.out.println("Check list:" +check);
		
        for(Integer num:check)
        {
        	if(al.contains (num))
        	{
        	System.out.println("Element" + num + "exist in al");
        }
        else
        {
        	System.out.println("Element" + num + "does not exist in al");
        }
	
	}

}
}

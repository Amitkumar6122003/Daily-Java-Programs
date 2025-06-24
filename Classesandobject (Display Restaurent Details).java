package com.classesandobject;

public class Restaurant {
      
	String name;
	String location;
	int rating;
	int numtables;
	String ownername;
	int onlinerating;
	 
	public void displaydetails()
	{
		System.out.println("name of restaurant:" +name);
		System.out.println("Location:"+ location);
		System.out.println("rating:" +rating);
		System.out.println("number of tables:" +numtables);
		System.out.println("name of owner:" + ownername);
		System.out.println("online Rating:" + onlinerating);
		
	}
	public static void main(String[] args)
	{
		Restaurant unit1 = new Restaurant();
		
		unit1.location="maharashtra";
		unit1.name="rayaba";
		unit1.rating=5;
		unit1.numtables=15;
		unit1.ownername="Amitkumar";
		unit1.onlinerating=10;
		
		
		Restaurant unit2 = new Restaurant();
		unit2.location="maharashtra";
		unit2.name="rayaba";
		unit2.rating=5;
		unit2.numtables=15;
		unit2.ownername="Amitkumar";
		unit2.onlinerating=10;
		
		unit1.displaydetails();
		unit2.displaydetails();
		}
	}


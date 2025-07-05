package com.classesandobject;

public class University {
	   
	String name;
	String location;
	int numprofessors;
	int ranking;
	int foundingyear;
	String department;
	String graduationlevel;
	  
	public void displayDetails()
	{
		System.out.println("university name:"       +name);
		System.out.println("locatioin:" + location);
		System.out.println("Number of professors:" +numprofessors);
		System.out.println("Ranking:" +ranking);
		System.out.println("Founding Years:" + foundingyear);;
		System.out.println("Department:" + department);
		System.out.println("Graduation Level:" +graduationlevel);
	}
	public static void main(String[] args)
	{
		 University uni1 = new University();
	        uni1.name          = "Harvard University";
	        uni1.location      = "Cambridge, MA";
	        uni1.numprofessors = 2400;
	        uni1.ranking       = 1;
	        uni1.foundingyear  = 1636;
	        uni1.department    = "Computer Science";
	        uni1.graduationlevel= "Postgraduate";
	        
	        University uni2 =new University();
	        uni2.name = "Stanford University";
	        uni2.location = "Stanford, CA";
	        uni2.numprofessors = 2100;
	        uni2.ranking = 2;
	        uni2.foundingyear = 1885;
	        uni2.department = "Engineering";
	        uni2.graduationlevel = "Undergraduate";
	          
	        uni1.displayDetails();
	        
	        
	        uni2.displayDetails();
	        
	}
}


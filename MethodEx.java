package com.methodex;

public class Circle {

	
       int r=5;
       double pi=3.14;
       
       public void area()
       {
    	   double total=pi*r*r;
    	   System.out.println("area of circle:" +total);
    	    
    	   
       }
       public void circum()
       {
    	   double result=2*pi*r;
    	   System.out.println("circumference of circle:" + result);
    	   
       }
	}

package com.methodex;

public class CircleMain {

	public static void main(String[] args) {
		
		Circle pk = new Circle();
		
		pk.area();
		pk.circum();
		}

}
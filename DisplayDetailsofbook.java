package com.package1;

public class Book {

       String title;
       String author;
       double price;
       
     public Book(String title, String author,double price)
     {
    	 this.title=title;
    	 this.author=author;
    	 this.price=price;
     }
     public void displaydetails()
     {
     System.out.println("Title : " + title);
     System.out.println("Author: " + author);
     System.out.printf("Price : $%.2f\n", price);
     }
}
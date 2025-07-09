package com.collection;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
	    Stack<String> s1=new Stack<String>();
	    s1.push("s");
	    s1.push("x");
	    s1.push("D");
	    
	    System.out.println(s1);
	    
	    System.out.println("peek:" +s1.peek());
	    System.out.println("pop:" +s1.pop());
	    System.out.println("peek :" +s1.peek());

	}


		
	}



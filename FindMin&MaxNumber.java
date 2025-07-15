package com.practise;

public class MinMaxFinder {

	public static void main(String[] args) {
		
		        int[] numbers = {45, 3, 67, 12, 99, 23, 8};

		        int min = numbers[0];
		        int max = numbers[0];

		        for (int i = 1; i < numbers.length; i++) {
		            if (numbers[i] < min) {
		                min = numbers[i];
		            }
		            if (numbers[i] > max) {
		                max = numbers[i];
		            }
		        }

		        System.out.println("Minimum number: " + min);
		        System.out.println("Maximum number: " + max);
		    }
		


	}


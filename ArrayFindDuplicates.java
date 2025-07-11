package com.mock;
public class RemoveDuplicatesSimple {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    
                    for (int k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--; 
                    j--;      
                    }
            }
        }

       
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
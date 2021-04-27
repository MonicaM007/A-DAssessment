package com.uos.ac.uk.ad;

public class InsertionSort {
	/*Insertion Sort is a type of algorithm that allows a value to be added in a array, however it will need to be sorted correctly.
	 *For example if a value in the array list is unsorted (placed anywhere in the list) it will place it in its correct position.
	 *This will be sorted in ascending order for the list to be correct.
	 */

public static void insertionSort(int array[]) {
    int n = array.length;
    for (int j = 1; j < n; j++) {
        int key = array[j];
        int i = j-1;
        while ( (i > -1) && ( array [i] > key ) ) {
            array [i+1] = array [i];
            i--;
        }
        array[i+1] = key;
    }
}
 
public static void main(String a[]){  
    int[] arr1 = {9,14,3,2,43,11,58,22};  //unsorted array
    System.out.println("Before Insertion Sort");  //print array
    for(int i:arr1){  
        System.out.print(i+" ");  
    }  
    System.out.println();  
      
    insertionSort(arr1);//sorting array using insertion sort  
     
    System.out.println("After Insertion Sort");  
    for(int i:arr1){  
        System.out.print(i+" ");  
    }  
}  
}  

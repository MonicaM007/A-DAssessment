package com.uos.ac.uk.ad;

public class BubbleSort {
	/*Bubble sort another sorting algorithm that compares alongside elements of an array and swaps them. 
	 *This mean the it moves the largest value towards the end of the array
	 *It is a ready sorting algorithm - For example no extra space is needed for this sort, the array itself is modified
	 */


   public static  void bubbleSort(int arr[]) 
   { 
       int n = arr.length; //length/size of array
       for (int i = 0; i < n-1; i++) 
           for (int j = 0; j < n-i-1; j++) 
               if (arr[j] > arr[j+1]) 
               { 
                   // swap values 
                   int temp = arr[j]; 
                   arr[j] = arr[j+1]; 
                   arr[j+1] = temp; 
               } 
   } 
 
   /* Prints the array */
   void printArray(int arr[]) 
   { 
       int n = arr.length; 
       for (int i=0; i<n; ++i) 
           System.out.print(arr[i] + " "); 
       System.out.println();
   } 
 
  
   public static void main(String args[]) 
   { 
       BubbleSort bs = new BubbleSort(); 
       int arr[] = {64, 34, 25, 12, 22, 11, 90}; //unsorted array
       BubbleSort.bubbleSort(arr); 
       System.out.println("Bubble Sort"); 
       
       bs.printArray(arr); 
   } 
} 
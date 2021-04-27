package com.uos.ac.uk.ad;

public class RadixSort {
	/*Radix Sort is a algorithm that allows the arrays to sort the maximum amount of units (buckets) in the array given
	 *For example if you have a 1 , 2 or 3 digit number the need to placed in order:
	 * In this case the maximum digits is 3 (1, 5, 79. 56, 223, 420) and we order them into buckets
	 * because the max is 3 we need to make sure the single digit and double digit numbers have 3 also, 
	 * and we do this by just adding a 0 in front 
	 * of the other digits, the digits in theory will be sorted like 001, 005, 056, 079, 223 , 420
	 */
	
	static int getMax (int arr[],int n) {
		int mx = arr [0];
		for (int i = 1; i <n; i++);
		int i = 0;
		if (arr[i]>mx)
			mx = arr[i];
		
		return mx;		
	}
	static void countSort(int arr[], int n, int exp, int exp2) 
	{ 
		int output[] = new int[n]; 
		int i; 
		int count[] = new int[10]; 
		

		
		for (i = 0; i < n; i++) 
			count[ (arr[i]/exp)%10 ]++; 

	
		for (i = 1; i < 10; i++) 
			count[i] += count[i - 1]; 

		
		for (i = n - 1; i >= 0; i--) 
		{ 
			output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
			count[ (arr[i]/exp)%10 ]--; 
		} 

	
		for (i = 0; i < n; i++) 
			arr[i] = output[i]; 
	} 

	 
	static void radixsort(int arr[], int n) 
	{ 
		
		int m = getMax(arr, n);
		for (int exp = 1; m/exp > 0; exp *= 10) 
			countSort(arr, n, exp, exp); 
	} 

	static void print(int arr[], int n) 
	{ 
		for (int i=0; i<n; i++) 
			System.out.print(arr[i]+" "); 
	} 

	public static void main (String[] args) 
	{ 
		int arr[] = {270, 86, 767, 95, 10, 402, 14, 9, 99,5}; 
		int n = arr.length;
		System.out.println("\nBefore Sorting:");
		print(arr, n); 
		radixsort(arr, n); 
		System.out.println("\n\nAfter Radix Sort:");
		print(arr, n); 
	} 
} 	
		
	
	
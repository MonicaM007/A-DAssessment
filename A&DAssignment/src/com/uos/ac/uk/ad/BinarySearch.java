package com.uos.ac.uk.ad;

public class BinarySearch {
	/*Binary Search is a sorted array by repeatedly dividing the search interval in half. 
	 *Beginning with an interval covering the whole array. 
	 *If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. 
	 *Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
     *This method of algorithm which is used for finding the required element in an array is known as binary search
	 *Here,in this type of searching the array is sorted first. 
	 *The example below shows:  arr = {3,7,10,12,20,30,40} here in this array if we want to find the element x = 7
	 *We would initially find the mid point or the mid element of the array.
	 *If the mid element contains the searched element that element's index is returned
	 */

	
static int binarysearch(int arr[],int left,int right,int x)
    
    {
        if(left >= right)
        {
            return -1;
        }
        int mid = left+(right-left)/2;
        
        if(arr[mid] == x)
        {
            return mid;
        }
        else if(x < arr[mid])
        {
            return binarysearch(arr,left,mid-1,x);
        }
        else if(x > arr[mid])
        {
            return binarysearch(arr,mid+1,right,x);
        }
        return -1;
    }
    
	public static void main(String[] args) 
	
	{
	    int arr [] = {3,7,10,12,20,30,40};
	    int n = arr.length;
	    int x = 7;
	    
	    int result = binarysearch(arr,0,n-1,x);
	    
	    if(result == -1)
	    {
	        System.out.println("No such elements");
	    }
		else
		{
		    System.out.println("Index of the element is "+x+" is: "+result);
		}
	}
}
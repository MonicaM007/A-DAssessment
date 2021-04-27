package com.uos.ac.uk.ad;

public class QuickSort { 
	/*Quick Sort is an algorithm that orders the elements of an array.
	 *It divides the list and the sorting algorithm by its original data is separated into two parts (divided) which are individually sorted.
	 *They are then combined with a low and high method.
	 *The example below show the list the lower elements are at the beginning of the list and the highest are towards the end. 
	 */

	public static void main(String a[])
    {
        int i; //integer created for the list to be sorted 
        int array[] = {12, 9, 4, 99, 120, 1, 3, 10, 13, 45}; // 10 number values unsorted 
        System.out.println("Unsorted Array List:\n"); //Heading for the output

        for (i = 0; i < array.length; i++) // array length is the number of values/elements which are  in the list
        	
        {
            System.out.print(array[i] + " ");// printing unsorted list 
        }

        System.out.println();
        
        quickSort(array, 0, array.length - 1); 
        System.out.print("\nSorted Array List:\n\n");//Heading for the output

        for (i = 0; i < array.length; i++) //
        {
            System.out.print(array[i] + " ");// printing sorted list 
        }
        System.out.println();
    }
    public static void quickSort(int array[], int low, int n)
    {
        int lo = low; //integer low
        int hi = n; // integer high

        if (lo >= n) // if integer is  more than > it will equal to high
        {
            return;
        }

        int mid = array[(lo + hi) / 2]; //integer mid integer is in the middle so low values are on the left and high values on the right in the list
            while (lo < hi)
        {
            while (lo < hi && array[lo] < mid)// low values < towards left side of array list
            {
                lo++;
            }

            while (lo < hi && array[hi] > mid)// high values > towards right side of array list
            {
                hi--;
            }

            if (lo < hi)
            {
                int a = array[lo];
                array[lo] = array[hi];
                array[hi] = a;
            }
        }
        if (hi < lo) // if integer is  less than < it will equal to low
        {
            int a = hi;
            hi = lo;
            lo = a;
        }
        quickSort(array, low, lo);
        quickSort(array, lo == low ? lo + 1 : lo, n);
    }
}


//Java code for kth smallest element
//in an array
//A simple solution is to sort the given array using a O(N log N) sorting algorithm 
//like Merge Sort, Heap Sort,
//etc and return the element at index k-1 in the sorted array. 

//Time Complexity of this solution is O(N Log N)

import java.util.Arrays;
import java.util.Collections;

class Method1  {
	// Function to return k'th smallest
	// element in a given array
	public static int kthSmallest(Integer[] arr,
								int k)
	{
		// Sort the given array
		Arrays.sort(arr);

		// Return k'th element in
		// the sorted array
		return arr[k - 1];
	}

	// driver program
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int k = 2;
		System.out.print("K'th smallest element is " + kthSmallest(arr, k));
		System.out.println();
		System.out.println("Time Complexity of this solution is O(N Log N)");
	}
}




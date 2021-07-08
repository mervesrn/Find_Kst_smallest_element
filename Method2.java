

//Java program to find k'th smallest element 
//in EXPECTED LINEAR TIME!!!

class Method2
{
	// This function returns k'th smallest element in arr[l..r]
	// using QuickSort based method. ASSUMPTION: ALL ELEMENTS
	// IN ARR[] ARE DISTINCT
	int kthSmallest(int arr[], int p, int r, int k)
	{
		// If k is smaller than number of elements in array
		if (k > 0 && k <= r - p + 1)
		{
			// Partition the array around a random element and
			// get position of pivot element in sorted array
			int pos = randomPartition(arr, p, r);

			// If position is same as k
			if (pos-p == k-1)
				return arr[pos];

			// If position is more, recur for left subarray
			if (pos-p > k-1)
				return kthSmallest(arr, p, pos-1, k);

			// Else recur for right subarray
			return kthSmallest(arr, pos+1, r, k-pos+p-1);
		}

		// If k is more than number of elements in array
		return Integer.MAX_VALUE;
	}

	// Utility method to swap arr[i] and arr[j]
	void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Standard partition process of QuickSort(). It considers
	// the last element as pivot and moves all smaller element
	// to left of it and greater elements to right. This function
	// is used by randomPartition()
	int partition(int arr[], int p, int r)
	{
		int x = arr[r], i = p;
		for (int j = p; j <= r - 1; j++)
		{
			if (arr[j] <= x)
			{
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, r);
		return i;
	}

	// Picks a random pivot element between l and r and
	// partitions arr[l..r] arount the randomly picked
	// element using partition()
	int randomPartition(int arr[], int p, int r)
	{
		int n = r-p+1;
		int pivot = (int)(Math.random()) * (n-1);
		swap(arr, p + pivot, r);
		return partition(arr, p, r);
	}

	// Driver method to test above
	public static void main(String args[])
	{
		Method2 ob = new Method2();
		int arr[] = {12, 3, 5, 7, 4, 19, 26};
		System.out.println("arr[] = {12, 3, 5, 7, 4, 19, 26}");
		int n = arr.length,k = 3;
		System.out.println("K'th:" + k+".smallest element is "+
						ob.kthSmallest(arr, 0, n-1, k));
		System.out.println();
		System.out.println("k'th smallest element in EXPECTED LINEAR TIME");
		System.out.println("Time complexcity is O(n) ");
	}
}



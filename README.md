# Find_Kst_smallest_element
K’th Smallest/Largest Element in Unsorted Array | Set 3 (Worst Case Linear Time)<br>


K’th Smallest/Largest Element in Unsorted Array | Method1 <br>
K’th Smallest/Largest Element in Unsorted Array | Method2 (Expected Linear Time)<br>
Given an array and a number k where k is smaller than the size of the array, we need to find the k’th smallest element in the given array. It is given that all array elements are distinct.<br>
Examples: <br>
 

Input: arr[] = {7, 10, 4, 3, 20, 15}<br>
       k = 3<br>
Output: 7<br>
<br>
Input: arr[] = {7, 10, 4, 3, 20, 15}<br>
       k = 4<br>
Output: 10<br>
 <br>


 <br>
 In this post, a worst-case linear time method is discussed. The idea in this new method is similar to quickSelect(), we get worst-case linear time by selecting a pivot that divides array in a balanced way (there are not very few elements on one side and many on another side). After the array is divided in a balanced way, we apply the same steps as used in quickSelect() to decide whether to go left or right of the pivot.
Following is complete algorithm.<br>
 

kthSmallest(arr[0..n-1], k) <br>
1) Divide arr[] into ⌈n/5⌉ groups where size of each group is 5 except possibly the last group which may have less than 5 elements. <br>
2) Sort the above created ⌈n/5⌉ groups and find median of all groups. Create an auxiliary array ‘median[]’ and store medians of all ⌈n/5⌉ groups in this median array.<br>
// Recursively call this method to find median of median[0..⌈n/5⌉-1] <br>
3) medOfMed = kthSmallest(median[0..⌈n/5⌉-1], ⌈n/10⌉)<br>
4) Partition arr[] around medOfMed and obtain its position. <br>
pos = partition(arr, n, medOfMed)<br>
5) If pos == k return medOfMed <br>
6) If pos > k return kthSmallest(arr[l..pos-1], k) <br>
7) If pos < k return kthSmallest(arr[pos+1..r], k-pos+l-1)<br>


 <br>
 
 You can visit it's wiki page, access more information.<br>
 [Presentation](https://github.com/mervesrn/Find_Kst_smallest_element/blob/main/Presentation.pdf)

package sorting;

/*
=============Merge sort Algorithm=============

Merge sort works on divide and conquer algo

Divide and conquer strategy :- A problem is divide into multiple sub-problems. Each sub-problem is solved
individually.finally sub-problem are combined to from the final solution.

Supposed we have array A. A sub-problem would be sort the sub-section of this array starting at index p a
and ending at index r, denote as A[p..r];

Divide :- if q is the half-way point between p and r, then we can split the sub-array A[p..r] into two
array A[p..q] and A[q+1..r]

Conquer : we try to sort both array A[p..q] and A[q+1..r]. if we haven't yet reached the base case,
We again divide both these  sub-array and try to sort them.

Combine :- When the conquer step reaches the base step and we got two sort array  A[p..q] and A[q+1..r].
for array A[p..r], we combine the result by creating a sorted array A[p..r] from two sorted sub-array
A[p..q] and A[q+1..r]


Ref Images - https://www.programiz.com/sites/tutorial2program/files/merge-sort-example_0.png


MergeSort(A, p, r):
    if p > r
        return
    q = (p+r)/2
    mergeSort(A, p, q)
    mergeSort(A, q+1, r)
    merge(A, p, q, r)


Best	O(n*log n)
Worst	O(n*log n)
Average	O(n*log n)

*/


import java.util.Arrays;

public class MergeSort {


    //main fuction to sort the array using Marge Sort
    static void mergeSort(int []arr){

        if(arr.length<2)
            return; //Base Case : if array length is 1 or less, it's already sorted.

        //Sub Array
        int mid = arr.length/2;

        //Create temporary array for left and right sub array

        int [] left = new int [mid];
        int [] right = new int [arr.length-mid];

        //Copy the element to left and right sub array
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i <arr.length ; i++) {
            right[i-mid] = arr[i];
        }
        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    static void merge(int [] arr, int [] left, int [] right){

        int i=0,j=0,k=0;
        //Merge the two arrays while comparing their elements
        while (i < left.length && j < right.length)
        {
            if(left[i] <= right[j])
            {
                arr[k++]= left[i++];
            }else{
                arr[k++]= right[j++];
            }
        }
        //if there are any remaining element in the left array, add them
        while (i<left.length)
        {
            arr[k++]= left[i++];
        }
        //if there are any remaining element in the right array, add them
        while (j<right.length)
        {
            arr[k++]= right[j++];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 12, 10, 9, 1 };
        //int arr[] = { 6, 5, 12, 10 };
        System.out.println("Array before Sorting :: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Array before Sorting :: " + Arrays.toString(arr));
    }
}

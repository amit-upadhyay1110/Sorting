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


public class MergeSort {
}

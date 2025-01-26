package sorting;

/*
=============Insertion  sort Algorithm=============

Insertion sort work similarly as we sort cards in our hand in a card game.
We Assumed that the first card is already sort card in our hand in a card game

The first element in array is assumed to be sorted. Take the second element and store it in key.
Compare the kye with first element. if the first element is grater than the key, then key placed to
in front of first. Now first two elements are sorted.

Take the third element and compare it with element on the left of it. placed it just behind the element
smaller than it, if there is no element smaller that it, than place it being of the array.

Similarly, place every unsorted element at its correct position.

insertionSort(array)
  mark first element as sorted
  for each unsorted element X
    'extract' the element X
    for j <- lastSortedIndex down to 0
      if current element j > X
        move sorted element to the right by 1
    break loop and insert X here
end insertionSort

Best	O(n)
Worst	O(n2)
Average	O(n2)

*/

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 2, 3, 10};
        System.out.println("Array before Sorting :: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            int key = arr[i + 1];
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
        System.out.println("Array after Sorting :: " + Arrays.toString(arr));

    }
}

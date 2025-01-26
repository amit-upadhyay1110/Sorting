package sorting;

import java.util.Arrays;

/*
=============Bubble sort Algorithm=============

 - Staring from index one and compare the first and second elements;

 - if the first element is greater than the second element, they are swapped

 - Now compare the second and third element. Swap them if they are not in order

 - above process goes on until the last element

 bubbleSort(array)
  for i <- 1 to sizeOfArray - 1
    for j <- 1 to sizeOfArray - 1 - i
      if leftElement > rightElement
        swap leftElement and rightElement
end bubbleSort

Best	O(n)
Worst	O(n2)
Average	O(n2)

*/


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 7, 3, 8};
        int temp = 0;
        System.out.println("Before ::" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        System.out.println("After ::" + Arrays.toString(arr));
    }

}
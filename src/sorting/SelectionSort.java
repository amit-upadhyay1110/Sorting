package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
=============Selection sort Algorithm=============
 - Set the first element as {minimum}

 - Compare {minimum} with the second element if the second element is smallest them the
  {minimum}, assign the second element as {minimum}

 - Compare the {minimum} with third element.Again, if the third element is smallest the {minimum},
 assign the third element as  {minimum}, otherwise do nothing. The process goes until the last element

 -After each iteration the {minimum} is placed in front of the unsorted list.

 - For each iteration, indexing start from the first unsorted element. Step 1 to 3 are repeated until
 all the elements are placed at their correct position.


selectionSort(array, size)
  for i from 0 to size - 1 do
    set i as the index of the current minimum
    for j from i + 1 to size - 1 do
      if array[j] < array[current minimum]
        set j as the new current minimum index
    if current minimum is not i
      swap array[i] with array[current minimum]
end selectionSort

Best	O(n2)
Worst	O(n2)
Average	O(n2)

*/

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {20, 12, 10, 3};

        System.out.println("Before ::" + Arrays.toString(arr));

        for (int step = 0; step < arr.length; step++) {
            int min_idx = step;
            for (int i = step + 1; i < arr.length; i++) {
                if (arr[min_idx] > arr[i])
                    min_idx = i;
            }
            int temp = arr[step]; //20
            arr[step] = arr[min_idx]; //3
            arr[min_idx] = temp;
        }

        System.out.println("After ::" + Arrays.toString(arr));

    }

}

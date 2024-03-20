package Sorting;

import java.util.Arrays;

// here we create 2 parts of array 1) sorted 2) unsorted array
// we continously insert one element from unsorted part into sorted part at its correct position
public class InsertionSort {

  static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int current = arr[i];
      int j = i - 1;
      while (j >= 0 && current < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }
      // placement
      arr[j + 1] = current;
    }
  }

  public static void main(String[] args) {
    int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
    System.out.println(Arrays.toString(arr1));
    insertionSort(arr1);
    System.out.println(Arrays.toString(arr1));
  }
}

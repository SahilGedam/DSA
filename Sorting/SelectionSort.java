package Sorting;

import java.util.*;

public class SelectionSort {

  static void selectionSort(int[] arr) { // one swap per iteration
    for (int i = 0; i < arr.length - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < arr.length; j++) { // opposite to bubble sort , we are inserting smallest number at start of array
        if (arr[j] < arr[smallest]) {
          smallest = j; //searching for lowest
        }
      }
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
    System.out.println(Arrays.toString(arr1));
    selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
  }
}

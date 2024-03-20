package Sorting;

import java.util.Arrays;

// important for interview
// we use a pivot
// we can use random index as pivot , but we will use last index as pivot
public class QuickSort {

  // time complexity
  // worst case = O(n^2)
  // avg case = o(n)
  // worst case is when pivot becomes smallest or largest element everytime  ********************************
  // quick sort is better than merge sort as it saves memory
  static void quickSort(int arr[], int low, int high) {
    if (low < high) {
      int pitdx = partition(arr, low, high);
      quickSort(arr, low, pitdx - 1);
      quickSort(arr, pitdx + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        i++;
        //    swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    i++;
    int temp = arr[i];
    arr[i] = pivot;
    arr[high] = temp;
    return i;
  }

  public static void main(String[] args) {
    int arr[] = { 8, 65, 12, 18, 32, 7, 6 };
    System.out.println(Arrays.toString(arr));
    int n = arr.length;
    quickSort(arr, 0, n - 1);
    System.out.println(Arrays.toString(arr));
  }
}

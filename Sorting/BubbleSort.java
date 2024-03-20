package Sorting;

// O(n^2)
import java.util.Arrays;

public class BubbleSort {

  static void bubbleSort(int[] arr) {
    int n = arr.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1] > arr[j]) {
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    // can be also written as
    // for (int i = 0; i < n - 1; i++) {
    //   for (int j = 0; j < (n - i - 1); j++) {
    //     if (arr[j] > arr[j + 1]) {
    //       int temp = arr[j];
    //       arr[j] = arr[j + 1];
    //       arr[j + 1] = temp;
    //     }
    //   }
    // }
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
    bubbleSort(arr);
  }
}

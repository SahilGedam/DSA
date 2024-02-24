package Arrays;

import java.util.*;

public class MergeSorted {

  private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
    int n = arr1.length;
    int m = arr2.length;
    int[] mergedArray = new int[n + m];
    int left = 0;
    int right = 0;
    int index = 0;
    while (left < n && right < m) {
      if (arr1[left] <= arr2[right]) {
        mergedArray[index] = arr1[left];
        left++;
        index++;
      } else {
        mergedArray[index] = arr2[right];
        right++;
        index++;
      }
    }
    while (left < n) {
      mergedArray[index++] = arr1[left++];
    }
    while (right < m) {
      mergedArray[index++] = arr2[right++];
    }

    return mergedArray;
  }

  public static void main(String[] args) {
    int arr1[] = { 1, 2, 3, 14, 15 };
    int arr2[] = { 8, 9, 10, 11, 12, 13, 14 };
    // mergeSortedArrays(arr1, arr2);
    System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
  }
}

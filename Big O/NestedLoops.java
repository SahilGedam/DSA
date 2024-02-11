public class NestedLoops {

  private static void printPairsOfArrays(String[] arr1, String[] arr2) {
    for (int i = 0; i < arr1.length; i++) { // O(n * n)  == O(n^2)
      for (int j = 0; j < arr1.length; j++) {
        System.out.println(arr1[i] + " " + arr1[j]);
      }
    }
    for (int i = 0; i < arr1.length; i++) { // O(a * b)
      for (int j = 0; j < arr2.length; j++) {
        System.out.println(arr1[i] + " " + arr2[j]);
      }
    }
  }

  private static void dropNonDominantsInCalculation(int[] numbers) {
    for (int i : numbers) { // O(n)
      System.out.println(i);
    }
    for (int i : numbers) { // O(n^2)
      for (int j : numbers) {
        System.out.println(i + j);
      }
    }
    // total = O(n + n^2)  non dominant is ignored  so it becomes
    //total= O(n^2)
  }

  public static void main(String[] args) {
    String[] arr1 = { "a", "b", "c", "d", "e", "f" };
    String[] arr2 = { "x", "y", "z" };
    int[] numbers = { 0, 1, 2, 3, 4, 5 };

    printPairsOfArrays(arr1, arr2);

    dropNonDominantsInCalculation(numbers);
  }
}

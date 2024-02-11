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

  public static void main(String[] args) {
    String[] arr1 = { "a", "b", "c", "d", "e", "f" };
    String[] arr2 = { "x", "y", "z" };

    printPairsOfArrays(arr1, arr2);
  }
}

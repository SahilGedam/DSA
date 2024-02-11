public class AddTwoO {

  // O(a+b)   as both are different arrays of different size
  private static void additonOfTwoArraysBigO(String[] arr1, String[] arr2) { // O(a+b)
    for (String string : arr1) { // Big O (a)
      System.out.println(string);
    }
    for (String string : arr2) { // Big O (b)
      System.out.println(string);
    }
  }

  public static void main(String[] args) {
    String[] arr1 = { "a", "b", "c" };
    String[] arr2 = { "x", "y", "z" };
    additonOfTwoArraysBigO(arr1, arr2);
  }
}

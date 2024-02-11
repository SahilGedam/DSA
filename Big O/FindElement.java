public class FindElement {

  static void findElement(String[] elements, String toFind) {
    // linear time O(n)
    for (int i = 0; i < elements.length; i++) { // O(n)
      String each = elements[i];
      if (each.equals(toFind)) {
        System.out.println(toFind + " found linear");
        break; // save further iteration
      }
    }
  }

  private static void findConstant(String[] elements, int index) {
    // constant time O(1)
    System.out.println(elements[index]); // single operation
    System.out.println("not iteration , always constant time");
  }

  public static void main(String[] args) {
    String[] elements = new String[] { "a", "b", "c", "d", "e" };
    findElement(elements, "c"); // linear time O(n)        (n == size of array)
    findConstant(elements, 2); // constantTime O(1)
  }
}

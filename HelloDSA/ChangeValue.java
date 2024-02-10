import java.util.Arrays;

public class ChangeValue {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    changeArray(arr);
    System.out.println(Arrays.toString(arr));
    String name = "Sahil";
    changeString(name); //copy of value of reference variable is passed
    System.out.println(name);
  }

  private static void changeString(String name) {
    // Will not change
    name = "raja"; // new object is created
    // you cannot modify a string
  }

  private static void changeArray(int[] arr) {
    // Will change
    arr[0] = 99; // new object not created
  }
}

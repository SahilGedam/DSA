import java.util.Arrays;

public class SpaceComplexity {

  private static void printSahil(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Sahil"); // space complexity = O(1) as newmemory is not created for every element
    }
  }

  private static int[] arrayOfHiNTimes(int[] numbers) {
    int[] hi = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      hi[i] = 2; // space complexity = O(n) as new memory is created for every element
    }
    return hi;
  }

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6 };
    printSahil(numbers);
    int[] hiArray = arrayOfHiNTimes(numbers);
    System.out.println(Arrays.toString(hiArray));
  }
}

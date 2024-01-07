package HelloDSA;

import java.util.*;

public class Largest {

  static int largestNumber(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    return max;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("enter 3 numbers");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      //   int max = 0;
      //   max = a;
      //   if (b > max) {
      //     max = b;
      //   }
      //   if (c > max) {
      //     max = c;
      //   }

      System.out.println("largest number is " + largestNumber(a, b, c));
    }
  }
}

package Stack;

import java.util.*;

public class StackBasics {

  public static void pushAtBottom(Stack<Integer> s, int data) {
    if (s.isEmpty()) {
      s.push(data);
      return;
    }
    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
  }

  // reverse stack

  public static void reverseStack(Stack<Integer> s) {
    if (s.isEmpty()) {
      return;
    }
    int top = s.pop();
    reverseStack(s);
    pushAtBottom(s, top);
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<Integer>();
    s.push(1);
    s.push(2);
    s.push(3);
    pushAtBottom(s, 4);
    reverseStack(s);
    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }
}

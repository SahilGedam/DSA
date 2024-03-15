package Queue;

import java.util.*;

public class QueueBasics {

  public static void main(String[] args) {
    // Queue <Integer> q = new LinkedList();
    // Queue<Integer> q = new ArrayDeque<>();
    Queue<Integer> q = new PriorityQueue<>();
    q.add(1);
    q.add(2);
    q.add(3);
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}

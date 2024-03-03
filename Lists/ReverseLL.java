// import java.util.*;

class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}

public class ReverseLL {

  public ListNode reverseListIeration(ListNode head) {
    if (head == null || head.next == null) return head;

    //use two nodes to keep track of two nodes
    ListNode prev = head;
    ListNode curr = head.next;

    while (curr != null) {
      //keep track of next node of curr, since we are going to change its next to prev
      ListNode tmp = curr.next;

      //reverse
      curr.next = prev;

      //shift right by one position
      prev = curr;
      curr = tmp;
    }

    //set tail
    head.next = null;
    return prev;
  }

  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode next = head.next;
    ListNode newHead = reverseList(next); // recursively reverse the sub list with nodes after the current node and return ites head
    next.next = head; // next must be the last node in the reversed sub list
    // add the current node after the reversed sub list
    head.next = null; // cut off the link between the current node and nodes after it
    return newHead; // return the new head
  }
}

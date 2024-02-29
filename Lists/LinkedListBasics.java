import java.util.*;

public class LinkedListBasics {

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    // add at start
    list.addFirst("first");
    list.addFirst("second");
    //add at end
    list.addLast("last");

    // add adds at the last
    list.add("maybe at end");
    System.out.println(list);

    // size
    System.out.println(list.size());

    //loop
    for (String s : list) { // we can also use traditional for loop
      System.out.println(s);
    }

    // remove first
    list.removeFirst();

    // remove last
    list.removeLast();
    System.out.println(list);

    // remove index
    list.remove(0);
    System.out.println(list);
  }
}

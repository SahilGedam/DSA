package HashTables;

import java.util.*;

public class HashSetBasics {

  public static void main(String[] args) {
    // creation
    HashSet<Integer> set = new HashSet<>();

    // insert
    set.add(1);
    set.add(13);
    set.add(314);
    set.add(3);
    set.add(1);
    set.add(2);

    //print all elements
    System.out.println(set);

    // search
    if (set.contains(1)) {
      System.out.println("set contains value");
    }

    if (!set.contains(6)) {
      System.out.println("set does not contains value");
    }

    //delete
    set.remove(1);

    if (!set.contains(1)) {
      System.out.println("set does not contains value");
    }

    // size
    System.out.println(set.size() + " is size of set");

    //iterator
    Iterator<Integer> it = set.iterator();

    while (it.hasNext()) { // hasNext() checks if next is available.
      System.out.println(it.next());
    }
  }
}

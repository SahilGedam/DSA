import java.util.*;

public class ArrayListBasics {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    // add element
    list.add(0);
    list.add(2);
    list.add(13);

    System.out.println(list);

    // get
    int element = list.get(0);
    System.out.println(element);

    // add element in between
    list.add(1, 99);
    System.out.println(list);

    // set element
    list.set(0, 5);
    System.out.println(list);

    // delete element
    list.remove(3);
    System.out.println(list);

    // size
    System.out.println(list.size());

    // loop
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    //sort elements
    Collections.sort(list);
    System.out.println(list);
  }
}

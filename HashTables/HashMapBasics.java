package HashTables;

import java.util.*;

public class HashMapBasics {

  public static void main(String[] args) { // key , value
    // country population
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    // insertion
    map.put("india", 130);
    map.put("USA", 40);
    map.put("china", 150); //if key does not exist new pair is created
    map.put("china", 77); //if key does  exist it is updated
    System.out.println(map);

    //search
    if (map.containsKey("china")) { // returns true if key exists
      System.out.println("key is present in map");
    } else {
      System.out.println("key is not present in map");
    }

    System.out.println(map.get("china")); // returns value of key
    System.out.println(map.get("Indonesia")); // returns null

    //iteration
    //iteration by making entryset of key and value
    for (Map.Entry<String, Integer> e : map.entrySet()) { // syntax same as - for (int val : arr)
      System.out.println(e.getKey() + " = " + e.getValue());
    }
    // iteration by making set of keys
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println(key + " = " + map.get(key));
    }

    // deletion
    map.remove("india");
    System.out.println(map);
  }
}

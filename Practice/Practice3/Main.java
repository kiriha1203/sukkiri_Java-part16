package Practice.Practice3;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    var h1 = new Hero("斎藤");
    var h2 = new Hero("鈴木");
    var heroes = new HashMap<Hero, Integer>();
    heroes.put(h1, 3);
    heroes.put(h2, 7);
    for (Hero key : heroes.keySet()) {
      int value = heroes.get(key);
      System.out.println(key.getName() + "が倒した敵" + value);
    }
  }
}
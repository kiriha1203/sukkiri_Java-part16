import java.util.*;

class Hero {
  public String name;
}

public class Ex8 {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "ミナト";
    List<Hero> list = new ArrayList<>();
    list.add(h);
    h.name = "菅原";
    System.out.println(list,get(0).name);
  }
}
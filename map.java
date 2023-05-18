import java.util.HashMap;

class map {

  public static void main(String[] args) {
    HashMap<String, Integer> x = new HashMap<String, Integer>();

    x.put("ash", 23);
    x.put("dhruv", 32);
    x.put("daya", 53);
    x.put("harshi", 63);
    x.put("akshay", 2);

    System.out.println(x);

    String s = new String("daya");
    int a = x.get(s);
    System.out.println(a);

    String st = new String("ash");
    int b = x.remove(st);
    System.out.println(b);

    boolean flag = x.containsKey(s);
    System.out.println(flag);

    Integer c = Integer.valueOf(34);
    boolean flagg = x.containsValue(c);
    System.out.println(flagg);

    System.out.println(x);
  }
}

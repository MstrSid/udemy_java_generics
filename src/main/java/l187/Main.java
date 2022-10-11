package l187;

public class Main {

  public static void main(String[] args) {
    Box<String, Integer, Float> box1 = new Box<>("String", 2, 6.52f);
    Box<String, Integer, Float> box2 = new Box<>("String", 5, 7.47f);

    float result = box1.getValue() + box2.getValue() + box1.getFl() + box2.getFl();

    System.out.println(result);
  }


}

package l187;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BoxTest {

  @Test
  public void testBox() {
    Box<String, Integer, Float> box1 = new Box<>("String", 2, 6.52f);
    Box<String, Integer, Float> box2 = new Box<>("String", 5, 7.47f);
    float result = box1.getValue() + box2.getValue() + box1.getFl() + box2.getFl();
    assertEquals(20.99, result, 0.001);
  }
}
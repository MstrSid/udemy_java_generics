package org.example;

public class Main {

  public static void main(String[] args) {
    Box<Double> array = new Box<>(5.5, 6.7, 9.4, 8.7, 5.4, 6.1);
    System.out.printf("%.2f", array.avg());
  }
}

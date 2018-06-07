package hw;

import java.util.Arrays;

public class Main {

  public static void main(final String[] args) {
    System.out.println("args = " + Arrays.asList(args));
    final FizzBuzz instance = new FizzBuzz();
    System.out.println(instance.getMessage());
    System.out.println(instance.getYear());
    System.out.println("bye for now");
  }
}
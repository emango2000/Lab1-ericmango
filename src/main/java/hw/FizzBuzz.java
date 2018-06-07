package hw;

public class FizzBuzz {
  public static void fizzBuzz(); {
    int max = 0;

    if (args.length > 0) {
      try {
        max = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {
        System.out.println("The argument entered must be an integer ");
      }
    }
  }
}

import java.util.Scanner;

public class MyApp6 {
  public static void main(String[] args) {
    System.out.print("Signal? ");
    String signal = new Scanner(System.in).next();
    switch (signal) {
      case "red":
        System.out.println("Stop");
        break;
      case "yellow":
        System.out.println("Slow down");
        break;
      case "blue":
      case "green":
        System.out.println("Go");
        break;
      default:
        System.out.println("Wrong signal");
        break;
    }
  }
}
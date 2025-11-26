import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    System.out.print("Score? ");
    int score = new Scanner(System.in).nextInt();
    if (score >= 90) {
      System.out.println("A!");
    } else if (score >= 95) {
      System.out.println("Super!");
    } else {
      System.out.println("C!");
    }
  }
}
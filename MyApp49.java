import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    int score = new Scanner(System.in).newtInt();
    String result = score >= 90 ? "A!" : "B!";
  }
}
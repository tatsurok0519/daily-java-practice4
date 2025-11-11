import java.util.Scanner;

public class MyApp34 {
  public static void main(String[] args) {
    int score = new Scanner(System.in).nextInt();
    String result = score >= 80 ? "A!" : "B!";
    System.out.println(result);
  }
}
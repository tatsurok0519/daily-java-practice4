import java.util.Scanner;

public class MyApp13 {
  public static void main(String[] args) {
    int[] scores = {70, -10, 80, 90};
    for (int score: scores) {
      if (score < 0) {
        // break;
        continue;
      }
      System.out.println(score);
    }
    System.out.println("Finished");
  }
}
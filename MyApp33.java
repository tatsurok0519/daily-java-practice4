import java.util.Scanner;

public class MyApp33 {
  public static void main(String[] args) {
    int[] scores = {70, -10, 90, 80};
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
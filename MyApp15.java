import java.util.Scanner;

public class MyApp15 {
  public static void main(String[] args) {
    System.out.print("English? ");
    int english = new Scanner(System.in).nextInt();
    System.out.print("Math? ");
    int math = new Scanner(System.in).nextInt();
    if (english >= 80 && math >= 80) {
      System.out.println("A!");
    } else {
      System.out.println("B!");
    }
  }
}
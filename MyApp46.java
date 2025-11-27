import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    double money = 500.0;
    while (money < 1000.0) {
      money *= 1.1;
      System.out.println(money);
    }
  }
}
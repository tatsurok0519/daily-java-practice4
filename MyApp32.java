import java.util.Scanner;

public class MyApp32 {
  public static void main(String[] args) {
    String password;
    do {
      password = new Scanner(System.in).next();
    } while (password.equals("aaaa1111") == false);
    System.out.println("Password matched");
  }
}
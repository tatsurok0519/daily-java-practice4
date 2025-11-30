public class MyApp {
  private static boolean isDividable(int a, int b) {
    // if (b != 0 && a % b == 0) {
    //   return true;
    // } else {
    //   return false;
    // }

    if (b == 0) {
      return false;
    }

    // if (a % b == 0) {
    //   return true;
    // } else {
    //   return false;
    // }
    return a % b == 0;
  }

    // System.out.println("--- end ---");

  public static void main(String[] args) {
    System.out.println(isDividable(10, 2)); // true
    System.out.println(isDividable(10, 3)); // false
    System.out.println(isDividable(10, 0));
  }
}
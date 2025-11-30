public class MyApp {
  private static <T> void showThreeTimes(T n) {
    System.out.println(n);
    System.out.println(n);
    System.out.println(n);
  }

  public static void main(String[] args) {
    showThreeTimes(3);
    showThreeTimes(5.2);
  }
}
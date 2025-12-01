class User {
  String name;
  int score;

  User(String name, int score) {
    this.name = name;
    this.score = score;
  }

  getUserString() {
    return user1.name + ", " + user1.score;
  }
}

public class MyApp {
  public static void main(String[] args) {
    User user1 = new User("Taro", 70);
    User user2 = new User("Jiro", 80);

    System.out.println(user1.name);
    System.out.println(user1.score);
    System.out.println(user2.name);
    System.out.println(user2.score);
  }
}
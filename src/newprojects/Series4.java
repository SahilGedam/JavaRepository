package newprojects;

public class Series4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int i = 1;

    for (i = 1; i <= 20; i++) {
      if (i % 2 == 0) {
        continue;
      } else {
        System.out.println(i * i);
      }
    }
  }
}

package homeworkaug3;

public class PrintNumNotDiv5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int i;
    for (i = 1; i <= 100; i++) {
      if (i % 5 == 0 || i % 10 == 0) {
        continue;
      } else {
        System.out.println(i);
      }
    }
  }
}

package homeworkaug3;

public class Pattern13 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    for (int i = 1; i <= 4; i++) {
      for (int j = 4; j >= i; i--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

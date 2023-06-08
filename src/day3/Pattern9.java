package day3;

public class Pattern9 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    for (char i = 'D'; i >= 'A'; i--) {
      for (char j = 'A'; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}

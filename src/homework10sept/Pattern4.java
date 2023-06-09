package homework10sept;

public class Pattern4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int a = 1;
    int r;
    for (int i = 1; i <= 5; i++) {
      a = a * 10;
      r = a / 9;
      int ans1 = r * i;
      System.out.println(ans1);
    }
  }
}

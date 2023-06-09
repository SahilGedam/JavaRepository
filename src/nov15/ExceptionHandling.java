package nov15;

public class ExceptionHandling {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    try {
      int a = 20;
      int b = 0;
      int c = a / b;
      System.out.println(c);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getClass());
    } finally {
      System.out.println("hii");
    }
    System.out.println("exceptio handled");
  }
}

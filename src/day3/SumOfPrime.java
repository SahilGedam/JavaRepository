package day3;

//wrong code
public class SumOfPrime {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int num;
    int sum = 0;
    int temp;
    num = 1;
    int i;
    int count;
    for (num = 1; num <= 20; num++) {
      temp = 0;
      for (i = 2; i <= num; i++) {
        if (num % i == 0) {
          temp++;
          break;
        }
        if (temp == 0 && num != 1) {
          sum = sum + num;
        }
      }
      System.out.println(sum);
    }
  }
}

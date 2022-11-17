package homework10sept;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// add odd number series
		// 0,3,8,15,24......
		int sum = 0;
		int num = 0;
		for (int i = 2; i <= 20; i++) {
			if (i % 2 != 0) {
				// System.out.println(i);
				num = i;
				sum = sum + num;
				System.out.println(sum);
			}
		}

	}

}

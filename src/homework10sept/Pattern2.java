package homework10sept;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int k = 5; k >= i; k--) {
				System.out.print(' ');
			}

			for (int j = 1; j <= i; j++) {

				if (j % 2 == 0) {
					System.out.print(0);
				} else {
					System.out.print(1);
				}

			}
			System.out.println();
		}

	}

}

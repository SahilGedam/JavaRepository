package homeworkaug3;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
	}

}
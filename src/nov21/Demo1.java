package nov21;

class InvalidPassword extends Exception {
	InvalidPassword(String s) {
		super(s);
	}
}

public class Demo1 {
	public static void checkPassword(String password) {
		int uppercase = 0;
		int numbers = 0;
		char ch[] = password.toCharArray();
		try {
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= '0' && ch[i] <= '9') {
					numbers++;

				}

			}
			if (numbers == 0) {
				throw new InvalidPassword("invalid password");
			}
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= 'A' && ch[i] <= 'Z') {
					uppercase++;

				}

			}
			if (uppercase == 0) {
				throw new InvalidPassword("invalid password");
			}
		} catch (InvalidPassword e) {
			System.out.println("invalid password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// atleast 1 uppercase
		// atleast 1 digit
		String password = "Abjkdsdc554";
		Demo1.checkPassword(password);
	}

}

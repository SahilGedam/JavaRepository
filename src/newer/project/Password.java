package newer.project;

import java.util.*;

public class Password {
	public static void checkPassword(String allPasswords, String checkString) {

		// int count = 0;
		int valueat0 = Character.getNumericValue(checkString.charAt(0));
		int valueatlast = Character.getNumericValue(checkString.charAt(checkString.length() - 1));

		String[] allPasswordList = allPasswords.split(","); // array of strings
		for (int j = 0; j < allPasswordList.length; j++) {
			String word = allPasswordList[j];
			int capital = 0;
			// dont disturb code above

			int sum = 0;
			for (int k = 0; k < word.length(); k++) {
				if (Character.isDigit(word.charAt(k))) {
					sum = sum + Character.getNumericValue(word.charAt(k));
				}

			}

			// dont disturb code below
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (ch >= 'A' && ch <= 'Z') {

					capital++;
				}
			}
			if (capital == valueat0) {
				System.out.println("condition 1 true");
				// System.out.println(checkString.charAt(1));
				// System.out.println(word.charAt(word.length() - 1));
				if (checkString.charAt(1) == word.charAt(word.length() - 1)
						&& checkString.charAt(2) == word.charAt(word.length() - 2)
						&& checkString.charAt(3) == word.charAt(word.length() - 3)) {
					System.out.println("condition 2 true");

					// for 3rd condition
					if (sum == valueatlast) {
						System.out.println("condition 3 is true ");
						System.out.println("password is - " + word);

					}
//					else {
//						System.out.println("condition 3 is false");
//					}

				}

//				else {
//					System.out.println("condition 2 is false");
//				}
			}
//			else {
//				System.out.println("condition 1 is false");
//			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// input of all passwords
		System.out.println("enter list of passwords");
		// String allPassword = sc.next();

		String allPasswords = sc.nextLine();
		// String allPasswords = "theBestpassword,myPsJJword#3";
		System.out.println("enter check string");
		String checkString = sc.next();
		// String checkString = "1dro0";
		Password.checkPassword(allPasswords, checkString);
		sc.close();
	}

}

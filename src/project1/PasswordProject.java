package project1;

import java.util.*;

public class PasswordProject {
	public static String[] allPassword(String passList) {
		String[] allPasswords = passList.split(",");

//	System.out.println(Arrays.toString(allPasswords));
		return allPasswords;
	}

	public static void checkConditions(String[] allPasswords, char[] checkString1) {
//		System.out.println(Arrays.toString(allPasswords));
		int count1 = 0;
		int capitals=0;
		char[] word1 ;
		String word;
		boolean cond1 = false;
		for (int i = 0; i < allPasswords.length; i++) {
			 word = allPasswords[i];
			 word1 = word.toCharArray();
			 for (int j = 0; j<word1.length;j++) {
				if (word1[j] > 'A' && word1 [j]< 'Z') {
					capitals++;
					
				}
				
			 }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
// input of all passwords
		System.out.println("enter list of passwords");
		String passList = sc.nextLine();

		String allPasswords[] = allPassword(passList); // all pass words in array

//input of check string

		System.out.println("enter check string");
		String checkString = sc.next();
// char array of check String
		char checkString1[] = checkString.toCharArray();
// condition method		
		PasswordProject.checkConditions(allPasswords, checkString1);
	}

}

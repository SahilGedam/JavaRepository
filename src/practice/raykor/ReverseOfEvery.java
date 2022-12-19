package practice.raykor;

public class ReverseOfEvery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "yo yo honey singh";
		String s2[] = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			String word = s2[i];
			String s3 = " ";
			for (int j = 0; j < word.length(); j++) {
				s3 = word.charAt(j) + s3;
			}
			System.out.print(s3);
		}
	}

}

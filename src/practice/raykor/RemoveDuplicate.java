package practice.raykor;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s1 = "i love my india";
		for(int i=0;i<s1.length();i++) {
			boolean isDuplicate = false;
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					isDuplicate=true;
					break;
				}
			}
			if(isDuplicate==false) {
				System.out.print(s1.charAt(i));
			}
		}

	}

}

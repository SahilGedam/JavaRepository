package practicerough;

public class RemoveDuplicate {

	public static void duplicates(String str) {
		for(int i=0;i<str.length();i++) {
			boolean isVisited=false;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					isVisited=true;
					break;
				}
			}
			if(isVisited==false) {
				System.out.print(str.charAt(i)+" ");
			}
		}
	}
	public static void main(String[] args) {
		String s="JavaProgramm";
		RemoveDuplicate.duplicates(s);

				
	}

}

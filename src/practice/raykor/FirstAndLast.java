package practice.raykor;

public class FirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ThinkQuotient";
		//output = Thnt
		String s2 ="";
		int n =2;
		s2= s1.substring(0,n);
		String s3= s1.substring(s1.length()-2,s1.length());
		s2= s2+s3;
		System.out.println(s2);
	}

}

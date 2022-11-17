package oct14;

public class StringMinusString {
public static void StringMinString(String s1, String s2) {
	String s3= s1.replaceAll(s2, "");
	System.out.println(s3);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= "India";
String s2 = "In";
StringMinusString.StringMinString(s1, s2);
	}

}

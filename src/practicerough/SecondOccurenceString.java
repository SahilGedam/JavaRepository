package practicerough;

public class SecondOccurenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "vrushali cha question";
int first = s1.indexOf('a');
System.out.println("first occurance "+first);
int second = s1.indexOf('a', first+1);
System.out.println("second occurance " +second);
	}

}

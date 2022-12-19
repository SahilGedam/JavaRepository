package practicerough;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "raja";
String s2 ="";
char ch []= s1.toCharArray();
for(int i=0;i<ch.length;i++) {
	s2=ch[i]+s2;
}
System.out.println(s2);

	}

}

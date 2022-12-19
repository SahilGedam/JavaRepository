package nov15;
import java.util.*;
class InvalidPhoneNumber extends Throwable {
	InvalidPhoneNumber(String s){
		super(s);
	}
}
public class ExceptionHandling6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter phone num");
String num = sc.next();
try {
	int countLength =0;
	int checkChar =0;
	char [] ch = num.toCharArray();
	if(ch.length != 10) {
		throw new InvalidPhoneNumber("invalid phone num");
		
	}
	else {
		countLength++;
	}
for (int i =0;i<10;i++) {
	if(ch[i]<'0' || ch[i]>'9') {
		throw new InvalidPhoneNumber("invalid phone num");
	}
	else {
		checkChar ++;
	}
}
if (countLength>0 && checkChar>0) {
	System.out.println("valid phone number");
}
}catch (InvalidPhoneNumber e) {
	System.out.println(e.getMessage());
}

	}

}

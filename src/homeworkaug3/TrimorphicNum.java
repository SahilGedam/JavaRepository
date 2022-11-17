package homeworkaug3;
import java.util.*;
public class TrimorphicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter num");
Scanner sc = new Scanner(System.in);
int num= sc.nextInt();
int copy= num;
int cube=num*num*num;
int r=cube%10;
if(r==num) {
	System.out.println("trimorphic");
}
else {
	System.out.println("non trimporphic");
}
	}

}

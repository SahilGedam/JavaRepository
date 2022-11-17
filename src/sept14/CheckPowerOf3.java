package sept14;
import java.util.*;
public class CheckPowerOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter num");
int num = sc.nextInt();
boolean isPowerOf3= true;
if (num<=0) {
	isPowerOf3= false;
}
while(num%3==0) {
	num/=3;
}
if(num==1) {
	System.out.println(isPowerOf3=true);
}
else {
	System.out.println(isPowerOf3=false);
}
	}

}

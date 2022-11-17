package newprojects;
import java.util.*;
public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter num");
Scanner sc= new Scanner(System.in);
int num = sc.nextInt();
int square=num*num;
int cube= num*num*num;
int r= square%10;
int rem= cube%100;
if(r==num && square==rem) {
	System.out.println("automorphic");
}
else {
	System.out.println("non automorphic");
}
	}

}

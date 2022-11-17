package homework;
import java.util.*;
public class VovelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=('h');
		
System.out.println("enter charachter");
Scanner sc= new Scanner(System.in);
ch=sc.next().charAt(0);

switch(ch) {
case 'a' :
case 'e':
case 'i':
case 'o':
case 'u':System.out.println("vovel");
break;
default: System.out.println("consonent");

}



	}

}

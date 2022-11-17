package day3;
import java.util.*;
public class BinaryNonBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter num");
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
boolean isBinary=true;
int copy=num;
int r;
while(num!=0) {
	r=num%10;
	if(r>1 || r<0) {
		isBinary=false;
		break;
	}
	num=num/10;
}
if (isBinary==true) {
	System.out.println("binary");
}
else if (isBinary==false) {
	System.out.println("non binary");
}
	}

}

package oct12;
import java.util.*;
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
String s1= "hello";
String s2 = "hello world";
String s3 = "Hello World";
String s4 = "Hello World";
System.out.println(s1.length());
char arr[]= s4.toCharArray();
System.out.println("enter char to b searched");
char ch = sc.next().charAt(0);
int cnt=0;
for (int i= 0;i<arr.length;i++) {
	if (ch== arr[i]) {
		cnt++;
		System.out.println("char is available "+ (i+1));
	}
	
}
if(cnt>0) {
	System.out.println("character found multiple time");
}
else {
	System.out.println("char not available");
}
System.out.println();
System.out.println(" substring");
System.out.println("enter starting index");
int start= sc.nextInt();
System.out.println("enter end index");
int ent = sc.nextInt();
char subarray[]=new char [ent-start+1];
int j=0;
for (int i=start;i<=ent;i++) {
	subarray[j]=arr[i];
	j++;
}
String substr= new String (subarray);
System.out.println(substr);

	}

}

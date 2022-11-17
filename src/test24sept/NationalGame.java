package test24sept;

import java.util.Scanner;

public class NationalGame {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


System.out.print("enter country name");

Scanner sc = new Scanner(System.in);
String country=sc.next();
switch(country) {
case "india" : 
case "India" : System.out.print("hokey");
break;
case "china" : 
case "China" : System.out.print("table tennis");
break;
case "bangladesh" : 
case "Bangladesh" : System.out.print("kabaddi");
break;
case "us" : 
case "US" : System.out.print("football");
break;


}
}
}
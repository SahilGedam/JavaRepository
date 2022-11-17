package test18sept;
import java.util.*;
public class Q9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	double sales;
		double comm;
Scanner sc = new Scanner(System.in);
double bill=sc.nextDouble();

if(bill>2000) {
	comm=(bill*0.05);
	System.out.println("commision is "+comm);
}
else {
	System.out.println("no commision ");
}

	}

}
//	A salesmen is given commission on the basis of sales he makes 
//He gets a commission of 5% only if sales made by him is above 2000.WAP to accept sales amount and calculate the commission he gets.
package homework;
import java.util.*;
public class BinaryNonBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();

		if(isBinary(a)==true){
		System.out.println("The number is Binary");
		}
		else{
		System.out.println("The number is non binary");
		}
		}
		public static boolean isBinary(long p){
		while(p!=0){
		if(p%10>1){
		return false;
		}


		p=p/10;
		}
		return true;

	
}

	}



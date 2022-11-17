package homework;
import java.util.*;
public class TableOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		int i;
		Scanner sc = new Scanner(System.in);
		i=sc.nextInt();
		int count;
		for(count=1;count<=10;count++) {
			System.out.println(i*count);
		}

	}

}

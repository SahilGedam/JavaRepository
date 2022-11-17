package nov15;
import java.util.*;
public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr [];
try {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of array");
	int size = sc.nextInt();
	arr = new int [size];
	int sum=0;
	System.out.println("enter elements of array");
	for (int i=0; i<arr.length;i++) {
		arr[i]=sc.nextInt();
		sum = sum+arr[i];
	}
	System.out.println("sum of all elents in array is "+ sum);
	System.out.println("aeverage is "+ sum/0);
	sc.close();
	
}
catch (ArithmeticException e) {
	System.out.println(e.getMessage());
	System.out.println(e.getClass());
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
	System.out.println(e.getClass());
}
//catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
//	System.out.println(e.getMessage());
//	System.out.println(e.getClass());
//}
catch (Exception e) {
	System.out.println(e.getMessage());
	System.out.println(e.getClass());
	System.out.println("generic exception");
}
	}

}

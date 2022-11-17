package test9oct;
import java.util.*;
//4.	How to rearrange array in alternating positive and negative number[2]
public class Q4NegPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a={1, 2, 3, -4, -1, 4};
int []b= new int [a.length];
int k=0;
for(int i=0;i<a.length;i++) {
	
	
	 if  (a[i]>0) {
		b[k]=a[i];
		 k++;
	}
	 if (a[i]<0) {
			b[k]=a[i];
			k++;
		}
	
}
System.out.println(Arrays.toString(b));
	}

}

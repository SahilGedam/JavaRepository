package oct3;
import java.util.*;
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method 1 to input array
		int arr[][]= {{2,3,5},{6,5,4},{9,8,2}};
		
		// method 2 to input array
		int b[][]= new int[3][3];
		b[0][0]=1;
		b[0][1]=3;
		b[0][2]=5;
		b[1][0]=7;
		b[1][1]=4;
		b[1][2]=8;
		b[2][0]=6;
		b[2][1]=0;
		b[2][2]=2;
		
		// method 3 to input array
		int a[][]= new int [3][3];
Scanner sc= new Scanner (System.in);
System.out.println("enter array elements");
for (int i=0;i<a.length;i++) {
	for (int j=0;j<a.length;j++) {
		a[i][j]=sc.nextInt();
	}
}
// printing by traditional for loop

for (int i=0;i<arr.length;i++) {
	for (int j=0;j<arr.length;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
System.out.println();

// printing by enhanced for loop
for(int x[]:a) {
	for(int y:x) {
		System.out.print(y+" ");
	}
	System.out.println();
}

System.out.println();

// printing 2nd 2d loop
for (int i=0;i<b.length;i++) {
	for (int j=0;j<b.length;j++) {
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}


	}

}

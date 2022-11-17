package oct6;

import java.util.Arrays;

public class ColumnSum {

public static void colSum(int a[][]) {
	int b[]= new int[a.length];;
	for (int i=0;i<a.length;i++) {
		int  sum=0;
		for (int j=0;j<a.length;j++) {
			sum= sum+a[j][i];
			System.out.print(a[i][j]+" ");
		}
		 
//		for(int k=0;k<b.length;k++) {
//			b[k]=sum;
//		}
		System.out.println(" ="+sum);
		System.out.println();
		
	}
	//System.out.println(Arrays.toString(b));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][]= {{1,2,3},{5,9,4},{6,5,4}};
		ColumnSum.colSum(a);
	}

}

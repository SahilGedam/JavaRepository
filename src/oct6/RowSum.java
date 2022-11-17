package oct6;

public class RowSum {
public static void sumRow(int [][] a) {
	
	for (int i=0;i<a.length;i++) {
		int sum=0;
		for(int j=0;j<a.length;j++) {
			sum=sum+a[i][j];
			System.out.print(a[i][j]+ " ");
		}
		System.out.println(" ="+sum);
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a [][]= {{1,2,3},{5,9,4},{6,5,4}};
RowSum.sumRow(a);
	}

}

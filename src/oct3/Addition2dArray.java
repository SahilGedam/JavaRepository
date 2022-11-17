package oct3;

public class Addition2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,3,5},{6,5,4},{9,8,2}};
		int a[][]= {{2,6,5},{1,6,4},{3,9,2}};
		int b[][]= new int  [3][3];
		for (int i=0;i<b.length;i++) {
			for (int j=0;j<b.length;j++) {
				b[i][j]=(a[i][j]+arr[i][j]);
			}
			
		}
		for (int i=0;i<b.length;i++) {
			for (int j=0;j<b.length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

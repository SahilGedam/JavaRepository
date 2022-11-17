package oct6;

public class RowMax {
	public static void maxRow(int a[][]) {
		for (int i=0;i<a.length;i++) {
			int max= a[i][0];
			for(int j =0;j<a.length;j++) {
				
				if(a[i][j]> max) {
					max= a[i][j];
				}
				System.out.print(a[i][j]+ " ");
			}
			System.out.print(" =");
			System.out.println(max);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][]= {{1,2,12},{4,999,6},{7,8,11}};
		RowMax.maxRow(a);
	}

}

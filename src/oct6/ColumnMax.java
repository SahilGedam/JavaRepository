package oct6;
// code is complete but answer is showing in row instead of column
public class ColumnMax {
public static void maxCol(int a[][]) {
	for (int i=0;i<a.length;i++) {
		int max= a[0][i];
		for(int j =0;j<a.length;j++) {
			if(a[j][i]> max) {
				max= a[j][i];
			}
			System.out.print(a[i][j]+ " ");
		}
		System.out.print(" =");
		System.out.println(max);
	}
}
public static void minCol(int a[][]) {
	for (int i=0;i<a.length;i++) {
		int min= a[0][i];
		for(int j =0;j<a.length;j++) {
			if(a[j][i]< min) {
				min= a[j][i];
			}
			System.out.print(a[i][j]+ " ");
		}
		System.out.print(" =");
		System.out.println(min);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{4,6,2},{2,5,8},{9,1,7}};
ColumnMax.maxCol(a);
System.out.println();

ColumnMax.minCol(a);
	}

}

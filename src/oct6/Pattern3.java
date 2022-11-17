package oct6;

public class Pattern3 {
	public static void showPattern(int a[][]) {
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(j==0 || j==a.length-1 ) {
					System.out.print('*');
				}
				else if (i==j) {
					System.out.print('*');
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main (String []args) {
	int a [][]= {{1,2,3,2},{5,9,4,8},{6,5,4,5},{6,5,7,4}};
	Pattern3.showPattern(a);
}
}
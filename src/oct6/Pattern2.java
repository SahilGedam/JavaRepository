package oct6;

public class Pattern2 {
public static void showPattern(int a[][]) {
	for (int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(i==0 || j==0 || i==a.length-1 || j==a.length-1) {
				System.out.print('*');
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][]= {{1,2,3},{4,5,6},{7,8,9}};
		Pattern2.showPattern(a);
	}

}

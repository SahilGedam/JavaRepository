package oct6;

public class Pattern4 {
public static void main (String []args) {
	int a [][]= {{1,2,3,2},{5,9,4,8},{6,5,4,5},{6,5,7,4}};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<i+1;j++) {
			System.out.print('*');
		}
		System.out.println();
	}
}
}

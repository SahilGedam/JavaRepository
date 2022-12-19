package nov21;

public class KumarDemo {

	public static void main(String[] args) {
		int sum =0;
		// TODO Auto-generated method stub
		int a [] = {3,8,65,4,5,85,32,45,63,};
		for (int i=0;i<a.length;i++) {
			if(a[i]>9 && a[i]%2==0 ) {
			//	System.out.println(a[i]);
			int last = a[i]%10;
			sum = sum+last;
		}
			else if(a[i]<9 && a[i]%2==0 ) {
			//	System.out.println(a[i]);
			int last = a[i];
			sum = sum+last;
		}

		}
		System.out.println(sum);
	}

}

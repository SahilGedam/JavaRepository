package raykor2;

public class Demo4 {
public static void getIndex(int [] a,int currentSum,int index, int target, int [] b) {
	 currentSum=0;
	 index =0;
	if(target == currentSum) {
		System.out.print("output = [ ");
		for(int i =0;i< b.length; i++) {
			if(b[i]==1) {
				if(a[i]!=0) {
					System.out.println(" "+a[i]);
				}
			}
		}
		System.out.println("]\n");
		
	}
	else if(index==a.length) {
		return;
	}
	else {
		b[index]=1;
		currentSum += a[index];
		Demo4.getIndex(a, currentSum, index+1, target, b);
		currentSum -=a[index];
		b[index]=0;
		Demo4.getIndex(a, currentSum, index+1, target, b);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 11, 15, 5, 2 };
		int target = 9;
		int b [] = new int [a.length];
		Demo4.getIndex(a,0,0, target,b);
	}

}

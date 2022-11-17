package test1oct;
//12.) WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34].


public class ReplaceZeroOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
for(int i=0;i<a.length;i++) {
	//System.out.println(a[i]);
	if(a[i]==0) {
		a[i]=1;
	}
	System.out.println(a[i]);
}
	}

}

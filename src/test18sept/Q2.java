package test18sept;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=100;i<=400;i++) {
	int num=i;
	int count=0;
	int r;
	while(num>0) {
		r=num%10;
		if(r%2==0) {
			count++;
			if(count==3) {
				System.out.println(i);
			}
		}
		num=num/10;
	}
}
	}

}

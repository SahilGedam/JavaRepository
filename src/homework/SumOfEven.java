package homework;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum=0;
		for(i=1;i<=20;i++) {
			if (i%2==0) {
				sum=sum+i;
			}
			
		}
		System.out.println(sum);

	}

}

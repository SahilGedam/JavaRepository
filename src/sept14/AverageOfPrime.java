package sept14;

public class AverageOfPrime {
public int prime() {
	int sum=0;
	 int count=0;
	for (int num=1;num<=20;num++) {
		for(int i=2;i<=num;i++) {
			if (num%i!=0) {
				sum=sum+num;
				count++;
			}
		}
	}
	System.out.println("sum="+sum + " coount="+ count);
	return (sum/count);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AverageOfPrime a = new AverageOfPrime();
a.prime();
int b= a.prime();
System.out.println(b);

	}

}

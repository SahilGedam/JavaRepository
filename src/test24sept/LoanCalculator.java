package test24sept;

public class LoanCalculator {
	int p;
	int intrest;
	int loan,value1,value2;
	int amount=2;
	int rate=10;
	
	
public void Loan(int i) {
	System.out.println("housingl");
	intrest=i;
	loan=amount*(100+rate);
	System.out.println(loan);
	//loan is principle amount *(100+rate)
}
public void Loan( int i,int k) {
	System.out.println("commercial l");
	value1=i;
	value2=k;
	loan= amount*(value1+value2+100);
	System.out.println(loan);
	// loan = priciple*(value 1+ value 2+ 100)
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LoanCalculator l = new LoanCalculator();
l.Loan(9);

	}

}

package nov15;
// exception propagation
public class ExceptionHandling3 {
public static void m1 () {
	int a=2;
	int b=0;
	int c=a/b;
	System.out.println(c);
}
static void m2 () {
	m1();
	
}
static void m3() {
	m2();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
m3();
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("handled in main method");
		}
		finally {
			System.out.println("finally in main method");
		}
	}

}

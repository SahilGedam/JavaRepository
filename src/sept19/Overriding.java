package sept19;
class A {
	int a= 4;
	public int method1() {
		return 4;
	}
	public void method2() {
		System.out.println("method 2 of class a");
	}
}

class B extends A {
	@Override
	public void method2() {
		System.out.println("method 2 of class b"); // method2 B override  method 2 A
	}
	public void method3() {
		System.out.println("method 3 of class b");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A i = new A();
		i.method2();
		B k = new B();
		k.method2();
	}

}

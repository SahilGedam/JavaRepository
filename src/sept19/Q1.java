package sept19;

abstract class Bottle1 {
	int j = 65;

	abstract void capacity();

	void water() {
		System.out.println("paani");
	}

	Bottle1() {
		System.out.println("constructor of abs class");
	}

}

class WaterBottle1 extends Bottle1 {

	@Override
	void capacity() { // implementation to abstract method
		// TODO Auto-generated method stub
		super.j = 325; // use of super keyword
		super.water(); // use of super

		int x = 54;
		System.out.println("capacity of bottle is " + x + " liters");
		System.out.println(j);
	}

	WaterBottle1() {
		super(); // constructor from super class
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterBottle1 a = new WaterBottle1();
		a.capacity();
	}

}

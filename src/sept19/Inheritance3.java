package sept19;

class Container {
	int quantity;
}

class Bottle extends Container {
	int height;
}

class WaterBottle extends Bottle {
	void display() {
		System.out.println("height " + height + "    " + "quantity " + quantity);
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterBottle w = new WaterBottle();

		w.display();
	}

}

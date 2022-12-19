package raykor;

public class Animal {
	public void show() {
		System.out.println("i am in horse");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();

		a.show();
	}
}

class Horse extends Animal {
	@Override
	public void show() {
		System.out.println("i am in animal");
	}


}

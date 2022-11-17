package sept19;

class Gaming {
	public int price = 150000;

	Gaming() {
	}

	public Gaming(double g) {
		double d = 6565.65;
		System.out.println(d);
	}
}

class VideoGames extends Gaming {
	public int screentime = 5;

	void display() {
		System.out.println(screentime);
	}
	public VideoGames() {
		int kills=65;
		System.out.println(kills); // use 3 of super keyword constructor chaining
	}
}

class MobileGames extends VideoGames {
	public MobileGames() {
		super();
	}

	public int price = 5;

	void updateDetails() {

		super.price = 65; // use 1 of super calling instance variable
		super.display(); // use 2 of super calling parents method
	}
	

}

public class SuperKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobileGames pubg = new MobileGames();
		pubg.display();

	}

}

package sept22;

abstract class Board {
	int x = 25;

}

interface Writable {
	int y = 98;

}

class CardBoard extends Board implements Writable {

	public void sys() {
		int z = (x + y);
		System.out.println(z);
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		CardBoard a = new CardBoard();
		a.sys();
	}

}

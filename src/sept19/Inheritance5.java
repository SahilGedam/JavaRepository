package sept19;
class Furniture{
	int legs;
}
class Table extends Furniture{
	void acceptDetails() {
		legs=4;
	}
	void showDetails() {
		System.out.println("legs "+ legs);
	}
}
class Sofa extends Furniture{
	void showDetails() {
		legs=12;
		System.out.println("legs "+ legs);
	}
}
public class Inheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sofa s= new Sofa();
s.showDetails();
Table t = new Table();
t.acceptDetails();
t.showDetails();
	}

}

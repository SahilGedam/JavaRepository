package sept19;
class Devices{
	double price;
	
}
class Electronics extends Devices{
	String company;
}
class Samsung extends Electronics{
	void show() {
		company="Shyamsing";
		price=98745632;
		System.out.println(company);
	}
	
	
}
public class Inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Samsung s = new Samsung();
s.show();
	}

}

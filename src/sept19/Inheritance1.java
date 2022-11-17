package sept19;
class Vegetables {
	int weight=30;
	char quality='A';
	
}
class Aalu extends Vegetables {
	String shape="round";
	void show() {
		System.out.println(weight+" "+quality+" "+shape);
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aalu a= new Aalu();
a.show();
	}

}

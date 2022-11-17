package sept19;
class Mbbs{
	int age=30;
	String degree="mbbs";
}
class Munna_Bhai extends Mbbs{
	String name="Munna Bhai";
	String friend= "Circuit";
	void display() {
		System.out.println(name+" "+degree+ " "+ "is best friend of "+friend);
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Munna_Bhai a = new Munna_Bhai();
a.display();
	}

}

package sept19;

public class OverLFinal {
final void showDetails() {
	System.out.println("in default final method");
}
public void showDetails(int y) {
	System.out.println("in int parameterised method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverLFinal a= new OverLFinal();
a.showDetails(65);
	}

}

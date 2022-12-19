package raykor;
interface Raykorable1 {
	void show();
}
interface Raykorable2{
	void show1();
}
public class Demo1 implements Raykorable1,Raykorable2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raykorable1 r1 = new Demo1();
		r1.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("1s interface");
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("2md interface");
	}
	
	

}

package oops1;

public class CarDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car swift= new Car();
		System.out.println(swift.getModelNum());
		System.out.println(swift.getname());
		System.out.println(swift.getPrice());
		System.out.println(swift.getspeed());
		
		swift.setModelNum(420);
		swift.setname("dZire");
		swift.setprice(750000);
		swift.setspeed(145);
		
		System.out.println(swift.getModelNum());
		System.out.println(swift.getname());
		System.out.println(swift.getPrice());
		System.out.println(swift.getspeed());
		
		

	}

}

package sept14;
class Engine {
	String type;
	Engine(String type){
		this.type=type;
	}
	public String toString() {
		return type;
	}
	
}
class Gear {
	String gearType;
	Gear (String gearType){
		this.gearType=gearType;
	}
	public String toString() {
		return gearType;
	}
}
public class Car {
int modelNo;
String name;
int price;
Engine engine;
Gear gear;
Car(int modelNo,String name, int price, Engine engine, Gear gear){
	this.modelNo=modelNo;
	this.name=name;
	this.price=price;
	this.engine=engine;
	this.gear=gear;
	
}
public String toString() {
	return modelNo+" "+ name+ " "+ price+" "+ engine+" "+gear;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car a= new Car(420,"swift",750000,new Engine("petrol"),new Gear("manual"));
System.out.println(a);
	}

}

package test1oct;
//8) There are four classes a) Car (carId, carcolor) b) Engine
//(engineid ,lastenginecleandate) c) SubEngine (subenginetype)
//d) Gear (type - auto manual)
//Car has Engine, Engine has SubEngine, Car also has Gear
//Create Object in Object (Containment) for above scenario [2M]
class Car{
	int id=1;
	String color="black";
	Engine e = new Engine();
	Gear g= new Gear();
}
class Engine{
	int engineId=1234;
	int lastEngineCleanDate=31;
	Subengine s= new Subengine();
}
class Subengine {
	String subEngineType="4*4";
	
}
class Gear{
	String type="manual";
}
public class CarContainment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c= new Car();
		System.out.println("engine id is "+ c.e.engineId);

	}

}

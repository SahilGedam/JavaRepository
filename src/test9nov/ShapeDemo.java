package test9nov;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape t = new Triangle();
		t.draw();
	}
}

class Shape {
	protected void draw() {
		System.out.println("I am drawing shape");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("I am drawing triangle");
	}
}

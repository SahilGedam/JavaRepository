package project1;

import java.util.*;

interface Holidable {
	String nextholiday = "Monday"; // interface
}

abstract class Manager { // abstract class
	String manName;
	int age;
	private String shopName;  // encapsulation

	Manager() {
		manName = "Ambani";
		age = 60;
		setShopName("Cafetaria");
	}

	void showManager() {
		System.out.println(" Manager name is " + manName + "\n" + " Manager age is " + age);
	}

	public String getShopName() {  // getter
		return shopName;
	}

	public String setShopName() { // setter
		return shopName;
	}

	void changeShopName() {
		this.setShopName("Chai Tapri"); // this keyword
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
}

class Employee extends Manager implements Holidable { // inheritance

	Scanner sc = new Scanner(System.in);
	String empName;
	int id, manP, tp1;
	// int t1;
	char ch1, ch2;

	void employee1() {

		System.out.println("enter name");
		empName = sc.nextLine();

		System.out.println("enter id");
		id = sc.nextInt();
		System.out.println(empName + " " + id);

		System.out.println("Best of luck for today " + empName);
		System.out.println(" your next holiday is " + nextholiday);
	}

	void manager1() {
		System.out.println("do you want to change shop name");
		System.out.println(" press y for yes & press n for no");
		ch1 = sc.next().charAt(ch1);
		if (ch1 == 'n') {
			System.out.println("have a nice day");

		} else if (ch1 == 'y') {
			System.out.println("name will be changed to ");
			changeShopName();
			System.out.println(" new shop name is " + getShopName());

		}

	}

	@Override
	public void changeShopName() { // overriding
		setShopName(sc.next());

	}

}

public class CoffeeShop extends Employee { // inheritance
	Scanner sc = new Scanner(System.in);
	int i1, i2, i3, totalcups, p1, p2, p3, totalprice1, pass;
	double totalprice;

	void coffeeShop1() {

		System.out.println("welcome to " + getShopName());
		System.out.println("Are you customer or employee");
		System.out.println("press c for customer " + "\n" + "press e for employee");
		char ch = sc.next().charAt(0);
		if (ch == 'c') {
			menu();
			char ch1 = sc.next().charAt(0);
			if (ch1 == 'y') {
				acceptOrder();

			} else if (ch == 'n') {
				System.out.println("have a nice day");
			}
		} else if (ch == 'e') {
			System.out.println("enter 4 digit password");
			pass = sc.nextInt();

			if (pass == 1234) {
				System.out.println("Access granted");
				employee1();

			} else if (pass == 4321) {
				System.out.println("welcome manager " + manName);
				manager1();
			} else {
				System.out.println("invalid password");
			}
		}

	}

	void menu() {
		System.out.println("Menu");
		System.out.println("tea 5 rs" + "\n" + "hot coffee 5 rs" + "\n" + "cold coffee 10 rs");
		System.out.println();
		System.out.println("do you want to order");
		System.out.println("press y for yes" + "\n" + "press n for no");

	}

	void acceptOrder() {

		System.out.println(" how many cups of tea");
		i1 = sc.nextInt();
		System.out.println(" how many cups of hot coffee");
		i2 = sc.nextInt();
		System.out.println(" how many cups of cold coffee");
		i3 = sc.nextInt();
		total(i1, i2, i3);
	}

	void total(int i1, int i2, int i3) {
		totalcups = i1 + i2 + i3;
		System.out.println("your tea cups are " + i1);
		System.out.println("your coffee cupsare " + i2);
		System.out.println("your cold cups coffee are " + i3);
		System.out.println("total cups are " + totalcups + " cups");
		total();
		System.out.println("your total price including gst is " + totalprice);
		System.out.println();
		System.out.println("your order will be ready in a minute" + "\n" + " thank you & have a nice day");
	}

	void total() { // method overloading && polymorphism
		p1 = i1 * 5;
		p2 = i2 * 5;
		p3 = i3 * 10;
		totalprice1 = p1 + p2 + p3;

		totalprice = totalprice1 * 1.18;

	}

	void changeManager() {
		super.manName = "raja"; // super keyword
		super.age = 55;

	}

	public static void main(String[] args) {

		CoffeeShop c = new CoffeeShop();
		c.coffeeShop1();
//		c.changeManager();
//		c.showManager();

	}
}

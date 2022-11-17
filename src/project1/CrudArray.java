package project1;

import java.util.*;

class Devices {
	int price;
	String name;

}

class Electronic {
	int battery;
	boolean recyclable;
	String manufacturer;
	Devices d = new Devices(); // containment

}

public class CrudArray {
	static Scanner sc = new Scanner(System.in);

	static Electronic[] elec = new Electronic[2];

	public static void createArray() {
		for (int i = 0; i < 2; i++) {
			System.out.println("enter device name");
			String name = sc.next();
			System.out.println("enter price");
			int price = sc.nextInt();
			System.out.println("is recyclable");
			boolean recyclable = sc.nextBoolean();
			System.out.println("enter battery mah");
			int battery = sc.nextInt();
			System.out.println("enter manufacturer name");
			String manufacturer = sc.next();

			Electronic ele = new Electronic();
			ele.battery = battery;
			ele.manufacturer = manufacturer;
			ele.recyclable = recyclable;
			ele.d.name = name;
			ele.d.price = price;

			elec[i] = ele;

			System.out.println(
					ele.d.name + " " + ele.d.price + " " + ele.battery + " " + ele.manufacturer + " " + ele.recyclable);
		}
	}

	public static void readArray() {
		// System.out.println(Arrays.toString(elec));
		System.out.println(" enter name of device to be searched");
		String devName = sc.next();

		for (int i = 0; i < elec.length; i++) {

			if (elec[i].d.name.equals(devName)) {
				System.out.println(elec[i].d.name + " " + elec[i].d.price + " " + elec[i].battery + " "
						+ elec[i].manufacturer + " " + elec[i].recyclable);

			}

		}

	}

	public static void updateArray() {
		System.out.println(" enter name of device to be updated");
		String devName = sc.next();
		for (int i = 0; i < elec.length; i++) {

			if (elec[i].d.name.equals(devName)) {

				System.out.println("enter new device name");
				String name = sc.next();
				System.out.println("enter new price");
				int price = sc.nextInt();
				System.out.println("is recyclable");
				boolean recyclable = sc.nextBoolean();
				System.out.println("enter new battery mah");
				int battery = sc.nextInt();
				System.out.println("enter new manufacturer name");
				String manufacturer = sc.next();

				elec[i].battery = battery;
				elec[i].manufacturer = manufacturer;
				elec[i].recyclable = recyclable;
				elec[i].d.name = name;
				elec[i].d.price = price;

				System.out.println("updated to " + elec[i].d.name + " " + elec[i].d.price + " " + elec[i].battery + " "
						+ elec[i].manufacturer + " " + elec[i].recyclable);

			}

		}

	}

	public static void deleteArray() {
		System.out.println(" enter name of device to be deleted");
		String devName = sc.next();
		for (int i = 0; i < elec.length; i++) {

			if (elec[i].d.name.equals(devName)) {

				elec[i].battery = 0;
				elec[i].manufacturer = null;
				elec[i].recyclable = false;
				elec[i].d.name = null;
				elec[i].d.price = 0;

				System.out.println("updated to " + elec[i].d.name + " " + elec[i].d.price + " " + elec[i].battery + " "
						+ elec[i].manufacturer + " " + elec[i].recyclable);

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		createArray(); // create array
		readArray(); // read array
		updateArray(); // update array
		deleteArray(); // delete array
	}

}

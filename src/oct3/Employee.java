package oct3;

public class Employee {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public String toString() {
		return id + " " + name + " " + salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp[] = new Employee[3];
		emp[0] = new Employee(1, "vijay", 32145.32);
		emp[1] = new Employee(2, "dinanath", 10000.32);
		emp[2] = new Employee(3, "chauhan", 20000);

//		System.out.println();
//		System.out.println("after increment");
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].salary < 15000) {
				emp[i].salary = emp[i].salary * 1.1;
			}
		}

		for (int i = 0; i < emp.length; i++) {

			System.out.println(emp[i]);
		}
	}

}

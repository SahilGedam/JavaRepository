package nov29;

import java.util.*;

class Student {
	int rollNo;
	String stuName;
	int marks;

	public Student(int rollNo, String stuName, int marks) {
		// super();
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName + ", marks=" + marks + "]";
	}

}

public class Employee {
	int id;
	String name;
	int sal;

	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public static void studentIterator() {
		ArrayList<Student> al2 = new ArrayList();
		al2.add(new Student(1001, "narendra", 31));
		al2.add(new Student(1002, "eknath", 100));
		al2.add(new Student(1003, "devendra", 420));
		Iterator itr = al2.iterator();
		while (itr.hasNext()) {
			Student s = (Student) itr.next();
			if (s.marks > 60) {
				System.out.println(itr.next());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList();

		al.add(new Employee(101, "sahil", 100000));
		al.add(new Employee(102, "kumar", 10000));
		al.add(new Employee(103, "shrutika", 1000));
//System.out.println(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		studentIterator();

	}

}

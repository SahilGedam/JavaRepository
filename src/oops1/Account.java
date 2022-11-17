package oops1;

import java.util.*;

public class Account {
	String name;
	int id;
	String type;
	int accNum;
	int balance;

	void acceptDetails(String n, int i, String t, int a, int b) {
		name = n;
		id = i;
		type = t;
		accNum = a;
		balance = b;
	}

	void displayDetails() {
		System.out.println(name + "\n" + id + "\n" + type + "\n" + accNum + "\n" + balance);
	}

	void withdrawl() {
		System.out.println("enter withdrawl amount");
		Scanner sc = new Scanner(System.in);
		int widr = sc.nextInt();
		balance = balance - widr;
	}

	void deposit() {
		System.out.println("enter deposit amount");
		Scanner sc = new Scanner(System.in);
		int depo = sc.nextInt();
		balance = balance + depo;
		System.out.println("current balance " + balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.acceptDetails("raja", 112233, "saving", 998877, 10000);

		a.displayDetails();
		a.withdrawl();
		a.deposit();

	}

}

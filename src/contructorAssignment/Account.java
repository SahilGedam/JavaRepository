package contructorAssignment;
//1. Create a class Account with member Variable: long accountNo, String customerName.

//Make them public.

public class Account {
	public long accountNo;
	public String customerName;
//	3. Create default constructor assign new value to all variables. Write SOP I am in default
//	constructor

//	Account() {
//		accountNo = 2321;
//		customerName = "raja";
//		System.out.println("i am in default constructor");

	//}
//	8. From Account class, comment the default constructor with no arguments and try to
//	create an Account object by calling the default constructor. Note – If a non-default (non-
//	parameterized) constructor is present in the source code, Java will not provide a default
//	one. Hence you cannot do Account a = new Account();


	void display() {
		System.out.println(accountNo + customerName);
	}

//	5. Define a constructor which takes all arguments and assigns those values to the member
//	variables. SOP I am in parameterized constructor
//	Account(long j, String k) {
//		accountNo = j;
//		customerName = k;
//		System.out.println("i am in parameterized constructor");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. In main, create a new object of the Account class and print the member variables value.
//		Note – Default constructor is provided by Java to facilitate the creation of a new object.
//		Here variables are assigned default values

		Account vdd = new Account();
		vdd.display();
//		4. In main, create another object of the Account class and print the member variables
//		value. Note – Since you have defined a (default) constructor, Java does not provide
//		another one
		Account sdd = new Account();
		sdd.display();
//		6. In main, to create another object of the Account class using the constructor with all
//		arguments and print the member variable values
//		Account gdd = new Account(98745, " hgfrrf");
//		gdd.display();
////		7. In main method, create 2 Account objects with different account numbers and names.
////		Then print the values of all the member variables of both the accounts.
//		Account fdd = new Account(963258,"kisan");
//		fdd.display();
//		Account kdd= new Account (254125,"ramkisan");
//		kdd.display();
//		

	}

}

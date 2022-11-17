package oops1;

public class Student {
	int id;
	String name;
	int sub1, sub2, sub3;
	float percent;

	void acceptDetails(int i, String n, int s1, int s2, int s3) {
		id = i;
		name = n;
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		
	}

	void percentge() {
		int total = sub1+sub2+sub3;
		percent = (total / 3);
		System.out.println(percent);
	}

	void display() {
		System.out.println(id + " " + name + " " + sub1 + " " + sub2 + " " + sub3 + " "+ percent);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student();
		a.acceptDetails(0, null, 0, 0, 0);
		a.percentge();
		a.display();
		
	}

}

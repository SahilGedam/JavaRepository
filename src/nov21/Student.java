package nov21;

public class Student {
 private int roll;
private String name;
private int[] marks;
//marks will be array of integer
// write getter and setters
public void setRoll (int roll) {
	this.roll=roll;
}
public int getRoll() {
	return roll;
}
public void setName (String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setMarks (int [] marks) {
	this.marks=marks;
}
public int [] getMarks () {
	return marks;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="hii";
s=s+"byee";
System.out.println(s);
	}

}

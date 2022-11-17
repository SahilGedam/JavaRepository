/**
 * 
 */
package test1oct;
import java.util.*;
/**
 * @author cw
 *
 */
class Employee {
	int id;
	String name;
	double salary;

public Employee(int id,String name,double salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
}	
}
public class ObjectArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp [] = new Employee[3];
emp [0]= new Employee(558,"hjncsd",456.45);
emp[1]= new Employee(154,"hbcws",48948.498);
emp[2]= new Employee(986,"hjcnu",48.84);
for (int i=0;i<emp.length;i++) {
	System.out.println(emp[i].id+ " "+ emp[i].name+" "+ emp[i].salary);
}

	}

}

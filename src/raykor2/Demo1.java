package raykor2;

import java.util.*;

public class Demo1 {
	public static void remove(ArrayList al) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter city to be removed");
		String s1 = sc.next();
		for(int i=0;i<al.size();i++) {
			if(s1.equals(al.get(i))) {
				al.remove(al.get(i));
			}
		}
		System.out.println(al);
		System.out.println("do you want to continue removing");
		String s2 = sc.next();
		if(s2.equals("yes")) {
			Demo1.remove(al);
		}
		else if(s2.equals("no")) {
			System.out.println("program is terminated");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList  <String> al = new ArrayList <>();
		al.add("mumbai");
		al.add("pune");
		al.add("nagpur");
		al.add("delhi");
		al.add("kolkata");
		al.add("chennai");
		System.out.println(al);
		Demo1.remove(al);
	}

}

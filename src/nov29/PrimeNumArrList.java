package nov29;

import java.util.*;

public class PrimeNumArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList();
		al.add(5);
		al.add(6);
		al.add(11);
		al.add(26);
		al.add(96);
		al.add(65);
		al.add(17);
System.out.println(al);
int num =0;
int i=0;
for (i =0; i<al.size();i++) {
	boolean isPrime =true;
	for(int j =2;j<i;j++) {
		if(al.get(i)%j==0) {
			isPrime = false;
			break;
		}
	}
	if(isPrime==true) {
		System.out.println(al);
	}
}
	}

}

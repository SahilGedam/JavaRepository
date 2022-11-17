package test1oct;
//13) Write a  program that prints the numbers
//from 1 to 50. But for multiples of three print “buzz” instead of the
//number and for the multiples of five print “fizz”. For numbers which
//are multiples of both three and five print “ buzzfizz “. After program
//looping is completed print how many times buzz was printed, fizz
//was printed and buzzfizz was printed

public class BuzzFizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0;
		int count2=0;
		int count3=0;
for (int i=0;i<=50;i++) {
	if(i%3==0 && i%5==0) {
		count1++;
		System.out.println("buzzfizz");
	}
	else if(i%5==0) {
		count2++;
		System.out.println("fizz");
	}
	else if(i%3==0 ) {
		count3++;
		System.out.println("buzz");
	}
	else {
		System.out.println(i);
	}
}
System.out.println("buzzfizzz "+ count1);
System.out.println("fizzz "+ count2);
System.out.println("buzz "+ count3);
	}

}

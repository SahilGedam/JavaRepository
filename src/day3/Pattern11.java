package day3;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=4; i++) {
			if (i%2!= 0) {
				for (int j=1; j <= i; j++) {
					System.out.print(j);
					}
			}
				
			 else {
				for (char k = 'A'; k <= i; k++) {
					System.out.print(k);
				}
			 }
				
			}
	}

}

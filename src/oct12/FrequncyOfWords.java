package oct12;
import java.util.*;
// complete
public class FrequncyOfWords {
public static void freq(String s) {
	String[]word = s.split("\\s");
	String visited ="+/";
	for (int i =0; i<word.length; i++) {
		if (word[i]!=visited) {
			int count =1;
			for (int j =1+i; j<word.length;j++) {
				if (word[i].equals(word[j])) {
					count++;
					word[j]=visited;
				}
			}
			System.out.println("frequency of "+ word[i]+" = "+count  );
		}
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  string");
		String s = sc.nextLine();
		
		freq(s);
	}

}

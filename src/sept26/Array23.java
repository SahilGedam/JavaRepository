package sept26;
import java.util.*;
public class Array23 {
public static char maxChar(char ch[]) {
	char max=ch[0];
	for(int i=0;i<ch.length;i++) {
		if (max<ch[i]) {
			max=ch[i];
		}
	}
	return max;
}
	static public  void main(String[] sdv) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
char[] ch = new char[5];
System.out.println("enter char elements");
for (int i=0;i<ch.length;i++) {
	ch[i]=sc.next().charAt(0);
	
}
System.out.println(Array23.maxChar(ch));
	}


}

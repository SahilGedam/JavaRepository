package practice1d.array;
// complete
import java.util.Arrays;

public class AltArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int j []= {2,6,8,4};
int k []= {8,6,5,1};
int l []= new int [j.length+k.length];
int index =0;
for (int i =0; i<j.length;i++) {
	 l [index++]= j[i];
	 l [index++]= k[i];
	
}
System.out.println(Arrays.toString(l));
	}

}

package sept26;
import java.util.*;
public class ArayFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float demo []= new float [5];
demo[0]=23.25f;
demo[1]=658.65f;
demo[2]=874.325f;
demo[3]=875.654f;
demo[4]=85.32f;
System.out.println("by traditional for loop");
for (int i=0;i<demo.length;i++) {
	System.out.println(demo[i]);// way 1 to print array
}
System.out.println();
System.out.println("by enhanced for loop");
for (float x:demo) {// way 2 to print array
	System.out.println(x);
}
System.out.println();
System.out.println("by toString");// way 3 to print array
System.out.println(Arrays.toString(demo));

	}

}

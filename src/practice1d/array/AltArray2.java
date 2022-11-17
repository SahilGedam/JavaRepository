package practice1d.array;

import java.util.Arrays;

public class AltArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 3, 9, 7,8,0,1 };
		int[] a2 = { 2, 4, 6, 8 };
		int[] concat = new int[a1.length + a2.length];
		for (int i = 0, j = 0; i+j < concat.length;) {
		    if(i<a1.length) {
		        concat[i+j] = a1[i++];
		    }
		    if(j<a2.length) {
		        concat[i+j] = a2[j++];
		    }

		}
		System.out.println(Arrays.toString(concat));
	}

}

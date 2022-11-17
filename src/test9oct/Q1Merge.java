package test9oct;
//incomplete
import java.util.Arrays;

//1.	Merging elements of two different arrays alternatively in third array [2]
public class Q1Merge {
	public static void mergeArray(int[] arr1, int[] arr2) {
		int arr3[]= new int [arr1.length+arr2.length];
		int m = 0, n=1;
		for (int i = 0; i < arr3.length;i++) {
			
		arr3[i]=arr1[m];
			if (m<arr2.length){
				arr3[n]=arr2[m];
				i=i+2;
				n=n+2;
			}
			else {
				m++;
				i++;
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+ " ");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int arr2[] = { 11, 22, 33, 44 };
		
		mergeArray(arr1, arr2);
	//	System.out.println(arr3.length);
	}

}

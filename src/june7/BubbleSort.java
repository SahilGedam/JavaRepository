package june7;

import java.util.Arrays;

public class BubbleSort {
static void bubbleSort(int [] arr) {
	int n = arr.length;
	int temp =0;
	for(int i=0;i<n;i++) {
		for(int j =1;j<(n-i);j++) {
			if(arr[j-1]>arr[j]) {
				temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 35, 5, 5, 2 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

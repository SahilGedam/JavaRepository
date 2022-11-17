package test1oct;
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20];

		int initial_element, next_element;
		int i;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int arr_size = sc.nextInt();

		System.out.println("Enter array elements");

		for (i = 0; i < arr_size; ++i) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array With Duplicates");

		for (i = 0; i < arr_size; ++i) {
			System.out.println(arr[i]);
		}

		System.out.println("Array Without Duplicates ");
		for (initial_element = 0; initial_element < arr_size; ++initial_element) {
			for (next_element = initial_element + 1; next_element < arr_size;) {

				if (arr[initial_element] == arr[next_element]) {
					for (int temp = next_element; temp < arr_size; ++temp) {
						arr[temp] = arr[temp + 1];
					}
					arr_size = arr_size - 1;
				} else {

					next_element++;
				}
			}
		}

		for (i = 0; i < arr_size; ++i)
			System.out.println(arr[i]);

	}

}

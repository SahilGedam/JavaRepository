package june7;

public class BinarySearch {
	static void binarySearch(int[] arr, int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println(mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
			if (first > last) {
				System.out.println("not present");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int key = 1;
		int last = arr.length - 1;
		BinarySearch.binarySearch(arr, 0, last, key);

	}

}

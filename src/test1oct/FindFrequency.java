package test1oct;

public class FindFrequency {

	public static void main(String[] args) {
		int a[] = { 6, 3, 1, 6, 2 };
		for (int i = 0; i < a.length; i++) {
			boolean isVisited = false;
			int count = 1;
			for (int k = i - 1; k >= 0; k--) {
				if (a[i] == a[k]) {
					isVisited = true;
					break;
				}
			}
			if (isVisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(a[i] + " " + count);
			}
		}
	}

}

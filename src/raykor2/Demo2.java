package raykor2;

public class Demo2 {
//	public static void getIndex(int[] a, int target) {
//		boolean isSum = false;
//		System.out.println(target);
//		for (int i = 0; i < a.length; i++) {
//			int firstNum = a[i];
//			int secondNum = 0;
//			int thirdNum = 0;
//			// System.out.println(firstNum);
//			for (int j = i + 1; j < a.length; j++) {
//				secondNum = a[j];
//				// System.out.println(secondNum);
//				if (firstNum + secondNum == target) {
//					System.out.println(i + " " + j);
//					isSum = true;
//				}
////				else {
////					System.out.println("-1,-1");
////				}
//				if (isSum == false) {
//					for (int k = j + 1; k < a.length; k++) {
//						thirdNum = a[k];
//						if (firstNum + secondNum + thirdNum == target) {
//							System.out.println(i + " " + j + " " + k);
//							isSum = true;
//						}
//
//					}
//				}
//			}
//
//		}
//		if (isSum == false) {
//			System.out.println("-1,-1");
//		}
//	}
	public static void find(int[] A, int currSum, int index, int sum, int[] solution) {
		if (currSum == sum) {

			System.out.print("Output: [");
			for (int i = 0; i < solution.length; i++) {
				if (solution[i] == 1) {
					if (A[i] != 0) {
						System.out.print("  " + i);
					}
				}
			}
			System.out.print(" ]\n");

		} else if (index == A.length) {
			return;
		} else {
			solution[index] = 1;
			currSum += A[index];
			find(A, currSum, index + 1, sum, solution);
			currSum -= A[index];
			solution[index] = 0;
			find(A, currSum, index + 1, sum, solution);
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = { 2, 11, 15, 7, 2 };
		int a [] = {1,1,1,1,1,1,1,1,1};
		int target = 9;
		// Demo2.getIndex(a, target);
		int b[] = new int[a.length];
		Demo2.find(a, 0, 0, target, b);
	}

}

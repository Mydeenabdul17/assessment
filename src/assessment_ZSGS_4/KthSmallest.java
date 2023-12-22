package assessment_ZSGS_4;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the position to find");
		int k = sc.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[k - 1]);
		sc.close();
	}
}

package assessment_ZSGS_4;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumGap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int max=0;
		for(int i=1;i<arr.length;i++) {
			max=Math.max(max,(arr[i]-arr[i-1]));
		}
		System.out.println(max);
		sc.close();
	}
}

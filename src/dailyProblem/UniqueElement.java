package dailyProblem;

import java.util.Scanner;

public class UniqueElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n = sc.nextInt();
		int [] nums = new int[n];
		System.out.println("Enter the elements");
		for(int i = 0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("The unique element is: " + findUniqueElement(nums));
	}
	public static int findUniqueElement(int[] arr) {
		if(arr.length==1) {
			return arr[0];
		}
		for (int i = 1; i < arr.length-1; i++) {
			if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
}

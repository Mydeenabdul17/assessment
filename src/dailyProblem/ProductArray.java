package dailyProblem;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n=sc.nextInt(),p=1;
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt();
			p*=nums[i];
		}
		for(int i=0;i<n;i++) {
			nums[i] = p/nums[i];
		}
		System.out.println(Arrays.toString(nums));
	}
}

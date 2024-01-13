package dailyProblem;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0 ;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		for(int i=0,j=nums.length;i<nums.length;i++) {
			if(nums[i]==0) {
				for(int k=i+1;k<j;k++) {
					int temp = nums[k-1];
					nums[k-1] = nums[k];
					nums[k] = temp;
				}
				j--;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}

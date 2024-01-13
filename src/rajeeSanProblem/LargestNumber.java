package rajeeSanProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestNumber {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		LargestNumber largestNumber = new LargestNumber();
		System.out.println("Enter the number of element in array");
		int n = largestNumber.sc.nextInt();
		int [] nums = new int[n];
		System.out.println("Enter the Numbers");
		for (int i = 0; i < nums.length; i++) {
			nums[i]=largestNumber.sc.nextInt();
		}
		List<String> l = new ArrayList<>();
		largestNumber.getPermutation(nums, 0, l);
		Long max=(long) Integer.MIN_VALUE;
		for (String string : l) {
			max = Math.max(max, Integer.parseInt(string));
		}
		System.out.println(max);
	}
	private void getPermutation(int[] nums, int index, List<String> l) {
		if(index==nums.length) {
			String s = "";
			for (int i = 0; i < nums.length; i++) {
				s+=nums[i];
			}
			l.add(s);
		}
		for(int i=index;i<nums.length;i++) {
			swap(nums,i,index);
			getPermutation(nums, index+1, l);
			swap(nums,i,index);
		}
	}

	private void swap(int[] nums, int i, int index) {
		int temp = nums[i];
		nums[i]=nums[index];
		nums[index]=temp;
	}
}

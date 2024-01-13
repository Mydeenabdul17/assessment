package dailyProblem;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n = sc.nextInt();
		int [] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("Enter the key");
		int k =sc.nextInt();
		System.out.println(new FindIndex().findIndex(nums, k));
	}
	public int findIndex(int[] nums,int k) {
		int i=0,j=nums.length-1;
		while(i<=j) {
			int mid = (i+j)/2;
			if(nums[mid]==k) {
				return mid;
			}
			if(nums[i]<=nums[mid]){
                if(k>=nums[i]&&k<nums[mid]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }else{
                if(k<=nums[j]&&k>nums[mid]){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
		}
		return -1;
	}
}

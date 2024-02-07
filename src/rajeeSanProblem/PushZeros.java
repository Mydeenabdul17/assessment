package rajeeSanProblem;

import java.util.Arrays;

public class PushZeros {

	public static void main(String[] args) {
//		int[] nums = {1,9,8,4,0,0,2,7,0,6,0};
		int[] nums = {1,0,1,0,1,0,1,0};
		new PushZeros().pushZeros(nums);
		System.out.println(Arrays.toString(nums));
	}

	private void pushZeros(int[] nums) {
		int i=0,j=nums.length-1;
		while(i<j) {
			if(nums[i]==0) {
				for(int k=i+1;k<=j;k++) {
					nums[k-1]=nums[k];
				}
				nums[j]=0;
				j--;
			}else {
				i++;
			}
		}
	}
}

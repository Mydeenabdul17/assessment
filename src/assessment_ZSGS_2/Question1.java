package assessment_ZSGS_2;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Question1 qn=new Question1();
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int []nums=new int[n];
		qn.addElement(nums);
		int [] res=qn.maxSubArray(nums);
		System.out.println(Arrays.toString(res));
	}
	
	//function to add numbers in array
	public void addElement(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.println("nums["+i+"]-");
			nums[i]=sc.nextInt();
		}
	}
	
//	function to find the max sum sub array
	public int[] maxSubArray(int[]nums) {
		int max=nums[0],start=0,end=0;
		for(int i=0;i<nums.length;i++) {
			int innerMax=0;
			for(int j=i;j<nums.length;j++) {
				innerMax+=nums[j];
				if(max<innerMax) {
					max=innerMax;
					start=i;
					end=j;
				}
			}
		}
		int[]res=new int[end-start+1];
		for(int i=start,j=0;i<=end;i++) {
			res[j++]=nums[i];
		}
		return res;
	}
}

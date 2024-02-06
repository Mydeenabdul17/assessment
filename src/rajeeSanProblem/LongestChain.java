package rajeeSanProblem;

import java.util.Arrays;
import java.util.Comparator;

public class LongestChain {

	public static void main(String[] args) {
		int[][] pairs = {{5,24},{39,60},{15,28},{27,40},{50,90}};
		 Arrays.sort(pairs,new Comparator<int[]>() {

			@Override
			public int compare(int[]a,int[] b) {
				return a[1]-b[1];
			}
		});
	        int len=0,pre=Integer.MIN_VALUE;
	        for(int[] arr:pairs){
	            if(pre<arr[0]){
	                len++;
	                pre=arr[1];
	            }
	        }
	        System.out.println(len);
	}
}

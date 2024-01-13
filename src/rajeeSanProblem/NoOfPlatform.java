package rajeeSanProblem;

import java.util.Scanner;

public class NoOfPlatform {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		NoOfPlatform noOfPlatform = new NoOfPlatform();
		System.out.println("Enter the number of timing");
		int n =noOfPlatform.sc.nextInt();
		noOfPlatform.sc.nextLine();
		String[] arr = new String[n];
		String[] dep = new String[n];
		System.out.println("Enter the arrival time of train in HH:MM format");
		for(int i=0;i<n;i++) {
			arr[i] = noOfPlatform.sc.next();
		}
		System.out.println("Enter the depature time of train in HH:MM format");
		for(int i=0;i<n;i++) {
			dep[i] = noOfPlatform.sc.next();
		}
		int[] arrtime = noOfPlatform.toMin(arr);
		int[] deptime = noOfPlatform.toMin(dep);
		int res = noOfPlatform.plaformNeeded(arrtime,deptime);
		System.out.println(res);
	}
	private int plaformNeeded(int[] arrtime, int[] deptime) {
		int max=0;
		for(int i = 0;i<arrtime.length;i++) {
			int platform =0;
			for(int j=0;j<arrtime.length;j++) {
				if(arrtime[j]>=arrtime[i]&&arrtime[j]<=deptime[i]) {
					platform++;
				}
			}
			max = Math.max(max, platform);
		}
		return max;
	}
	private int[] toMin(String[] arr) {
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=(Integer.parseInt(arr[i].substring(0,2))*60)+Integer.parseInt(arr[i].substring(3,5));
		}
		return res;
	}
}

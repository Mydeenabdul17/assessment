package assessment_ZSGS;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String input=sc.next();
		System.out.println("Enter the num of rows");
		int n=sc.nextInt();
		String[]res=new String[n];
		Arrays.fill(res, "");
		int letter=0;
		while(letter<input.length()) {
			for(int i=0;i<n;i++) {
				if(letter<input.length())
				res[i]+=input.charAt(letter++);
				else {
					res[i]+=" ";
				}
				if(i==0||i==n-1) {
					for(int j=0;j<n-2;j++) {
						res[i]+=" ";
					}
				}
			}
			for(int i=n-2;i>0;i--) {
				for(int j=1;j<n-1;j++) {
					if(i+j==n-1&&letter<input.length()) {
						res[i]+=input.charAt(letter++);
					}else {
						res[i]+=" ";
					}
				}
			}
		}
		for (String string : res) {
			System.out.println(string);
		}
	}

}

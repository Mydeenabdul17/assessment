package assessment_ZSGS;

import java.util.Scanner;

public class JumbledNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		boolean b=true;
		while(temp>=10) {
			int last=temp%10;
			temp/=10;
			if(Math.abs(last-temp%10)!=1) {
				b=false;
				break;
			}
		}
		if(b) {
			System.out.println(num+" is a jumbled number");
		}else {
			System.out.println(num+" is not a jumbled number");
		}
	}
}

package rajeeSanProblem;

import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the from date i dd-mm-yyyy");
		String d1 = sc.next();
		System.out.println("Enter the to date i dd-mm-yyyy");
		String d2 = sc.next();
		long days1=Integer.parseInt(d1.substring(0, 2));
		for(int i=0;i<Integer.parseInt(d1.substring(3, 5));i++) {
			days1+=days[i];
		}
		days1+=(Integer.parseInt(d1.substring(6))*365);
		int d1Year=Integer.parseInt(d1.substring(6));
		days1+=((d1Year/4)-(d1Year/100)+(d1Year/400));
		long days2=Integer.parseInt(d2.substring(0, 2));
		for(int i=0;i<Integer.parseInt(d2.substring(3, 5));i++) {
			days2+=days[i];
		}
		days2+=(Integer.parseInt(d2.substring(6))*365);
		int d2Year=Integer.parseInt(d2.substring(6));
		days2+=((d2Year/4)-(d2Year/100)+(d2Year/400));
		System.out.println(days2-days1);
	}
}

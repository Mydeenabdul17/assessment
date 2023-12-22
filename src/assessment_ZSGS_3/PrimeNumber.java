package assessment_ZSGS_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the start value");
		int start=sc.nextInt();
		System.out.println("Enter the end value");
		int end=sc.nextInt();
		System.out.println(new PrimeNumber().prime(start, end));
	}
	
	public List<Integer> prime(int start,int end){
		List<Integer> l=new ArrayList<>();
		for(int i=start;i<=end;i++) {
			if(i!=0&&i!=1&&isPrime(i)) {
				l.add(i);
			}
		}
		return l;
	}
	public boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}

package assessment_ZSGS_4;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seat number");
		int n = sc.nextInt();
		System.out.println(new Question16().seat(n));
	}

	private String seat(int n) {
		if(n%6==0||n%6==1) {
			return "WS";
		}else if(n%3==0||n%3==1) {
			return "AS";
		}else {
			return "MS";
		}
	}
}

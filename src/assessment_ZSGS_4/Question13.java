package assessment_ZSGS_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Question13 question13 = new Question13();
		if(question13.isPerfectSqure(n)) {
			System.out.println(n);
		}else {
			List<Integer> l = new ArrayList<>();
			question13.combination(String.valueOf(n),l,"");
			boolean b = true;
			for (Integer integer : l) {
				if(question13.isPerfectSqure(integer)) {
					System.out.println(integer);
					b = false;
					break;
				}
			}
			if(b) {
				System.out.println(-1);
			}
		}
	}

	private void combination(String string, List<Integer> l, String string2) {
		if (string.length() == 0) {
			return;
		}
		for (int i = 0; i < string.length(); i++) {
			string2 += string.charAt(i);
			l.add(Integer.parseInt(string2));
			combination(string.substring(i + 1), l, string2);
			string2 = string2.substring(0, string2.length() - 1);
		}
	}

	private boolean isPerfectSqure(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0&&i==n/i) {
				return true;
			}
		}
		return false;
	}
}

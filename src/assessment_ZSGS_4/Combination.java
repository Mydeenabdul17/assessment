package assessment_ZSGS_4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Combination {

	Set<String> set = new HashSet<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		Combination c = new Combination();
		c.set.add("");
		c.combination(s, "", 0);
		System.out.println(c.set);
		System.out.println(c.set.size());
		sc.close();
	}

	public void combination(String s, String k, int start) {
		for (int i = start; i < s.length(); i++) {
			k += s.charAt(i);
			set.add(k);
			combination(s, k, i + 1);
			k = k.substring(0, k.length() - 1);
		}
		return;
	}
}

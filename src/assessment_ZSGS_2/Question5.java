package assessment_ZSGS_2;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String s1 = sc.next();
		System.out.println("Enter the key String");
		String key = sc.next();
		System.out.println("Enter the matrix column value");
		int n = sc.nextInt();
		int[][] res = new int[2][2];
		if (!isContains(s1, key,n)) {
			System.out.println("the key is not there at String");
		} else {
			boolean b=true;
			for (int i = 0; i <= s1.length() - key.length(); i++) {
				String s = "";
				for (int j = i; j < i + key.length(); j++) {
					s += s1.charAt(j);
				}
				if (s.equals(key)) {
					b=false;
					res[0][0] = i / n;
					res[0][1] = (i % n) ;
					res[1][0] = (i + key.length() - 1) / n;
					res[1][1] = ((i + key.length() - 1) % n);
					break;
				}
			}
			if(b) {
				for (int i = 0; i <= s1.length() - key.length(); i++) {
					String s = "";
					for (int j = i; j <= i+(n*2); j+=n) {
						if(j<s1.length())
						s += s1.charAt(j);
					}
					if (s.equals(key)) {
						res[0][0] = i / n;
						res[0][1] = (i % n) ;
						res[1][0] = (i +(n*2)) / n;
						res[1][1] = ((i + (n*2)) % n);
						break;
					}
				}
			}

			System.out.println("starting index" + Arrays.toString(res[0]));
			System.out.println("ending index" + Arrays.toString(res[1]));

		}
	}

	
	//function to find whether the String contains the key string
	private static boolean isContains(String s1, String key,int n) {
		boolean b=true;
		for (int i = 0; i <= s1.length() - key.length(); i++) {
			String s = "";
			for (int j = i; j < i + key.length(); j++) {
				s += s1.charAt(j);
			}
			if (s.equals(key)) {
				return true;
				
			}
		}
		if(b) {
			for (int i = 0; i <= s1.length() - key.length(); i++) {
				String s = "";
				for (int j = i; j <= i+(n*2); j+=n) {
					if(j<s1.length())
					s += s1.charAt(j);
				}
				if (s.equals(key)) {
					return true;
				}
			}
		}
		return false;
	}

}

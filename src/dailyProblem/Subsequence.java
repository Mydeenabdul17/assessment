package dailyProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Subsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		Map<Character, List<String>> m = new HashMap<>();
//		List<String> l = new ArrayList<>();
//		boolean[] v = new boolean[s.length()];
		boolean b = true;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				String s1 = ""+s.charAt(i)+s.charAt(j);
//				if(l.contains(s1)&&v[i]) {
//					System.out.println("Repeated Subsequence Exists");
//					b=false;
//					break outer;
//				}
//				l.add(s1);
				if(m.containsKey(s.charAt(i))) {
					m.get(s.charAt(i)).add(s1);
				}else {
					m.put(s.charAt(i), new ArrayList());
					m.get(s.charAt(i)).add(s1);
				}
			}
//			v[i]=true;
		}
		if(b) {
			System.out.println(" Repeated Subsequence Doesn't Exist ");
		}
		
	}
}

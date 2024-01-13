package assessment_ZSGS_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		List<String> res = new ArrayList<>();
		new Question14().subSequence(s,res,"");
		System.out.println(res);
	}

	private void subSequence(String s, List<String> res,String s1) {
		if(s.length()==0) {
			return;
		}
		for(int i = 0;i<s.length();i++) {
			s1 += s.charAt(i);
			res.add(s1);
			subSequence(s.substring(i + 1), res, s1);
			s1 = s1.substring(0, s1.length() - 1);
		}
	}
}

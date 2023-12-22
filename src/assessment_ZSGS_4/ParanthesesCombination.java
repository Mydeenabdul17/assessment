package assessment_ZSGS_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ParanthesesCombination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of paranthesis");
		int n=sc.nextInt();
//		String s="";
//		for(int i=0;i<n;i++) {
//			s+="()";
//		}
		List<String> res=new ArrayList<>();
//		new ParanthesesCombination().permute(0, s.length(), res, s.toCharArray());
		new ParanthesesCombination().parantheses(res, new char[n*2], n, 0, 0, 0);
		for(String str:res) {
			System.out.println(str);
		}
		sc.close();
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////
	
	public void parantheses(List<String> res,char[] ch,int n,int open,int close,int index) {
		if(close==n) {
			String str=new String(ch);
			res.add(str);
			return;
		}
		if(open<n) {
			ch[index]='(';
			parantheses(res, ch, n, open+1, close, index+1);
		}
		if(close<open) {
			ch[index]=')';
			parantheses(res, ch, n, open, close+1, index+1);
		}
	}
	
 //////////////////////////////////////////////////////////////////////////
	public void permute(int start, int end, List<String> res, char[] chars) {
		if (start == end) {
			String temp = "";
			for (int i = 0; i < chars.length; i++) {
				temp+=chars[i];
			}
			if (!res.contains(temp) && isValid(temp)) {
				res.add(temp);
			}

			return;
		} else {
			for (int i = start; i < end; i++) {
				swap(i, start, chars);
				permute(start + 1, end, res, chars);
				swap(i, start, chars);
			}
		}
	}

	private boolean isValid(String temp) {
		if (temp.length() % 2 == 1) {
			return false;
		}
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == '(') {
				st.push(temp.charAt(i));
			} else if (temp.charAt(i) == ')') {
				if (st.size() == 0) {
					return false;
				}
				else if (st.pop() != '(') {
					return false;
				}
			}
		}
		if (st.size() != 0) {
			return false;
		}
		return true;
	}

	public void swap(int i, int j, char[] chars) {
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}
}

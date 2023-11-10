package assessment_ZSGS;

import java.util.Scanner;
import java.util.Stack;

public class ValidExpression {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the expession");
		String input=sc.next();
		boolean b=true;
		Stack<Character>s=new Stack<Character>();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='(') {
				s.push(input.charAt(i));
			}else if(input.charAt(i)==')'&&(!s.isEmpty())&&s.pop()!='(') {
				b=false;
				break;
			}else if(input.charAt(i)=='+'&&input.charAt(i)=='-'&&input.charAt(i)=='/'&&input.charAt(i)=='*'&&input.charAt(i)=='%') {
				if(i<input.length()&&i>0&&((Character.isLetter(input.charAt(i+1))&&Character.isLetter(input.charAt(i-1)))||(input.charAt(i+1)=='('&&input.charAt(i-1)==')'))) {
					b=true;
				}else {
					b=false;
					break;
				}
			}else if(i<input.length()-1&&Character.isLetter(input.charAt(i))&&Character.isLetter(input.charAt(i+1))) {
				b=false;
			}
		}
		if(b&&s.isEmpty()) {
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
	}

}

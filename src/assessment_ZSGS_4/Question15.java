package assessment_ZSGS_4;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression");
		String ex = sc.next();
		Question15 question15 = new Question15();
//		System.out.println(question15.result(ex));
		if(question15.isValidEx(ex)) {
			System.out.println(question15.result(ex));
		}else {
			System.out.println(-1);
		}
	}

	private int result(String ex) {
		int res = 0;
		String left="";
		char s= ' ';
		for(int i=0;i<ex.length();i++) {
			
			if(ex.charAt(i)=='+'||ex.charAt(i)=='-'||ex.charAt(i)=='*'||ex.charAt(i)=='/') {
				int l=Integer.parseInt(left);
				if(s!=' ') {
					if(s=='+') {
						res+=l;
					}else if(s=='-') {
						res-=l;
					}else if(s=='*') {
						res*=l;
					}else if(s=='/') {
						res/=l;
					}
				}else {
					res+=l;
				}
				s=ex.charAt(i);
				left="";
				continue;
			}
			left+=ex.charAt(i);
		}
		int l=Integer.parseInt(left);
		if(s=='+') {
			res+=l;
		}else if(s=='-') {
			res-=l;
		}else if(s=='*') {
			res*=l;
		}else if(s=='/') {
			res/=l;
		}
		return res;
	}

	private boolean isValidEx(String ex) {
		for(int i=0;i<ex.length();i++) {
			if((i==0||i==ex.length()-1)&&(ex.charAt(i)=='+'||ex.charAt(i)=='-'||ex.charAt(i)=='*'||ex.charAt(i)=='/')) {
				return false;
			}
			if((ex.charAt(i)=='+'||ex.charAt(i)=='-'||ex.charAt(i)=='*'||ex.charAt(i)=='/')&&((!Character.isDigit(ex.charAt(i-1)))||(!Character.isDigit(ex.charAt(i+1))))) {
				return false;
			}
		}
		return true;
	}
}

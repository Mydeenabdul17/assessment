package assessment_ZSGS_4;

import java.util.Scanner;

public class PyramidString {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PyramidString pyramidString=new PyramidString();
		System.out.println("Enter the String");
		String s=pyramidString.sc.next();
		String left="",right="";
		boolean b=true;
		for (int i = 0; i < s.length(); i++) {
			if(i>0&&Character.isUpperCase(s.charAt(i))){
				b=false;
			}
			if(b) {
				left+=s.charAt(i);
			}else {
				right+=s.charAt(i);
			}
		}
		int count=Math.max(left.length(), right.length());
		for(int i=0;i<count;i++) {
			System.out.println(pyramidString.value(left, right, i));
		}
	}
	public String value(String left,String right,int t) {
		String resLeft="",resRight="";
		if(t<left.length()) {
			resLeft+=left.substring(0,t+1);
		}else {
			resLeft=left;
		}
		if(t<right.length()) {
			resRight+=right.substring(0,t+1);
		}else {
			resRight=right;
		}
		resLeft=resLeft.toUpperCase();
		resRight=resRight.toUpperCase();
		return resLeft+resRight;
	}
}

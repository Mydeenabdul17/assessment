package assessment_ZSGS_2;

import java.util.Scanner;

public class Question4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Question4 qn=new Question4();
		System.out.println("Enter the String-1");
		String s1=sc.next();
		System.out.println("Enter the String-2");
		String s2=sc.next();
		s1=qn.toLowerCase(s1);
		s2=qn.toLowerCase(s2);
		System.out.println(qn.canForm(s1,s2));
	}
	
	//function to convert String to lowercase
	public String toLowerCase(String s1) {
		String res="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>=65&&s1.charAt(i)<=90) {
				res+=(char)(s1.charAt(i)+32);
			}else {
				res+=s1.charAt(i);
			}
		}
		return res;
	}
	
	//function that check whether the key string can form 
	public boolean canForm(String s1,String s2){
        char[]ch=s1.toCharArray();
        for(int i=0;i<s2.length();i++){
            boolean b=false;
            for(int j=0;j<ch.length;j++){
                if(s2.charAt(i)==ch[j]){
                    ch[j]=' ';
                    b=true;
                    break;
                }
            }
            if(!b){
                return b;
            }
        }
        return true;
    }
}

package assessment_ZSGS;
import java.util.Arrays;
import java.util.Scanner;

public class Lexicography {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of String");
		int n=sc.nextInt();
		sc.nextLine();
		String[]res=new String[n];
		for (int i = 0; i < res.length; i++) {
			System.out.println("Enter the String"+(i+1));
			res[i]=sc.next();
		}
		for (int i = 0; i < res.length; i++) {
			char []ch=res[i].toCharArray();
			Arrays.sort(ch);
			res[i]="";
			for (int j = ch.length-1; j >=0; j--) {
				res[i]+=ch[j];
			}
			System.out.println("String"+(i+1)+" : "+res[i]);
		}
	}
}

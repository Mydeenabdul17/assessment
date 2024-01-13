package dailyProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		char[] ch = s.toCharArray();
		List<String> l = new ArrayList<>();
		new Permutation().getPermutation(ch,0,l);
		Collections.sort(l);
		System.out.println(l);
	}

	private void getPermutation(char[] ch, int index, List<String> l) {
		if(index==ch.length) {
			l.add(new String(ch));
		}
		for(int i=index;i<ch.length;i++) {
			swap(ch,i,index);
			getPermutation(ch, index+1, l);
			swap(ch,i,index);
		}
	}

	private void swap(char[] ch, int i, int index) {
		char temp = ch[i];
		ch[i]=ch[index];
		ch[index]=temp;
	}
}

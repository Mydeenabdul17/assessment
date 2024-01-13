package dailyProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Dictionary2D {

	public static void main(String[] args) {
		String[] words = new String[] {"van","zoho","love","are","is"};
		List<String> l= new ArrayList<>(),res = new ArrayList<>();
		for (String string : words) {
			l.add(string);
		}
		char[][] letters = new char[][] {{'a','z','o','l'},{'n','x','h','o'},{'v','y','i','v'},{'o','r','s','e'}};
		for(int i=0;i<letters.length;i++) {
			for(int j=0;j<letters[i].length;j++) {
				Queue<String[]> q = new LinkedList<String[]>();
				q.offer(new String[] {"0","0",""+letters[i][j]});
				while(q.size()!=0) {
					String[] ar = q.poll();
					int k=Integer.parseInt(ar[0]),n=Integer.parseInt(ar[1]);
					String temp = ar[2];
//					System.out.println(temp);
					if(l.contains(temp)) {
						res.add(temp);
					}
					if(k<letters.length-1&&n<letters[i].length) {
						q.offer(new String[] {""+(k+1),""+n,temp+letters[k+1][n]});
					}
					if(n<letters[i].length-1&&k<letters.length) {
						q.offer(new String[] {""+k,""+(n+1),temp+letters[k][n+1]});
					}
//					k++;n++;
				}
			}
		}
		System.out.println(res);
	}
}

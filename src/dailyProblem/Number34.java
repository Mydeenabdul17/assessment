package dailyProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Number34 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		List<String> res = new ArrayList<>();
 		q.offer("3");
		q.offer("4");
		while(q.size()!=0) {
			String s = q.poll();
			res.add(s);
			if(s.length()<4) {
				q.offer(s+"3");
				q.offer(s+"4");
			}
		}
		System.out.println(res);
	}
}

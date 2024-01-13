package assessment_ZSGS_4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		ListIterator it = l.listIterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println(it.hasPrevious());
	}
}

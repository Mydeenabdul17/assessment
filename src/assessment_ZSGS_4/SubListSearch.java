package assessment_ZSGS_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubListSearch {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SubListSearch sub = new SubListSearch();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		System.out.println("Enter the number of element in list1");
		int n = sub.sc.nextInt();
		System.out.println("Enter the number of element in list2");
		int m = sub.sc.nextInt();
		sub.addElement(list1, n);
		sub.addElement(list2, m);
		System.out.println(sub.isSubList(list1, list2));
	}

	private boolean isSubList(List<Integer> list1, List<Integer> list2) {
		for(int i=0;i<=list1.size()-list2.size();i++) {
			if(list1.subList(i, i+list2.size()).equals(list2)) {
				return true;
			}
		}
		return false;
	}

	private void addElement(List<Integer> list, int n) {
		System.out.println("Enter the elements for list");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
	}
}

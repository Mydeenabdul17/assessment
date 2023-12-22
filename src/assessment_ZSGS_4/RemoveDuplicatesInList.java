package assessment_ZSGS_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesInList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		System.out.println("Enter the number of element in list");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}
		new RemoveDuplicatesInList().removeDuplicate(l);
		System.out.println(l);
		sc.close();
	}
	
	public void removeDuplicate(List<Integer> l) {
		for(int i=0;i<l.size();i++) {
			for(int j=i+1;j<l.size();j++) {
				if(l.get(i)==l.get(j)) {
					l.remove(j);
					j--;
				}
			}
		}
	}
}

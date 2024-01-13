package assessment_ZSGS_4;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int l = sc.nextInt();
		System.out.println("Enter the Width of rectanglt");
		int w = sc.nextInt();
		int res = new Question12().findNoOfSquare(l, w);
		System.out.println(res);
	}

	private int findNoOfSquare(int l, int w) {
		if (l > 0 && w > 0) {
			if (l == w) {
				return 1;
			} else {
				int templ,tempw;
				if (l < w) {
					templ = l;
					tempw = w;
				} else {
					templ = w;
					tempw = l;
				}
				while (templ > 0) {
					if (tempw % templ == 0) {
						return (l / templ) * (w / templ);
					}
					templ /= 2;
				}
			}
		}
		return 0;
	}
}

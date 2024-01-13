package dailyProblem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeriveEquation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Num1: ");
		int num1 = scanner.nextInt();
		System.out.print("Num2: ");
		int num2 = scanner.nextInt();
		System.out.print("Num3: ");
		int num3 = scanner.nextInt();
		System.out.print("Num4: ");
		int num4 = scanner.nextInt();

		System.out.print("Result: ");
		int result = scanner.nextInt();

		Set<String> s = new HashSet<>();
		DeriveEquation d = new DeriveEquation();

		d.getPermutation(new String("" + num1 + num2 + num3 + num4).toCharArray(), 0, s);

		boolean found = false;
		outer: for (String string : s) {
			for (char op1 : "+-*/".toCharArray()) {
				for (char op2 : "+-*/".toCharArray()) {
					for (char op3 : "+-*/".toCharArray()) {
						int n1 = Integer.parseInt(string.substring(0, 1));
						int n2 = Integer.parseInt(string.substring(1, 2));
						int n3 = Integer.parseInt(string.substring(2, 3));
						int n4 = Integer.parseInt(string.substring(3, 4));
						int res = d.findResult(n1, n2, n3, n4, op1, op2, op3);
						if (res == result) {
							found = true;
							System.out.println(
									n1 + "" + op1 + "" + n2 + "" + op2 + "" + n3 + "" + op3 + "" + n4 + "=" + result);
						}
						if (found) {
							break outer;
						}
					}
				}
			}
			for (char op1 : "+-*/".toCharArray()) {
				for (char op2 : "+-*/".toCharArray()) {
					int n1 = Integer.parseInt(string.substring(0,1));
					int n2 = Integer.parseInt(string.substring(1,2));
					int n3 = Integer.parseInt(string.substring(2));
					int res = d.findResult(n1, n2, n3, op1, op2);
					if (res == result) {
						found = true;
						System.out.println(
								n1 + "" + op1 + "" + n2 + "" + op2 + "" + n3 + "" + "=" + result);
					}
					if (found) {
						break outer;
					}
					n1 = Integer.parseInt(string.substring(0,1));
					n2 = Integer.parseInt(string.substring(1,3));
					n3 = Integer.parseInt(string.substring(3));
					res = d.findResult(n1, n2, n3, op1, op2);
					if (res == result) {
						found = true;
						System.out.println(
								n1 + "" + op1 + "" + n2 + "" + op2 + "" + n3 + "" + "=" + result);
					}
					if (found) {
						break outer;
					}
					n1 = Integer.parseInt(string.substring(0,2));
					n2 = Integer.parseInt(string.substring(2,3));
					n3 = Integer.parseInt(string.substring(3));
					res = d.findResult(n1, n2, n3, op1, op2);
					if (res == result) {
						found = true;
						System.out.println(
								n1 + "" + op1 + "" + n2 + "" + op2 + "" + n3 + "" + "=" + result);
					}
					if (found) {
						break outer;
					}
				}
			}
			for (char op1 : "+-*/".toCharArray()) {
				for(int i=1;i<4;i++) {
					int n1 = Integer.parseInt(string.substring(0,i));
					int n2 = Integer.parseInt(string.substring(i));
					int res = d.findResult(n1, n2, op1);
					if (res == result) {
						found = true;
						System.out.println(
								n1 + "" + op1 + "" + n2 + "" + "" + "=" + result);
					}
					if (found) {
						break outer;
					}
				}
			}
		}
		if(!found) {
			System.out.println("No equation found!");
		}
	}

	private void getPermutation(char[] ch, int index, Set<String> s) {
		if (index == ch.length) {
			s.add(new String(ch));
		}
		for (int i = index; i < ch.length; i++) {
			swap(ch, i, index);
			getPermutation(ch, index + 1, s);
			swap(ch, i, index);
		}
	}

	private void swap(char[] ch, int i, int index) {
		char temp = ch[i];
		ch[i] = ch[index];
		ch[index] = temp;
	}

	public int findResult(int num1, int num2, int num3, int num4, char op1, char op2, char op3) {
		int res = num1;
		res = sum(res, num2, op1);
		res = sum(res, num3, op2);
		res = sum(res, num4, op3);
		return res;
	}

	public int findResult(int num1, int num2, int num3, char op1, char op2) {
		int res = num1;
		res = sum(res, num2, op1);
		res = sum(res, num3, op2);
		return res;
	}

	public int findResult(int num1, int num2, char op1) {
		int res = num1;
		res = sum(res, num2, op1);
		return res;
	}

	public int sum(int num1, int num2, char op) {
		switch (op) {
		case '+': {
			return num1 + num2;
		}
		case '-': {
			return num1 - num2;
		}
		case '*': {
			return num1 * num2;
		}
		case '/': {
			return num1 / num2;
		}
		default:
			return 0;
		}
	}
}

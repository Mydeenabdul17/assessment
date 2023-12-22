package assessment_ZSGS_4;

import java.util.Scanner;
import java.util.Stack;

public class PostFixExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression");
		String expression = sc.next();
		System.out.println(new PostFixExpression().output(expression));
		sc.close();
	}

	private int output(String expression) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			if (Character.isDigit(expression.charAt(i))) {
				s.push(expression.charAt(i) - '0');
			} else {
				int num1 = s.pop();
				int num2 = s.pop();
				if (expression.charAt(i) == '+') {
					s.push(num2 + num1);
				} else if (expression.charAt(i) == '-') {
					s.push(num2 - num1);
				} else if (expression.charAt(i) == '*') {
					s.push(num2 * num1);
				} else if (expression.charAt(i) == '/') {
					s.push(num2 / num1);
				}
			}
		}
		return s.pop();
	}
}

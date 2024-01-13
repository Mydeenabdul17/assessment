package dailyProblem;

import java.util.Scanner;

public class GreatestNode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes");
		int n = sc.nextInt();
		Node head,tail;
		head = new Node(sc.nextInt());
		tail = head;
		for(int i = 1;i<n;i++) {
			Node current = new Node(sc.nextInt());
			tail.next = current;
			current.previous = tail;
			tail = current;
			
		}
		Node temp = head;
		int max = tail.val;
		while(tail!=null) {
			if(tail.val == max) {
				tail.val=0;
			}else if(tail.val < max) {
				tail.val = max;
			}else {
				max = tail.val;
				tail.val = 0;
			}
			tail = tail.previous;
		}
		while(head!=null) {
			System.out.print(head.val+" ");
			head = head.next;
		}
	}
	static class Node {
		int val ;
		Node next,previous ;
		Node(){
			
		}
		Node(int val){
			this.val = val;
		}
		Node(int val,Node next,Node previous){
			this.val = val;
			this.next = next;
			this.previous = previous;
		}
	}
}

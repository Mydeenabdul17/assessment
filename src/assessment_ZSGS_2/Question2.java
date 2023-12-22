package assessment_ZSGS_2;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Question2 qn=new Question2();
		System.out.println("Enter the matrix value");
		int n=sc.nextInt();
		int [][]matrix=new int[n][n];
		qn.addElement(matrix);
		qn.transpose(matrix);
		for(int[]i:matrix) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	//function to upload numbers in matrix
	public void addElement(int [][]matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.println("matrix["+i+"]["+j+"]=");
				matrix[i][j]=sc.nextInt();
			}
		}
	}
	
	//function to transpose
	public void transpose(int[][]matrix) {
		int i=0;
		while(i!=matrix.length-1) {
			for(int k=i+1;k<matrix.length;k++) {
				int temp=matrix[i][k];
				matrix[i][k]=matrix[k][i];
				matrix[k][i]=temp;
			}
			i++;
		}
	}
}

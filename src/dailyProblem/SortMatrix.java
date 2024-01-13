package dailyProblem;

import java.util.Scanner;

public class SortMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix length");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter values for row "+(i+1));
			for(int j=0;j<n;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}
	public void horizontal(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				boolean b=true;
				for(int k=1;k<matrix.length;k++) {
					if(matrix[i][k]<matrix[i][k-1]) {
						int temp=matrix[i][k];
						matrix[i][k]=matrix[i][k-1];
						matrix[i][k-1]=temp;
						b=false;
					}
				}
				if(b)
					break;
			}
		}
	}
	public void vertical(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				boolean b=true;
				for(int k=1;k<matrix.length;k++) {
					if(matrix[k][i]<matrix[k-1][i]) {
						int temp=matrix[k][i];
						matrix[k][i]=matrix[k-1][i];
						matrix[k-1][i]=temp;
						b=false;
					}
				}
				if(b)
					break;
			}
		}
	}
	public void diagonal(int[][] matrix) {
	}
}

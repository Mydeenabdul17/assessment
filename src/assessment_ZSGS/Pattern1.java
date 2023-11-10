package assessment_ZSGS;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt(),cross=0;
		String [][]res=new String[n][n];
		int rowStart=0,rowEnd=n-1,colStart=0,colEnd=n-1,num=1;
		while (num<=(((n*n)-n)/2)+n) {
			for(int i=rowStart;i<=rowEnd;i++) {
				for(int j=colStart;j<=colEnd;j++) {
					if(i==j-cross) {
						res[i][j]=""+num++;
					}
				}
			}
			cross++;
			colStart=colStart==0?colStart+1:colStart+2;
			rowEnd=rowEnd==n-1?rowEnd-1:rowEnd-2;
			if(num<=(((n*n)-n)/2)+n) {
				for(int i=rowEnd;i>=rowStart;i--) {
					res[i][colEnd]=""+num++;
				}
				colEnd--;
			}
			if(num<=(((n*n)-n)/2)+n) {
				for(int i=colEnd;i>=colStart;i--) {
					res[rowStart][i]=""+num++;
				}
				rowStart++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(res[i][j]!=null) {
					if(res[i][j].length()>1)
					System.out.print(res[i][j]);
					else
						System.out.print(" "+res[i][j]);
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}

package assessment_ZSGS_3;

import java.util.Arrays;

public class MatrixRotation {

	public static void main(String[] args) {
		int[][] mat = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] res = new MatrixRotation().rotateMatrix(mat);
		for(int[] arr:res) {
			System.out.println(Arrays.toString(arr));
		}
	}
	public int[][] rotateMatrix(int[][] matrix){
		int [][] res=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                res[j][i]=matrix[i][j];
            }
        }
        for(int[] arr:res) {
        	int i=0,j=arr.length-1;
        	while(i<j) {
        		int temp=arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        		i++;j--;
        	}
        }
        return res;
	}
}

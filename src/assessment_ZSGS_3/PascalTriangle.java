package assessment_ZSGS_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the value");
		int n=sc.nextInt();
		List<List<Integer>> res=new PascalTriangle().Pascal(n);
		for(List<Integer> l:res) {
			for(int i=0;i<n;i++) {
					System.out.print("  ");
			}
			n--;
			for(int i:l) {
				for(int j=0;j<4-String.valueOf(i).length();j++) {
					System.out.print(" ");
				}
				System.out.print(i);
				
			}
			System.out.println();
			
		}
	}
	public List<List<Integer>> Pascal(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer>l1=new ArrayList<Integer>();
        for(int i=0;i<numRows;i++){
            List<Integer>l2=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    l2.add(1);
                }else{
                    l2.add(l1.get(j-1)+l1.get(j));
                }
            }
            res.add(l2);
            l1.clear();
            for(Integer in:l2){
                l1.add(in);
            }
        }
        return res;
    }
}

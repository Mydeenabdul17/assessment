package rajeeSanProblem;

import java.util.ArrayList;
import java.util.List;

public class DiagonalArray {

	public static void main(String[] args) {
		int[][]nums= {{1,2,3},{4,5,6},{7,8,9}};
		List<List<Integer>> res = new ArrayList<>();
		new DiagonalArray().findDiagonalList(nums, res);
		System.out.println(res);
	}
	public void findDiagonalList(int[][] nums, List<List<Integer>> res) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i + j >= res.size()) {
					List<Integer> l = new ArrayList<>();
					l.add(nums[i][j]);
					res.add(l);
				} else {
					res.get(i + j).add(nums[i][j]);
				}
			}
		}
	}
}

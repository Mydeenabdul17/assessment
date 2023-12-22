package assessment_ZSGS_3;

import java.util.Arrays;
import java.util.Scanner;

public class SudokuSolver {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		int[][] sudoku = { { 5, 3, 4, 0, 7, 8, 9, 0, 0 }, { 6, 7, 0, 1, 9, 5, 0, 0, 8 }, { 0, 9, 8, 0, 0, 0, 0, 6, 7 },
//				{ 8, 0, 9, 7, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 7, 9, 1 }, { 7, 0, 0, 9, 2, 0, 8, 0, 6 },
//				{ 9, 6, 0, 0, 0, 7, 2, 8, 0 }, { 0, 8, 7, 4, 1, 9, 6, 0, 5 }, { 0, 0, 5, 0, 8, 6, 0, 7, 9 } };
		int[][] sudoku = new int[9][9];
		SudokuSolver s = new SudokuSolver();
		s.addValue(sudoku);
		if (s.isValidSudoku(sudoku)) {
			for (int[] i : sudoku) {
				System.out.println(Arrays.toString(i));
			}
			System.out.println("\n********************************************************************\n");
			s.sudokuSolver(sudoku);
			for (int[] i : sudoku) {
				System.out.println(Arrays.toString(i));
			}
		} else {
			System.out.println("Invalid Sudoku");
		}

	}

	private void addValue(int[][] sudoku) {
		for (int i = 0; i < 9; i++) {
			System.out.println("Enter the values of " + (i + 1) + "st line for sudoku as string");
			String s = sc.next();
			for (int j = 8; j >= 0; j--) {
				sudoku[i][j] = s.charAt(j) - '0';
			}
		}
	}

	public boolean sudokuSolver(int[][] sudoku) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (sudoku[i][j] == 0) {
//					System.out.println(i+" -> "+j);
					for (int k = 1; k <= 9; k++) {
						if (isValid(sudoku, i, j, k)) {
							sudoku[i][j] = k;
							if (i == 8 && j == 8)
								return true;
							if (sudokuSolver(sudoku)) {
								return true;
							} else {
								sudoku[i][j] = 0;
							}
						} else if (k == 9)
							return false;
					}
				} else if (i == 8 && j == 8) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isValidSudoku(int[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(board[i][j]!=0) {
					for (int k = i + 1; k < 9; k++) {
						if (board[i][j] == board[k][j]) {
							return false;
						}
					}
					for (int l = j + 1; l < 9; l++) {
						if (board[i][j] == board[i][l]) {
							return false;
						}
					}
					for (int k = (3 * (i / 3)); k < 3 * ((i / 3) + 1); k++) {
						for (int l = (3 * (j / 3)); l < 3 * ((j / 3) + 1); l++) {
							if (k == i || l == j) {
								continue;
							} else if (board[i][j] == board[k][l]) {
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}

	public boolean isValid(int[][] sudoku, int i, int j, int n) {
		for (int k = 0; k < sudoku.length; k++) {
			if (k == i) {
				continue;
			} else {
				if (sudoku[k][j] == n) {
					return false;
				}
			}
		}
		for (int k = 0; k < sudoku[i].length; k++) {
			if (k == j) {
				continue;
			} else {
				if (sudoku[i][k] == n) {
					return false;
				}
			}
		}
		for (int k = (3 * (i / 3)); k < 3 * ((i / 3) + 1); k++) {
			for (int l = (3 * (j / 3)); l < 3 * ((j / 3) + 1); l++) {
				if (k == i || l == j) {
					continue;
				} else if (sudoku[k][l] == n) {
					return false;
				}
			}
		}
		return true;
	}
}

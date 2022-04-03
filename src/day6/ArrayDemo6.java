package day6;

public class ArrayDemo6 {

	public static void main(String[] args) {
		int[][] ar = { { 4, 5, 6 }, { 7, 8, 9 }, { 1, 3, 4 } };

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}

}

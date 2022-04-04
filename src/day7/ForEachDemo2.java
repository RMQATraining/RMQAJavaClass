package day7;

public class ForEachDemo2 {

	public static void main(String[] args) {
		int[][] numList = { { 4, 5, 6 }, { 7, 8, 9 }, { 2, 3, 4 } };
		for (int i = 0; i < numList.length; i++) {
			for (int j = 0; j < numList.length; j++) {
				System.out.print(numList[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=========");
		for (int[] nums : numList) {
			for (int n : nums) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}

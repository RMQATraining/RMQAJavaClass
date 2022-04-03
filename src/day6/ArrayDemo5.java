package day6;

import java.util.Scanner;

public class ArrayDemo5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] ar = new int[3][3];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.println("Enter element: ");
				ar[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		input.close();

	}

}

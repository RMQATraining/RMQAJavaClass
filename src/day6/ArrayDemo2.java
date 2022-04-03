package day6;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println(arr.length);
		// this loop is used to input the data inside an array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element: ");
			arr[i] = input.nextInt();
		}

		// this loop is used to print(traverse) the elements of an array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		input.close();

	}

}

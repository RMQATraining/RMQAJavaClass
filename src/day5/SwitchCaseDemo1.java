package day5;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice = input.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Today is Sunday.");
			break;
		case 2:
			System.out.println("Today is Monday.");
			break;
		case 3:
			System.out.println("Today is Tuesday.");
			break;
		case 4:
			System.out.println("Today is Wednesday.");
			break;
		case 5:
			System.out.println("Today is Thursday.");
			break;
		case 6:
			System.out.println("Today is Friday.");
			break;
		case 7:
			System.out.println("Today is Saturday.");
			break;
		default:
			System.out.println("wrong choice!!!");
			break;
		}
		System.out.println("terminated");
	}

}

package day5;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter operator: ");
		String choice = input.next();

		System.out.println("Enter number1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b = input.nextInt();

		switch (choice) {

		case "add":
			int sum = a + b;
			System.out.println("Sum is: " + sum);
			break;
		case "sub":
			int sub = a - b;
			System.out.println("Subtraction is: " + sub);
			break;
		case "mul":
			int mul = a * b;
			System.out.println("Multiplication is: " + mul);
			break;
		case "div":
			int div = a / b;
			System.out.println("Division is: " + div);
			break;
		default:
			System.out.println("wrong operator selection.");
			break;
		}
		System.out.println("terminated");

	}
}

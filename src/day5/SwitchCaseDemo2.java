package day5;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter operator: ");
		char operator = input.next().charAt(0);

		System.out.println("Enter number1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b = input.nextInt();

		switch (operator) {

		case '+':
			int sum = a + b;
			System.out.println("Sum is: " + sum);
			break;
		case '-':
			int sub = a - b;
			System.out.println("Subtraction is: " + sub);
			break;
		case '*':
			int mul = a * b;
			System.out.println("Multiplication is: " + mul);
			break;
		case '/':
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

package day8;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		try {
			System.out.println("insdide try start");
			int div = divide(a, b);
			System.out.println("Division is: " + div);
			System.out.println("inside try end");
		} catch (ArithmeticException ae) {
			System.out.println("inside catch block");
		} finally {
			System.out.println("inside finally block");
			input.close();
		}

		System.out.println("end");

	}

	public static int divide(int a, int b) {
		int div = a / b;
		return div;
	}

}

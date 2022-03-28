package day4;

import java.util.Scanner;

//write a program to find the area of triangle.
public class Question10b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		System.out.println("Enter c: ");
		double c = input.nextDouble();

		double s = (a + b + c) / 2;

		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area is: " + area);
		
		input.close();
	}

}

package day7;

import java.util.Scanner;

//Runtime polymorphism(dynamic binding)
//overriding of method
public class PolymorphismTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Animal animal = null;
		System.out.println("Enter choice: ");
		String ch = input.next();
		switch (ch) {
		case "dog":
			animal = new Dog();
			break;
		case "tiger":
			animal = new Tiger();
			break;
		default:
			System.out.println("wrong choice...");
			break;
		}

		if (animal != null) {
			animal.makeSound();
		}

	}

}

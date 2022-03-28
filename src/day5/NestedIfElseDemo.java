package day5;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a = 15;
		int b = 6;
		int c = 17;
		if (a > b) {
			if (a > c) {
				System.out.println("a is greatest one.");
			} else {
				System.out.println("c is greatest one.");
			}

		} else {
			System.out.println("a is smaller than b.");
		}

	}

}

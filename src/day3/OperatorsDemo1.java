package day3;

public class OperatorsDemo1 {

	public static void main(String[] args) {
		// 1. Arithmetic Operators: + - / %(modulus) *
		// precedence: + -(low) / % * (high)
		// Associativity: Left to Right

		int a = 4 + 5 - 7 / 3 - 7 % 3 + 2 * 3;
		a = 4 + 5 - 2 - 7 % 3 + 2 * 3;
		a = 4 + 5 - 2 - 1 + 2 * 3;
		a = 4 + 5 - 2 - 1 + 6;
		a = 9 - 2 - 1 + 6;
		a = 7 - 1 + 6;
		a = 6 + 6;
		a = 12;
		System.out.println(a);

	}

}

package day3;

public class OperatorsDemo5 {

	public static void main(String[] args) {
		// Logical Operators: &&(and) ||(or) !(not)

		int a = 4;
		int b = 5;
		int c = 3;
		System.out.println((a < b) && (a > c));// true
		System.out.println(true && true);
		System.out.println((a < b) && (a < c));// false
		System.out.println(true && false);
		System.out.println((a > b) && (a > c));// false
		System.out.println(false && true);
		System.out.println((a > b) && (a < c));//false
		System.out.println(false && false);
		
		System.out.println("===================");
		System.out.println((a < b) || (a > c));// true
		System.out.println(true || true);
		System.out.println((a < b) || (a < c));// true
		System.out.println(true || false);
		System.out.println((a > b) || (a > c));// true
		System.out.println(false || true);
		System.out.println((a > b) || (a < c));//false
		System.out.println(false || false);
		
		System.out.println("*******************");
		System.out.println(!(a < b));
		System.out.println(!(a < c));
		System.out.println(!true);
		System.out.println(!false);
	}

}

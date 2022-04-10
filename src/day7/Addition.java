package day7;

//compile time polymorphism(static binding)
//overloading of method
public class Addition {

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("1. Sum is: " + sum);
	}

	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("2. Sum is: " + sum);
	}

	public void add(double a, double b, double c) {
		double sum = a + b + c;
		System.out.println("3. Sum is: " + sum);
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(4, 5);
		addition.add(4, 5, 6);
		addition.add(4.1, 5.2, 6.3);
		System.out.println("ram".toUpperCase());
	}
}

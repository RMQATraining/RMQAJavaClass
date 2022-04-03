package day6;

public class StaticDemo {

	// static variable
	static String name = "ram";
	static int age = 22;

	// static method
	public static void sayHi() {
		System.out.println("Hi, good morning.");
	}

	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(age);
		sayHi();

		// recommended way
		System.out.println(StaticDemo.name);
		System.out.println(StaticDemo.age);
		StaticDemo.sayHi();
	}

}

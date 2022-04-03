package day6;

public class MethodDemo1 {

	// 1. <access modifier> void <method name> (zero parameter){}
	public void sayHello() {
		System.out.println("Hello, good Morning");
	}

	// 2. <access modifier> void <method name> (any type and any number of
	// parameters){}
	public void displayInfo(String name, int age) {
		System.out.println("name is: " + name);
		System.out.println("age is: " + age);
	}

	// 3. <access modifier> return type <method name> (zero parameter){}
	public String greet() {
		String message = "Hello, Good Evening";
		return message;
	}

	// 4. <access modifier> return type <method name> (any type and any number of
	// parameters){}
	public int findMax(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}

	public static void main(String[] args) {
		MethodDemo1 obj = new MethodDemo1();
		obj.sayHello();

		String name = "raju";
		int age = 33;
		obj.displayInfo(name, age);

		String msg = obj.greet();
		System.out.println(msg);

		int a = 5;
		int b = 6;
		int max = obj.findMax(a, b);
		System.out.println("max numbr is: " + max);

	}

}

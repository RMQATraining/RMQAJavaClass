package day7;

public class Student {

	// non-static(instance) variable
	String name = "Raju";
	// static variable
	static int age = 22;

	// non-static method
	public void sayHello() {
		System.out.println("Helllooooo");
	}

	// static method
	public static void sayHi() {
		System.out.println("Hiiiii");
	}

	// this is constructor
	public Student() {
		System.out.println("this is a constructor");
	}

	// main
	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.sayHello();
		obj1.sayHello();
		obj1.sayHello();
		System.out.println("=======");
		Student obj2 = new Student();
		obj2.sayHello();
		obj2.sayHello();
		obj2.sayHello();

	}

}

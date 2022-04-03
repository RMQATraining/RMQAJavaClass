package day6;

public class NonStaticDemo {

	// non-static(instance)variable
	String userName = "ram";
	int userAge = 22;

	// non-static method
	public void sayHello() {
		System.out.println("Hello, good evening.");
	}

	public static void main(String[] args) {
		NonStaticDemo ob = new NonStaticDemo();
		System.out.println(ob.userName);
		System.out.println(ob.userAge);
		ob.sayHello();
	}

}

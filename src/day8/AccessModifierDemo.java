package day8;

public class AccessModifierDemo {

	// variable
	public String publicVar = "this is public variable";
	private String privateVar = "this is private variable";
	protected String protectedVar = "this is protected variable";
	String defaultVar = "this is default variable";

	// methods
	public void publicMethod() {
		System.out.println("this is public method.");
	}

	private void privateMethod() {
		System.out.println("this is private method.");
	}

	protected void protectedMethod() {
		System.out.println("this is protected method.");
	}

	void defaultMethod() {
		System.out.println("this is default method.");
	}

	// constructor
	public AccessModifierDemo() {
		System.out.println("this is public constructor");
	}

	private AccessModifierDemo(int a) {
		System.out.println("this is private constructor");
	}

	protected AccessModifierDemo(int a, int b) {
		System.out.println("this is protected constructor");
	}

	AccessModifierDemo(double a) {
		System.out.println("this is default constructor");
	}

	public static void main(String[] args) {
		AccessModifierDemo obj = new AccessModifierDemo(5);
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
	}
}

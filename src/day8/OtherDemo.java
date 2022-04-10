package day8;

public class OtherDemo {

	public static void main(String[] args) {
		AccessModifierDemo obj = new AccessModifierDemo(5);
		obj.publicMethod();
//		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
	}
}

package day8.other;

import day8.AccessModifierDemo;

public class AccessModifierDemoChild extends AccessModifierDemo {
	
	public static void main(String[] args) {
		AccessModifierDemo obj = new AccessModifierDemo();
		obj.publicMethod();
//		obj.privateMethod();
//		obj.protectedMethod();
//		obj.defaultMethod();
		
		AccessModifierDemoChild ob = new AccessModifierDemoChild();
		ob.protectedMethod();
	}

}

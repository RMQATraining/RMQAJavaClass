package day6;

public class StaticNonStaticTest {

	public static void main(String[] args) {
		NonStaticDemo ob = new NonStaticDemo();
		System.out.println(ob.userName);
		System.out.println(ob.userAge);
		ob.sayHello();

		System.out.println(StaticDemo.name);
		System.out.println(StaticDemo.age);
		StaticDemo.sayHi();

	}

}

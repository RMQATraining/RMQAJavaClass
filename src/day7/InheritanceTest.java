package day7;

public class InheritanceTest {

	public static void main(String[] args) {

		Parent ob = new Parent();
		System.out.println(ob.name);
		ob.greet();
		
		Child c = new Child();
		System.out.println(c.name);
		c.greet();
		
	}

}

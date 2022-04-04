package day7;

public class User {

	//instance variable
	String name;
	int age;

	public User(String n, int a) {
		name = n;
		age = a;
	}
	

	public static void main(String[] args) {
		User user1 = new User("Krishana", 22);
		System.out.println(user1.name);
		System.out.println(user1.age);
		
		System.out.println("============");
		User user2 = new User("Gopal", 33);
		System.out.println(user2.name);
		System.out.println(user2.age);
	}
}

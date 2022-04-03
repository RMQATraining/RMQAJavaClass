package day6;

public class ForLoopDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("======");

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("Sum is: " + sum);

	}

}

//Looping 
//1. for loop
//2. while loop
//3. do-while loop
//4. for-each
package day8;

public class ExcptionDemo4 {

	public static void main(String[] args) {

		vote(9);
		System.out.println("end");
	}

	public static void vote(int age) {
		if (age >= 18) {
			System.out.println("You can vote.");
		} else {
			throw new InvalidAgeException("You can not vote.");
		}
	}

}

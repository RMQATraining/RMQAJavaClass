package day7;

public class ForEachDemo1 {

	public static void main(String[] args) {
		String[] names = { "Ram", "Shyam", "Hari" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("==================");
		for (String name : names) {
			System.out.println(name);
		}

	}

}

package day3;

public class LiteralsDemo {

	public static void main(String[] args) {
		// Literals: the source code representation of fixed value
		// Literals: fixed value+data type

		// 1. Integer Literals: 346 6576878 2543 5676878 (int)
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l1 = 2147483647;
		long l2 = 2147483648L;

		// 2. Floating Literals: 34.56 45.67(double)
		float f = 34.33F;
		double d = 34.33;

		// 3. Boolean Literals true false
		boolean b1 = true;
		boolean b2 = false;

		// 4. Character Literals: 'a' '1' '?'
		char c1 = 'a';
		char c2 = '?';
		char c3 = '4';
		char c4 = '\u0001';

		// 5. String Literals: "abc@123#" "123"
		String s1 = "abc@123#";
		String s2 = "b";
		String s3 = "Hello, I am Santosh Lal Karna. I am from Kathmandu, Nepal.I am Java Developer";
		String s4 = "123";
		String s5 = "23.45";
		String s6 = "";
		String s7 = " ";

		// 5. Null Literals: null
		String s8 = null;
		LiteralsDemo obj = new LiteralsDemo();// this is an object
		LiteralsDemo ob = null;
	}

}

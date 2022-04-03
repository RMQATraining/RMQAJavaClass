package day6;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// <data type> [] array name = new <data type>[size of array];
		int[] arr = new int[3];
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = 11;
		arr[1] = 34;
		arr[2] = 23;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

	}

}
//array: is a collection of elements arranged in a sequential manner.
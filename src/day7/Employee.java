package day7;

//constructor overloading
public class Employee {

	String employeeName;
	int employeId;

	public Employee() {
		System.out.println("this is default constructor");
	}

	public Employee(String empName, int empId) {
		employeeName = empName;
		employeId = empId;
		System.out.println("this is parameterised constructor");
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("emp1", 11);
		System.out.println(emp1.employeeName);
		System.out.println(emp1.employeId);
		System.out.println("======");
		Employee emp2 = new Employee();
		System.out.println(emp2.employeeName);
		System.out.println(emp2.employeId);
	}

}

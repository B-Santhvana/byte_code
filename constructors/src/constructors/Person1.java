/*
 Write a Java class called Employee that extends Person and adds a private field for salary. Create a constructor that takes in a name, age, and 
 salary as parameters and initializes the fields using the super keyword to call the Person constructor. Also, create a method called 
 displaySalary that prints out the employee's salary.
 */
package constructors;

public class Person1 {
	String name;
	int age;
	Person1(String name, int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		Employee e= new Employee("jessy",21, 50000);
		e.displaySalary();
}
}
class Employee extends Person1{

	private double salary;

	Employee(String name, int age, double salary) {
		super(name, age);
		this.salary=salary;
	}
	public void displaySalary() {
		System.out.println(name);
		System.out.println("the age is: "+ age);
		System.out.println("the salary is "+salary);
	}
		
	}
	

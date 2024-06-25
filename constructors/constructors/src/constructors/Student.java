/*
 Write a Java class called Student with private fields for name, age, and GPA. Create two constructors - one that takes in a name, age, and GPA
 as parameters and initialises the fields, and another that takes in just a name and age as parameters and sets the GPA to 0.0. Also, create 
 a method called displayGPA that prints out the student's GPA. 
 */
package constructors;
public class Student {
	private String name;
	private int age;
	private float GPA;
	Student(String name,int age, float GPA){
		this.name=name;
		this.age=age;
		this.GPA= GPA;
	}
	Student(float GPA) {
		this.GPA= 0.0f;
	}
	public void displayGPA() {
		System.out.println("the student's GPA: "+ GPA);
	}

	public static void main(String[]args ) {
		Student s= new Student("jessy", 21, 8.0f);
		System.out.println("the name of the student is : "+s.name);
		System.out.println("the age of the student is : "+s.age);
		s.displayGPA();
	}
}


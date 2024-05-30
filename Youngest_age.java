//22.Find Youngest Age in Three in Java?
package Third_Assignment;

public class Youngest_age {

	public static void main(String[] args) {
		int age1=21, age2=20, age3=38;
		int age;
		if (age1<age2 && age1<age3) {
			age=age1;
		}
		else if(age2<age3) {
			age=age2;
		}
		else {
			age=age3;
		}
		System.out.println("the yougest age is :"+age);

	}

}

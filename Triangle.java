//14.Write a program to input angles of a triangle and check whether triangle is valid or not?
package Third_Assignment;

public class Triangle {

	public static void main(String[] args) {
		int angle1=60, angle2=60 , angle3=60;
		if (angle1+angle2+angle3==180) {
			System.out.println("valid triangle");
		}
		else {
			System.out.println("not valid triangle");
		}
	}

}

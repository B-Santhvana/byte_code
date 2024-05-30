//15.Write a program to check whether the triangle is equilateral, isosceles or scalene triangle?
package Third_Assignment;

public class Triangle_type {

	public static void main(String[] args) {
		int angle1=30, angle2= 30, angle3=30;
		if (angle1==angle2 && angle2==angle3) {
			System.out.println("equilateral triangle");
		}
		else if (angle1==angle2|| angle2==angle3|| angle1==angle3) {
			System.out.println("isosceles triangle");
		}
		else {
			System.out.println("scalene triangle");
		}

	}

}

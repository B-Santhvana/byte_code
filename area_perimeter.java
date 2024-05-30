//24.Write a program to print which one is Greater than (Area/Perimeter)?
package Third_Assignment;

public class area_perimeter {

	public static void main(String[] args) {
		int length=50;
		int breadth=20;
		int area=length*breadth;
		int perimeter=2*(length+breadth);
		if(area>perimeter) {
			System.out.println("area is greater than perimeter");
		}
		else if(area<perimeter) {
			System.out.println("perimeter is greater than area");
		}
		else {
			System.out.println("equal length and breadth");
		}

	}

}
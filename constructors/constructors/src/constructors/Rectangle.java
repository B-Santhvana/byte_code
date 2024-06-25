/*
 Write a Java class called Rectangle with private fields for length and width. Create a constructor that takes in a length and width as parameters
 and initializes the fields. Also, create a method called calculateArea that returns the area of the rectangle(length * width).
  */
package constructors;
public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length= length;
		this.width= width;
	}

	public void calculateArea() {
		System.out.println("The area of rectangle: "+ length*width);
	}
	public static void main(String[] args) {
		Rectangle r= new Rectangle(5,3);
		r.calculateArea();
	}
}

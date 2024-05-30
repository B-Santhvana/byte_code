//6.Write a program to check whether a year is leap year or not?
package Third_Assignment;

public class LeapYear {

	public static void main(String[] args) {
		int y=2024;
		if (y%4==0){
			if (y%100!=0) {
				System.out.println("leap year");
			}
		}
		else {
			System.out.println("not a leap year");
		}

	}

}

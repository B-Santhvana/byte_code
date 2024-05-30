//4.Write a program to check whether a number is divisible by 5 and 11 or not?
package Third_Assignment;

public class Divisibility {

	public static void main(String[] args) {
		int a=55;
		if (a%5==0) {
			if (a%11==0) {
				System.out.println("given num is divisible by 5 and 11");
			}
		}
		else {
			System.out.println("given num is not divisible by 5 and 11");
		}
		

	}

}

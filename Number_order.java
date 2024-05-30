//25.Write a java program that accepts three numbers from the user and check if numbers are in "increasing" or "decreasing" order
package Third_Assignment;

public class Number_order {

	public static void main(String[] args) {
		int num1=10, num2=5, num3=3;
		if(num1>num2 && num2>num3) {
			System.out.println("decreasing order");
		}
		else if(num1<num2 && num2<num3) {
			System.out.println("increasing order");
		}
		else {
			System.out.println("neither increasing nor increasing order");
		}

	}

}

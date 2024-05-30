//10.Write a program to check whether a character is uppercase or lowercase alphabet?
package Third_Assignment;

public class Case {

	public static void main(String[] args) {
		char letter='s';
		if (letter>='a') {
			System.out.println("lower case");
		}
		else if(letter>='A'){
			System.out.println("upper case");
		}
		else {
			System.out.println("it's not an alphabet");
		}

	}

}

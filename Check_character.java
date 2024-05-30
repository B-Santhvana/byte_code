//9.Write a program to input any character and check whether it is alphabet, digit or special character?
package Third_Assignment;

public class Check_character {

	public static void main(String[] args) {
		char ch=')';
		if (ch>='a'||ch>='A') {
			System.out.println("alphabet");
		}
		else if (ch>='0'&& ch<='9') {
			System.out.println("digit");
		}
		else if(ch=='~'|| ch=='!'||ch=='@'|| ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')') {
			System.out.println("special character");
		}
		else {
			System.out.println("incorrect input");
		}

	}

}

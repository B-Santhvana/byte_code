//3.Write a program to check whether a number is negative, positive or zero?
package Third_Assignment;

public class SignCheck {

	public static void main(String[] args) {
		int a=0;
		String sign="";
		if(a==0) {
			sign="zero";
		}
		else if(a>0) {
			sign="positive";
		}
		else {
			sign="negative";
		}
		System.out.println("given num is:"+sign);
	}

}

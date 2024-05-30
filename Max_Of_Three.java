//2.Write a program to find maximum between three numbers?
package Third_Assignment;

public class Max_Of_Three {

	public static void main(String[] args) {
		int a=1, b=2, c=3;
		int max;
		if (a>b) {
			if(a>c) {
				max=a;
			}
			else {
				max=b;
			}
		}
		else {
			if(b>c) {
				max=b;
			}
			else {
				max=c;
			}
		}
		System.out.println("maximum is:"+max);

	}

}

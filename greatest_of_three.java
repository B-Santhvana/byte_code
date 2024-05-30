//2)Greatest of three numbers using nested ternary opeartor
package second_assignment;
//import java.io.*;
public class greatest_of_three {

	public static void main(String[] args) {
		//2)Greatest of three numbers using nested ternary operator
		int a=1,b=2,c=3;
		int result= a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("greatest num:"+result);

	}

}

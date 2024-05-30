//1)Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.(Using Assignment Operators)

package second_assignment;
//import java.io.*;
public class assignment_op {

	public static void main(String[] args) {
		//1)Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.(Using Assignment Operators)
		int a =2345;
		System.out.println("after adding 8 : "+(a+=8));
		System.out.println("after dividing it by 3:  "+(a/=3));
		System.out.println("after modulus of quotient is taken with 5:  "+(a%=5));
		System.out.println("after multiplying with 5:  "+(a*=5));

	}

}

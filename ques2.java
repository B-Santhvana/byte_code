//Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
package firstAssignment;

public class ques2 {

	public static void main(String[] args) {
		int a=8,b=2345;
		int c=a+b;//2353
		int d=c/3;//784
		System.out.println("result:"+(d%5)*5);//20

	}

}

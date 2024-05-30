//3)Consider the following code snippet:
//int i = 10;
//int n = i++%5;
//What are the values of i and n after the code is executed?
//What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?
package second_assignment;
//import java.io.*;
public class increment {

	public static void main(String[] args) {
		int i = 10;
		int n = i++%5;//n=0
		//i=11
		System.out.println("i val:"+i);
		System.out.println("n val:"+n);
		int m=++i%5;//2
		//i=12
		System.out.println("i val:"+i);
		System.out.println("n val:"+m);
		
		

	}

}

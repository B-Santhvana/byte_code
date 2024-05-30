//19.Calculate Student Percentage and Print Division in Java?

package Third_Assignment;

public class student_division {

	public static void main(String[] args) {
		int sub1=50, sub2=79, sub3=64;
		String division=" ";
		int total= sub1+ sub2+ sub3;
		int percentage= (total/3);
		if (percentage>=80) {
			division="FIRST DIVISION";
		}
		else if (percentage>=60) {
			division="SECOND DIVISION";
		}
		else if (percentage>=40) {
			division="THIRD DIVISION";
		}
		else {
			System.out.println("fail");
		}
		System.out.println(percentage+"% and division:"+ division);

	}

}


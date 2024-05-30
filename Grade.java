//17.Calculate Student Percentage and Grade in Java?
package Third_Assignment;

public class Grade {

	public static void main(String[] args) {
		int sub1=98, sub2=89, sub3=94;
		char grade=' ';
		int total= sub1+ sub2+ sub3;
		int percentage= (total/3);
		if (percentage>=90) {
			grade='A';
		}
		else if (percentage>=80) {
			grade='B';
		}
		else if (percentage>=70) {
			grade='C';
		}
		else if (percentage>=60) {
			grade='D';
		}
		else {
			System.out.println("fail");
		}
		System.out.println(percentage+"% and grade:"+ grade);

	}

}

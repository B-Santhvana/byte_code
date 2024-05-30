//If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.
package firstAssignment;

public class percentage {

	public static void main(String[] args) {
		int sub1=78,sub2=45,sub3=62;
		float total = sub1 + sub2 + sub3;//185.0
		float percentage = ((total/300)*100);//61.66
		System.out.println("robert's total marks:"+total);
		System.out.println("robert's percentage:"+percentage+"%");

	}

}

/*20.Check Company Insures Drivers in Java?
   A company insures its drivers in the following cases:
   If the driver is married
   If the driver is unmarried, male & above 30 years of age
   If the driver is unmarried, female & above 25 years of age
 */
package Third_Assignment;

public class Driver_eligibility {

	public static void main(String[] args) {
		String maritial_status="unmarried";
		String gender="female";
		int age=21;
		if (maritial_status=="married") {
			System.out.println("driver insured");
		}
		else if(maritial_status=="unmarried" && gender=="male" && age>30 ) {
			System.out.println("driver insured");
		}
		else if(maritial_status=="unmarried" && gender=="female" && age>25 ) {
			System.out.println("driver insured");
		}
		else {
			System.out.println("driver is not insured");
		}
	}
}

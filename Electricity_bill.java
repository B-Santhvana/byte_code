//21.Calculate Total Electricity Bill in Java?
package Third_Assignment;

public class Electricity_bill {

	public static void main(String[] args) {
		int unit_consumption=250;
		double bill=0;
		if (unit_consumption<=100) {
			bill=unit_consumption*1.0f;
		}
		else if (unit_consumption<=200 ) {
			bill=unit_consumption*2.0f;
		}
		else if (unit_consumption<=300) {
			bill=unit_consumption*3.0f;
		}
		else {
			bill=1000;
		}
		System.out.println("electricity bill:"+bill);
	}

}

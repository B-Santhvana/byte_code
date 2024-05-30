//26.Write a Java Program to Finding Month in a Year?
package Third_Assignment;

public class Find_month {

	public static void main(String[] args) {
		int month_num=2;
		String month="";
		if (month_num==1){
			month="january";
		}
		else if (month_num==2) {
			month="febraury";	
		}
		else if (month_num==3) {
			month="march";
		}
		else if (month_num==4) {
			month="april";
		}
		else if(month_num==5) {
			month="may";
		}
		else if(month_num==6) {
			month="june";
		}
		else if(month_num==7) {
			month="july";
		}
		else if (month_num==8) {
			month="august";	
		}
		else if (month_num==9) {
			month="september";	
		}
		else if (month_num==10) {
			month="october";	
		}
		else if (month_num==11) {
			month="november";	
		}
		else if (month_num==12) {
			month="december";	
		}
		else {
			System.out.println("month number should be in between 1 and 12");
		}
		System.out.println("the month for given number:"+month);

	}

}

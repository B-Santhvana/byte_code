//18.Employees Year of Service Salary Bonus in Java?
package Third_Assignment;

public class Salary_bonus {

	public static void main(String[] args) {
	int salary=100000;
	int service=3;
	double bonus=0;
	double final_salary;
	if(service>=1) {
		bonus=salary*0.1;
	}
	else if(service>=5) {
		bonus=salary*0.05;
	}
	else {
		bonus=0;
	}
    final_salary = salary + bonus;
    System.out.println("employee's present salary: "+salary);
    System.out.println("employee's bonus for service: "+bonus);
    System.out.println("employee's final salary by including bonus: "+final_salary);
    

	}

}
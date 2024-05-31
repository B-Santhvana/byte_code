package fourth_assignment;

public class Spy_number {

	public static void main(String[] args) {
		int num=1124,sum=0,rem, product=1;
		int temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum+rem;
			product*=rem;
		}
		if(sum==product) {
			System.out.println(temp+ " is a spy number");
		}
		else {
			System.out.println(temp+" is not a spy number");
		}

	}

}

package fourth_assignment;

public class Neon_number {

	public static void main(String[] args) {
		int num=20, sq=num*num,sum=0,rem;
		while(sq>0) {
			rem=sq%10;
			sq=sq/10;
			sum=sum+rem;
		}
		if (sum==num) {
			System.out.println("neon number");
		}
		else {
			System.out.println("not a neon number");
		}

	}

}

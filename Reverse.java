package fourth_assignment;

public class Reverse {

	public static void main(String[] args) {
		int num=12345,temp=num, rem=0,reversed=0;
		while(num>0) {
			rem=num%10;
			reversed=reversed*10+rem;
			num=num/10;
		}
		System.out.println("reversed number of "+temp+" is :"+reversed);

	}

}

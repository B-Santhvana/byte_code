package fourth_assignment;

public class Palindrome {

	public static void main(String[] args) {
		int num=1991, temp=num, rem=0, reversed=0;
		while(num>0) {
			rem=num%10;
			reversed=reversed*10+rem;
			num/=10;
		}
		if(temp==reversed) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}

//13.Write a program to count total number of notes in given amount?
package Third_Assignment;

public class Notes_count {

	public static void main(String[] args) {
		int amount=4153;
		int n2000=0,n1000=0,n500=0,n200=0,n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0;
		if (amount>=2000) {
			n2000=amount/2000;
			amount%=2000;
		if(amount>=1000) {
			n1000=amount/1000;
			amount%=1000;
		}
		if (amount>=500) {
			n500=amount/500;
			amount%=500;
			
		}
		if (amount>=200) {
			n200=amount/200;
			amount%=200;
			
		}
		if (amount>=100) {
			n100=amount/100;
			amount%=100;
			
		}
		if (amount>=50) {
			n50=amount/50;
			amount%=50;
			
		}
		if (amount>=20) {
			n20=amount/20;
			amount%=20;
			
		}
		if (amount>=10) {
			n10=amount/10;
			amount%=10;
			
		}
		if (amount>=5) {
			n5=amount/5;
			amount%=5;
			
		}
		if (amount>=2) {
			n2=amount/2;
			amount%=2;
			
		}
		if (amount==1) {
			n1=amount/1;
			amount%=1;
			
		}
		System.out.println("2000:"+n2000);
		System.out.println("1000:"+n1000);
		System.out.println("500:"+n500);
		System.out.println("200:"+n200);
		System.out.println("100:"+n100);
		System.out.println("50:"+n50);
		System.out.println("20:"+n20);
		System.out.println("10:"+n10);
		System.out.println("5:"+n5);
		System.out.println("2:"+n2);
		System.out.println("1:"+n1);
	}
		
		
	}

}

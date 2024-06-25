package patterns;
public class LetterS {
	public static void main(String[] args) {
		/*for(int row=1; row<=5;row++) {
			if(row==2) {
				for(int col=1;col<=1;col++) {
					System.out.println("*");
				}
			}
			else if(row==4){
				for(int sp=1;sp<=2;sp++) {
					System.out.print(" ");
					for(int col=4;col<=4;col++) {
						System.out.println("*");
					}
				}
			}
			else {
				for(int col=1; col<=4;col++) {
					System.out.print("* ");
				}
			}
		System.out.println("* ");	
		*/
		for(int row=1; row<=5;row++) {
			if(row%2!=0) {
				System.out.println("* * * *");
			}
			else if(row==2) {
				System.out.println("*");
			}
			else if(row==4){
				System.out.println("      *");
			}
		}
	}
}

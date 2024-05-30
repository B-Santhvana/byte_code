//16.Write a program to calculate profit or loss?
package Third_Assignment;

public class Profit_loss {

	public static void main(String[] args) {
		int sp=1000, cp=500;
		if (sp>cp) {
			System.out.println("profit  "+(sp-cp)+"rs");
		}
		else if(cp>sp ) {
			System.out.println("loss  "+(cp-sp)+"rs");
		}
		else {
			System.out.println("neither profit nor loss");
		}

	}

}

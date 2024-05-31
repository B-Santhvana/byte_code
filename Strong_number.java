package fourth_assignment;

public class Strong_number {

	public static void main(String[] args) { 
		int num=40585,sum=0,temp=num,rem,factorial=0;
		while(num>0)
			{
				rem=num%10;
				factorial=1;
				for(int i=1;i<=rem;i++)
				{
					factorial*=i;
				}
				sum+=factorial;
				num=num/10;
			}
			if(sum==temp)
			{
				System.out.println(temp+ " is a strong number");
			}
			else {
				System.out.println(temp+ " is not a strong number");
			}

		}

}


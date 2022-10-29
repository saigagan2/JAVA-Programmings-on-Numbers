import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while (num!=0)
		{
			int rem=num%10;
			int fact=strongNumberLogic(rem);
			sum=sum+fact;
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println(temp+ " is a Strong number");
		}
		else
		{
			System.out.println(temp+ " is a not a Strong number");
		}
			
	}
	public static int strongNumberLogic(int num)
	{ 
		int fact=1;
		int  sum=0;
		for (int i=1;i<=num ;i++ )
		{
			fact=fact*i;
		}
		return fact;
		
	}
}


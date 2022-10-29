import java.util.Scanner;
class fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of fibonacci series");
		int length=sc.nextInt();
		fibonacciLogic(length);
	}
	public static void fibonacciLogic(int length)
	{
		int n1=0;
		int n2=1;
		if (length==0)
		{
			System.out.println("Invalid length");
		}
		else if (length==1)
		{
			System.out.println(n1);
		}
		else if (length==2)
		{
			System.out.println(n2);
		}
		else
		{
			System.out.println(n1);
			System.out.println(n2);
			for (int i=3;i<=length ;i++ )
			{
				int n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
		}
	}
}

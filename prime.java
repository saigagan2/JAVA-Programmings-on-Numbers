import java.util.Scanner;
class prime
{   
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        int count=primeLogic(num);
		if ( count==2)
		{
			System.out.println("The number is Prime Number");
		}
		else 
		{
			System.out.println("The number is not a Prime Number");
		}
	}
	public static int primeLogic(int num)
	{
		int count=0;
		for (int i=1;i<=num;i++ )
		{
			if (num%i==0)
			{
				count++;
			}

		}
		return count;
	}
}

import java.util.Scanner;
class factors
{   
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        factorsLogic(num);
	}
	public static void factorsLogic(int num)
	{
		for (int i=1;i<=num;i++ )
		{
			if (num%i==0)
			{
				System.out.println(i);
			}

		}
	}
}


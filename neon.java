import java.util.Scanner;
class neon
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
        neonLogic(num);

	}
    public static void neonLogic(int num)

	{
		int pow=2;
		int out=1;
		for (int i=1;i<=pow ;i++ )
		{
			out=num*out;
		}
		int temp=num;
		int sum=0;
		while (out!=0)
		{
			int rem=out%10;
			sum=sum+rem;
			out=out/10;
		}
		if (sum==temp)
		{
			System.out.println(temp+ " is a Neon Number");

		}
		else
		{
			System.out.println(temp+ " is not a Neon Number");

		}

	}
}


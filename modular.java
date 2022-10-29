import java.util.Scanner;
class Modular
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int m=sc.nextInt();
		System.out.println("Enter Number 2");
		int n=sc.nextInt();
        int y=modularLogic(m,n);
		System.out.println("factorial of given modular function(m^n)= "+y);
	}
    public static int modularLogic(int m,int n)
	{
		int pow=n;
		int out=1;
		for (int i=1;i<=pow ;i++ )
		{
			out=m*out;
		}
		int x=factorialLogic(out);
		return x;
	}
	public static int factorialLogic(int out)
	{ 
		int fact=1;
		for (int i=1;i<=out ;i++ )
		{
			fact=fact*i;
		}
		return fact;
	}
}
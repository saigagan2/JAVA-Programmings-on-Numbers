import java.util.Scanner;
class  oneton
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number");
		int num=sc.nextInt();
		logic(num);
	}
    public static void logic(int num)
	{ 
		for (int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
	}
}
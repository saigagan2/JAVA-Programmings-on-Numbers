import java.util.Scanner;
class  ntoone
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
		for (int i=num;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
import java.util.Scanner;
class spy
{   
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        spyLogic(num);
	}
	public static void spyLogic(int num)
	{
		int temp=num;
		int sum=0;
		int pro=1;
		while (num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			pro=pro*rem;
			num=num/10;
		}
		if (sum==pro)
		{
			System.out.println(temp+ " is a spy number");
		}
		else
		{
			System.out.println(temp+ " is not a spy number");
		}
		
	}
}

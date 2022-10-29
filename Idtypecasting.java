import java.util.Scanner;
class Idtypecasting 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        int sum=addLogic(num);
		while (sum>26)
		{
			sum=addLogic(sum);
		}
		int v= sum+64;
		char c=(char)v;
		System.out.println("Upper case is :"+c);
		int j= sum+96;
		char d=(char)j;
		System.out.println("Lower case is :"+d);


	}
	public static int addLogic(int num)
	{
        int sum=0;
		while(num!=0)
		{
		  int rem=num%10;
            sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
}

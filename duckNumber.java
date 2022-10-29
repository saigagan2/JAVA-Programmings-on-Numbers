import java.util.Scanner;
class duckNumber
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
		int num=sc.nextInt();
		duckNumberLogic(num);
        			
	}
	public static void duckNumberLogic(int num)
	{ 
		int temp=num;
		int count=0;
		while (num!=0)
		{
			int rem=num%10;
			if (rem==0)
			{
				count++;
			}
			num=num/10;
		}
		if (count>=1)
		{
			System.out.println(temp+ " is a ducknumber");
		}
		else
		{
			System.out.println(temp+ " is not a ducknumber");
		}
		
	}
}

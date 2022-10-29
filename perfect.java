import java.util.Scanner;
class perfect
{   
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        perfectLogic(num);
	}
	public static void perfectLogic(int num)
	{
		int sum=0;
		for (int i=1;i<num;i++ )
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
         
		}
		if (sum==num)
		{
			System.out.println(num+" is a perfect number");
		}
		else
		{
			System.out.println(num+" is not a perfect number");
		}
	}
}


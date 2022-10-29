//Check the given number is Harshad number or not.
//Example = 156=1+5+6=12,156%12==0,is a Harshad number.
import java.util.Scanner;
class HarshadNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		harshadLogic(num);


	}
	public static void harshadLogic(int num)
	{

		int temp=num;
		int sum=0;
		while (num>0)
		{
		 int rem=num%10;
		 sum=sum+rem;
		 num=num/10;
		}
		
		if (temp%sum==0)
		{
			System.out.println(temp+ " is a Harshad number");
		}
		else
		{
            System.out.println(temp+ " is not a Harshad number");
		}


	}

}


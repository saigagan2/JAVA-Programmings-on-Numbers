import java.util.Scanner;
class  Armstrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long num=sc.nextLong();
		long count=0;
		long temp=num;
		long temp2=num;
		while (num>0)
		{
			long rem=num%10;
			count++;
			num=num/10;
		}
		long sum=0;
		while (temp2>0)
		{
			long out=powerlogic(count,temp2);
		             sum=sum+out;
					 temp2=temp2/10;
		}
		
		if (sum==temp)
		{
			addOfEvenDigits(temp);
		
		}
		else
		{
			addOfoddDigits(temp);
		}
		
	}
	public static long powerlogic(long count,long temp2)
	{
		long pow=count;
		long out=1;
		long sum=0;
		for (int i=1;i<=pow;i++)
		{
			long rem1=temp2%10;
			out=rem1*out;
		}
		return out;
	}
	public static void addOfEvenDigits(long temp)
	{
        long add1=0;
		while(temp!=0)
		{
		  long rem1=temp%10;
		  if (rem1%2==0)
		  {
            add1=add1+rem1;
		  }
			temp=temp/10;
		}
		System.out.println(add1);
	}
	public static void addOfoddDigits(long temp)
	{
        long add2=0;
		while(temp!=0)
		{
		  long rem2=temp%10;
		  if (rem2%2!=0)
		  {
            add2=add2+rem2;
		  }
			temp=temp/10;
		}
		System.out.println(add2);
	}
}


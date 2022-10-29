class StrongNumber1
{
	public static void main(String[] args)
	{
		for(int i = 1; i<=100000; i++)
		{
            checkLogic(i);
		}
	}	
	public static void checkLogic(int num) 
	{
		int temp=num;
		int sum=0;
		while (num!=0)
		{
			int rem=num%10;
			int fact=strongNumberLogic(rem);
			sum=sum+fact; 
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println(temp+ " is strong number");
		}			
	}
	public static int strongNumberLogic(int num)
	{ 
		int fact=1;
		for (int i=1;i<=num ;i++)
		{
			fact=fact*i;
		}
		return fact;	
	}
}

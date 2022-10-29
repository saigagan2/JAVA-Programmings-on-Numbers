class factorial1to100 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		for (int i=1;i<=100 ;i++ )
		{
			factorialLogic(i);
		}
	}
	public static void factorialLogic(int num)
	{ 
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
	}
}

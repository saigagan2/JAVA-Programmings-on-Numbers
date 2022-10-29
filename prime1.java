class prime1
{   
	public static void main(String[] args) 
	{
        
		for(int i = 1; i<= 100; i++)
		{
			primeLogic(i);
		}

	}
	public static void primeLogic(int num)
	{
		
			int count=0;
			for (int i = 1; i <= num; i++)
			{
				if (num%i==0)
				{
				 count=count+1;
				}
			}
			
		
		if (count==2)
		{
			System.out.println(num+ " is prime");

		}
	}
}
class buzz1to100
{   
	public static void main(String[] args) 
	{
		for (int i=1;i<=100 ;i++ )
		{
			buzzLogic(i);
		}
        
	}
	public static void buzzLogic(int num)
	{
			if ((num%7==0) || (num%10==7))
			{
				System.out.println(num);
			}
	}
}


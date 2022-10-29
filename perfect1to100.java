class perfect1to100
{   
	public static void main(String[] args) 
	{
		for (int i=1;i<=100 ;i++ )
		{
			perfectLogic(i);
		}
        
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
			System.out.println(num);
		}
	}
}
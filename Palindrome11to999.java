class Palindrome11to999
{
	public static void main(String[] args) 
	{
	 for (int i=11; i<=999;i++)
	 {
	   palindromeLogic(i);
	 }
	}
    public static void palindromeLogic(int num)
	{
		int rev=0;
		int temp=num;
		while (num>0)
		{
			int rem=num%10;
			    rev=rev*10+rem;
				num=num/10;
		}
		if (rev==temp)
		{
			System.out.println(temp+ " is a Palindrome");
		}
	}
}
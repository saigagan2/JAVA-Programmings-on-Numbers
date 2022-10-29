import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int temp=num;
        int rev= palindromeLogic(num);
		if (rev==temp)
		{
			System.out.println(temp+ " is a Palindrome");
		}
		else 
		{
			System.out.println(temp+ " is not a Palindrome");
		}

	}
    public static int palindromeLogic(int num)

	{
		int rev=0;
		while (num>0)
		{
			int rem=num%10;
			    rev=rev*10+rem;
				num=num/10;
		}
		return rev;
	}
}

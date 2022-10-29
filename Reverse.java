import java.util.Scanner;
class Reverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
        reverseLogic(num);
		
	}
    public static void reverseLogic(int num)

	{
		int rev=0;
		int temp=num;
		while (num>0)
		{
			int rem=num%10;
			    rev=rev*10+rem;
				num=num/10;
		}
		{
		  System.out.println(temp+ " number's reverse is " +rev);
		}
		
	}
}

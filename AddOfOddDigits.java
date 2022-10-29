import java.util.Scanner;
class AddOfOddDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
        int add=addOfOddDigitsLogic(num);
		System.out.println(temp+ " Addition of Odd digits are = " +add);
	}
	public static int addOfOddDigitsLogic(int num)
	{
        int add=0;
		while(num!=0)
		{
		  int rem=num%10;
		  if (rem%2!=0)
		  {
            add=add+rem;
		  }
			num=num/10;
		}
		return add;
	}
}
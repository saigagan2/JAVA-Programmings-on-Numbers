import java.util.Scanner;
class Aski
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int temp=num;
        int sum= palindromeLogic(num);
		char a=sum;
		System.out.println(a);

	}
    public static int palindromeLogic(int num)

	{
		int sum=0;
		while (num>0)
		{
			int rem=num%10;
			    sum=sum+rem;
				num=num/10;
		}
		return sum;
	}
}
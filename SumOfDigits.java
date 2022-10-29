import java.util.Scanner;
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        sumOfDigitsLogic(num);
	}
	public static void sumOfDigitsLogic(int num)
	{
        int sum=0;
		int temp=num;
		while(num!=0)
		{
		  int rem=num%10;
		      sum=sum+rem;
			  num=num/10;
		}
		System.out.println(temp+ " sum of digit is = " +sum);
	}

}

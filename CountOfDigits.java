import java.util.Scanner;
class CountOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        countOfDigitsLogic(num);
	}
	public static void countOfDigitsLogic(int num)
	{
        int count=0;
		int temp=num;
		while(num!=0)
		{
		  int rem=num%10;
		      count++;
			  num=num/10;
		}
		System.out.println(temp+ " count is = " +count);
	}

}

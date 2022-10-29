import java.util.Scanner;
class AddOfEvenDigits1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
        int add=addOfEvenDigitsLogic(num);
		System.out.println(temp+ " Addition of Even digits are = " +add);
	}
	public static int addOfEvenDigitsLogic(int num)
	{
        int add=0;
		while(num!=0)
		{
		  int rem=num%10;
		  if (rem%2==0)
		  {
            add=add+rem;
		  }
			num=num/10;
		}
		return add;
	}
}

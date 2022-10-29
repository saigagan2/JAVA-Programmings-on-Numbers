import java.util.Scanner;
class AddOfEvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        addOfEvenDigitsLogic(num);
	}
	public static void addOfEvenDigitsLogic(int num)
	{
        int add=0;
		int temp=num;
		while(num!=0)
		{
		  int rem=num%10;
		  if (rem%2==0)
		  {
            add=add+rem;
		  }
			num=num/10;
		}
		System.out.println(temp+ " Addition of Even digits are = " +add);
	}

}


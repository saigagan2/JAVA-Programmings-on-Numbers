//Check the given number is Strontio number or not.
//Example = 1786*2=2772=is a Strontio number.
import java.util.Scanner;
class StrontioNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		strontioLogic(num);


	}
	public static void strontioLogic(int num)
	{

		int temp=num;
		num=num*2;
		num=num/1000;
		num=num/10;
		if (num%10==num/10)
		{
			System.out.println(temp+ " is a Strontio number");
		}
		else
		{
            System.out.println(temp+ " is not a Strontio number");
		}


	}

}

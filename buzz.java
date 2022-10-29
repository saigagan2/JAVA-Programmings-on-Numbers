import java.util.Scanner;
class buzz
{   
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        buzzLogic(num);
	}
	public static void buzzLogic(int num)
	{
			if ((num%7==0) || (num%10==7))
			{
				System.out.println(num+" is a buzz number");
			}
		    else
		    {
			    System.out.println(num+" is not a buzz number");
		    }
	}
}


import java.util.Scanner;
class  oddoreven
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		logic(a);
	}
    public static void logic(int a)
	{ 
		if (a%2==0)
		{
          System.out.println( a+ " is Even number");
		}
		else
		{
          System.out.println( a+ " is odd number");
		}
	    	
	}
}
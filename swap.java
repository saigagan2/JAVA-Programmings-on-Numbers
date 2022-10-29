import java.util.Scanner;
class  swap
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
        System.out.println("Enter b");
		int b=sc.nextInt();
		logic(a,b);
	}
    public static void logic(int a,int b)
	{ 
		a=a+b;
		b=a-b;
		a=a-b;
	    System.out.println("a= " +a+ " b= " +b);	
	}
}
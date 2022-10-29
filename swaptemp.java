import java.util.Scanner;
class  swaptemp
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
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a= " +a+ " b= " +b);
	}
}
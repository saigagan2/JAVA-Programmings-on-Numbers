import java.util.Scanner;
class Table2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get table");
		int num=sc.nextInt();
		System.out.println("Enter table upto");
		int a=sc.nextInt();
		table2Logic(num,a);
	}
	public static void table2Logic(int num,int a)
	{
		int pro=1;
		for (int i=1;i<=a ;i++ )
		{
			pro=num*i;
			System.out.println(num+" X "+i+" = "+pro);
		}
	}
}

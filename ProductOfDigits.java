import java.util.Scanner;
class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        productOfDigitsLogic(num);
	}
	public static void productOfDigitsLogic(int num)
	{
        int pro=1;
		int temp=num;
		while(num!=0)
		{
		  int rem=num%10;
		      pro=pro*rem;
			  num=num/10;
		}
		System.out.println(temp+ " Product is = " +pro);
	}

}


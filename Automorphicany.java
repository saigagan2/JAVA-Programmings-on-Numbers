import java.util.Scanner;
class Automorphicany
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int temp=num;
        boolean x=autoMorphicLogic(num);
		if (x)
		{
			System.out.println(temp+ " is Automorphic");
		}
		else
		{
            System.out.println(temp+ " is not Automorphic");
		}

	}
    public static boolean autoMorphicLogic(int num)

	{
		int pro=num*num;
		while (num!=0)
		{
			if ((num%10)!=(pro%10))
			{
				return false;
			}
		    else
			{
				num=num/10;
				pro=pro/10;
			}
		}
		return true;	
	}
}


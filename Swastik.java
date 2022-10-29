import java.util.Scanner;
class Swastik
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		for (int row=0;row<=rows ;row++)
		{
			for (int col=0;col<=rows;col++)
			{
				if (i<row/2)
				{
					if (j<col/2)
					{
						if (j==0)
						{
							System.out.println("*");
						}
						else
						{
							System.out.println(""+"");
						}
					}
				}
				else if (j==col/2)
				{
				  System.out.println("*");
				}
				else
				{
					if (i==0)
					{
						System.out.println("*");
					}
							
				}
				if (i==row/2)
				{
					System.out.println("*");
				}
				else
				{
                   if (j==col/2||j==col-1)
                   {
					   System.out.println("*");
                   }
				   else if (i==row-1)
				   {
					   if (j<=col/2||j==col-1)
					   {
						   System.out.println("*");
					   }
					   else
					   {
                           System.out.println(""+"");
					   }
				   }
				   System.out.println("\n");
				}
			}	
		}
	}
}

/*Q17. Write a program in Java to display the following pattern:
    1
   12
  123
 1234
12345*/
class Pattern17 
{
	public static void main(String[] args) 
	{
		int a=0,sp=0;
		for(int i=1;i<=5;i++)
		{
			a=5-i;
			while(a!=0)
			{
				System.out.print(" ");
				a--;
			}
			int b=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print((b++)+" ");
			}
			System.out.println();
		}
	}
}

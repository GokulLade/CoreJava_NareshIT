/*Q18. Write a program in Java to display the following pattern:
    1
   21
  321
 4321
54321*/
class Pattern18 
{
	public static void main(String[] args) 
	{
		int a=0;
		for(int i=1;i<=5;i++)
		{
			a=5-i;
			while(a!=0)
			{
				System.out.print(" ");
				a--;
			}
			int b=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print((b--)+" ");
			}
			System.out.println();
		}
	}
}

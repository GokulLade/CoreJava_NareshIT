/*Q20.Write a program in Java to display the following pattern:
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1*/
class Pattern20 
{
	public static void main(String[] args) 
	{
		int a=1,b=0,k=0;
		for(int i=1;i<=5;i++)
		{
			b=a;
			for(int j=1;j<=i;j++,b=b-2)
			{
				System.out.print(b+" ");
			}
			a+=2;
			System.out.println();
		}
	}
}

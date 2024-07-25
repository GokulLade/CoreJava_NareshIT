/*2> 1
     1  2
     1  2  3
     1  2  3  5
     1  2  3  5  8
*/
class Pattern2 
{
	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3=0;
		for(int i=1;i<=5;i++)
		{
			n1=0;
			n2=1;
			for(int j=1;j<=i;j++)
			{
				n3=n1+n2;
				System.out.print(n3+" ");
				n1=n2;
				n2=n3;
			}
			System.out.println();
		}
	}
}

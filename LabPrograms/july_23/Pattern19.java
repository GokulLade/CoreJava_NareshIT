/*Q19. Write a program in Java to display the following pattern:
   1
  31
 531
7531*/
class Pattern19 
{
	public static void main(String[] args) 
	{
		int a=1,b=0,k=0;
		for(int i=1;i<=4;i++)
		{
			k=5-i;
			while(k!=0)
			{
				System.out.print(" ");
				k--;
			}
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

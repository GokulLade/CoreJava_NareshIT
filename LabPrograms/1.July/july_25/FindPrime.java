/*1. Write a Java program to find prime  number upto given number   by using for loop?
input : n = 10.
output :- 2,3,5,7.
*/
class FindPrime 
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
	}
}

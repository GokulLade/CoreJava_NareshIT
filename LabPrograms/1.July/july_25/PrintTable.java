/*2. Write a Java program to print multiplication table from 2 to 5 by using for loop?
*/
class PrintTable 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=2;j<=5;j++)
			{
				System.out.print(j+" * "+i+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
	}
}

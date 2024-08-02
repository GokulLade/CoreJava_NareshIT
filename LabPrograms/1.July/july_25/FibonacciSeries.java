/*3. Write a java program to print Fibonacci Series.
input :- 5
output :-  0, 1, 1, 2, 3.
*/
class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3=0;
		
		int n=Integer.parseInt(args[0]);
		
		System.out.print(n1+", "+n2+", ");
		n-=2;
		while(n!=0)
		{
			n3=n1+n2;
			System.out.print(n3+", ");
			n1=n2;
			n2=n3;
			n--;
		}
	}
}

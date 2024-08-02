/*4. Write a java program to count the number of digit and it's sum of the given number . 
input 12345
output 
no. of digit = 5.
sum of digit = 15.*/
class SumOfDigit 
{
	public static void main(String[] args) 
	{
		int r=0,n=0,count=0,sum=0;
		n=Integer.parseInt(args[0]);
		
		for(;n!=0;n=n/10)
		{
			r=n%10;
			sum+=r;
			count++;
		}
		System.out.println("Number of Digit = "+count);
		System.out.println("Sum of Digit = "+sum);
	}
}

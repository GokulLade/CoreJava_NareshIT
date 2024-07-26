/*Program 1-An automorphic number is a number whose square ends in the 
same digits as the number itself.
For example :
5,6,25 are automorphic numbers.

5*5=25 // last digit is 5

6*6=36 // last digit is 6

25*25=625 // last digit is 25

OUTPUT :

 Enter a number: 25

 Square of 25 is 625
 25 is an Automorphic number
 

 Enter a number: 14

 Square of 14 is 196
 14 is NOT an Automorphic number
*/
import java.util.*;
class  AutomorphicNumber
{
	public static void main(String[] args) 
	{
		int count=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		int sqrt=n*n;
		
		int temp=n;
		while(temp!=0)
		{
			temp/=10;
			count*=10;
		}
		
		if(sqrt%count==n)
		{
			System.out.println("Automorphic number");
		}
		else
		{
			System.out.println("Not Automorphic number");
		}
		
	}
}

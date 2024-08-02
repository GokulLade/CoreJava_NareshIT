/*program-2 

A spy number is a number where the sum of its digits equals 
the product of its digits.
For example :
1124 is a spy number, because the sum of its digits is 1+1+2+
4=8 and the product of its digits is 1*1*2*4=8 is equal.

 OUTPUT :
 
 
Enter the number:2114
Given number is a Spy number.

 
Enter the number:1113
Given number is NOT a Spy number.*/
import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int r=0,sum=0,mul=1;
		while(n!=0)
		{
			r=n%10;
			sum+=r;
			mul*=r;
			
			n/=10;	
		}
		
		if(sum==mul){
			System.out.println("The Number is Spy Number");
		}
		else{
			System.out.println("The Number is Not Spy Number");
		}
		
	}
}

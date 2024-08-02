/*Write a Java method to compute the sum of digits in an integer.
by creating a method writing the logic inside the method and by calling a method: 

Test Data:
Input an integer: 25

Expected Output:
The sum is 7 

Methods:
-------------
name : numberSum 
returnType : void 
methodType : static
parameterType: No argument

Note: [Take the test data value as the local variable inside the method as int type]
*/
class DigitSum 
{
	static void numberSum()
	{
		int num=25,r=0,sum=0;
		
		while(num!=0)
		{
			r=num%10;
			sum+=r;
			num/=10;
		}
		System.out.println("The sum of digit is :"+sum);
	}
	public static void main(String[] args) 
	{
		numberSum();
	}
}

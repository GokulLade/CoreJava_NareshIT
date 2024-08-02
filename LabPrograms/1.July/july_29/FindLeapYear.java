/*Write a Java method to check whether a year (integer) entered by the user
is a leap year or not.
by creating a method writing the logic inside the method and by calling a method: 

Input a year: 2017 

Expected Output:
false

Methods:
-------------
name : findLeapYear
returnType : void 
methodType : static
parameterType: No argument

Note: [Take the test data value as the local variable inside the method as long type]
*/

class FindLeapYear  
{
	static void findLeapYear()
	{
		int year=2007;
		boolean res=false;
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			res=true;
			System.out.println(res);
			return;
		}
		System.out.println(res);
		
	}
	public static void main(String[] args) 
	{
		findLeapYear();
	}
}

/*Write a Java method to compute the average of three numbers,
by creating a method writing the logic inside the method and by calling a method: 

Test Data:
Input the first number: 25.0
Input the second number: 45.0
Input the third number: 65.0

Expected Output:
The average value is 45.0

Methods:
-------------
name : findAverage 
returnType : void 
methodType : static
parameterType: No argument

Note: [Take the test data value as the local variable inside the method as float type]
*/
class FindAverage  
{
	static void findAverage()
	{
		float a=25.0f,b=45.0f,c=65.0f,avg=0;
		avg=(a+b+c)/3.0f;
		
		System.out.println("The average value is : "+avg);
	}
	public static void main(String[] args) 
	{
		findAverage();
	}
}

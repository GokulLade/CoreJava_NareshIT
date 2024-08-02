/*Que->
________________
Write a Java method to find the smallest number among three numbers.
by creating a method writing the logic inside the method and by calling a method: 

Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29

Expected Output:
The smallest value is 25

Methods:
-------------
name : findSmallest
returnType : void 
methodType : static
parameterType: No argument

Note: [Take the test data value as the local variable inside the method as int type]
*/
class  FindSmallNumber
{
	static void findSmallest()
	{
		int a=25,b=37,c=29;
		
		if(a==b && b==c){
			System.out.println("Both are same");
		}
		else if(a<b && a<c)
		{
			System.out.println("The Smallest number is "+ a);
		}
		else if(b<a && b<c)
		{
			System.out.println("The Smallest number is "+ b);
		}
		else {
			System.out.println("The Smallest number is "+ c);
		}
	}
	public static void main(String[] args) 
	{
		findSmallest();
		
	}
}

/*1. WAP to store two integers and display the following:
   a. addition
   b. difference
   c. product
*/

class OperationOnNumber
{
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		System.out.println("Addition of two Number is : "+(num1+num2));
		System.out.println("Difference of two Number is : "+(num1-num2));
		System.out.println("Product of two Number is : "+(num1*num2));
	}
}

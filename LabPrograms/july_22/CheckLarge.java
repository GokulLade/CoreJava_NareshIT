/*WAP to store two integers and display the  largest of two numbers.
*/
class CheckLarge 
{
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		System.out.println((num1>num2)?"First Number is Greater":(num2>num1)?"Second number is Greater":"Both are same");
	}
}

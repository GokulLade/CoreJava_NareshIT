/*WAP to store a number and check the given number is even or odd*/
class CheckOddEven 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		
		if(num==0){
			System.out.println("Number is Zero..!");
		}
		else if(num%2==1){
			System.out.println("Odd Number..!");
		}
		else{
			System.out.println("Even Number..!");
		}
	}
}

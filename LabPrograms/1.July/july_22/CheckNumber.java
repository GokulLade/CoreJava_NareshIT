/* WAP to store a number and check whether number is positive or negative.*/
class CheckNumber 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		
		if(num<0){
			System.out.println("Negative Number..!");
		}
		else if(num>0){
			System.out.println("Positive Number..!");
		}
		else{
			System.out.println("Number is Zero..!");
		}
	}
}

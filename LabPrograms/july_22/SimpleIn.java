/*WAP to store principal,rate of interest and time.Calculate
   and display the simple interest.
*/

class SimpleIn 
{
	public static void main(String[] args) 
	{
		int pricipal=Integer.parseInt(args[0]);
		int rate=Integer.parseInt(args[1]);
		int time=Integer.parseInt(args[2]);
		
		System.out.println("Pricipal Amount is : "+pricipal);
		System.out.println("Rate of Intrest is : "+rate);
		System.out.println("Time is            : "+time+"Year");
		
		System.out.println("Simple Instrest is : "+((pricipal*rate*time)/100));
	}
}

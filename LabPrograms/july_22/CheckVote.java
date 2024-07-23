/*WAP to storea candiadte's age and check whether a candidate is eligible for voting or not.*/

class CheckVote
{
	public static void main(String[] args) 
	{
		int age=Integer.parseInt(args[0]);
		
		if(age>18){
			System.out.println("Eligiable..!");
		}
		else{
			System.out.println("Not Eligiable..!");
		}
	}
		
}

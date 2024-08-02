/*Q6. Write the program in Java to display the following pattern:
1 3 5 7 9
1 3 5 7
1 3 5
1 3
1*/
class Pattern6 
{
	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--){
			int a=1;
			for(int j=1;j<=i;j++,a+=2){
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}

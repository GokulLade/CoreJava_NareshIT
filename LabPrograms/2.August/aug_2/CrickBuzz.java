/*Que-1
____________
Create a Java program that manages and displays details about a cricket player. Your program should include the following functionalities:

A class named CrickBuzz.
--------------------------
A method named assignDetail that takes the following parameters:
String name: The name of the player.
int totalRun: The total runs scored by the player.
int jersyNo: The jersey number of the player.
int matches: The number of matches played by the player.
String sportsName: The name of the sport. 
String countryName: The name of the country
Inside the assignDetail method:
 Verifications
___________________
|- if the totalRun is greater than zero 
|- if the jersyNo is greater than zero 
|- if the sports name is cricket then only 
   calculate the player's average runs by dividing totalRun by matches.
   Call another method displayDetail() to display the player's details, including the calculated average.
   If sportsName is not "cricket", print "This app is for showing the cricket player details".

A method named displayDetail that takes the following parameters:
----------------------------------------------------------------
String name: The name of the player.
int totalRun: The total runs scored by the player.
int jersyNo: The jersey number of the player.
int matches: The number of matches played by the player.
int average: The average runs scored by the player.
This method should print the player's details in a formatted manner.

A main method that creates an instance of Program04 and calls the assignDetail method with appropriate 
arguments to demonstrate the functionality.

Input as :
assignDetail("virat", 400,18, 5,"cricket");

Output as:
The name of the player :virat
The totalRun of the player :400
The jesryNo of the player :18
The matches played :5
The avergae of the player :80
---------------------------------------------------------------------------------------------------------------
*/

class CrickBuzz 
{
	public void assignDetail(String name,int totalRun,int jersyNo,int matches,String sportsName,String countryName){
		int avg=0;
		CrickBuzz c=new CrickBuzz();
		if(totalRun>0 && jersyNo>0 && sportsName.equals("cricket"))
		{
			avg=totalRun/matches;
			
			c.displayDetail(name,totalRun,jersyNo,matches,avg);
		}
		
	}
	
	public void displayDetail(String name,int totalRun,int jersyNo,int matches,int avg){
		System.out.println("The name of the player: "+name);
		System.out.println("The totalRun of the player: "+totalRun);
		System.out.println("The jesryNo of the player: "+jersyNo);
		System.out.println("The matches played: "+matches);
		System.out.println("The avergae of the player: "+avg);
	}
	public static void main(String[] args) 
	{
		CrickBuzz c1=new CrickBuzz();
		c1.assignDetail("virat", 400,18, 5,"cricket","Indai");
	}
}

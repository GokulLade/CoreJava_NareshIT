/*Write Java methods to calculate triangle area.
by creating a method writing the logic inside the method and by calling a method: 

Expected Output:

Input Side-1: 10.00                                                                           
Input Side-2: 15.00                                                                             
Input Side-3: 20.00    
                                                                         
The area of the triangle is 72.6184377413890

Methods:
-------------
name : findLeapYear
returnType : void 
methodType : static
parameterType: No argument

Note: [Take the test data value as the local variable inside the method as double type]
*/
class FindTriangleArea 
{
	static void findTriangleArea()
	{
		double side1=10.00,side2=15.00,side3=20.00,area=0,s=0;
		
		s=(side1+side2+side3)/2;
		
		area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.println(area);
	}
	public static void main(String[] args) 
	{
		findTriangleArea();
	}
}

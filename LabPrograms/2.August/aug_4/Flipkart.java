
/*You are required to create a Flipkart class that simulates a simple e-commerce shopping cart with 
specific focus on clothes and mobile purchases. The class should contain methods to add items to the cart, 
calculate prices with discounts, and print the bill. 

Below are the detailed requirements for the methods:

> clothes(String product, String companyName, String type, int quantity):
---------------------------------------------------------------------------
This method is responsible for adding clothes to the cart.

Parameters:
=============
> product: The name of the product (should be "clothes").
> companyName: The name of the company (should be "Nike" or "Reebok").
> type: The type of clothes (should be "T-shirt" or "shoes").
> quantity: The quantity of the clothes.

Verifications
---------------
If the type and companyName match the allowed values, 
> CompanyName should be only "Nike" and "Reebok"
> type should be only "clothe"

call buyNowforClothes(type, quantity) to calculate the total price 
and then call bill(product, companyName, type, quantity, price) to print the bill. Otherwise, print "This product is not available!!".


> mobile(String product, String companyName, int quantity):
------------------------------------------------------------------
This method is responsible for adding mobile phones to the cart.

Parameters:
-------------
> product: The name of the product (should be "mobile").
> companyName: The name of the company (should be "Apple" or "Samsung").
> quantity: The quantity of the mobile phones.

If the product and companyName match the allowed values, 
> product will be "phone"
> companyName will be "Apple" and "sumsung"

call buyNowforMobile(companyName, quantity) to calculate the total price and then 
call bill(product, companyName, companyName, quantity, price) to print the bill.
Otherwise, print "This product is not available!!".


> buyNowforClothes(String type, int quantity):
--------------------------------------------------------------------------------
This method calculates the total price for clothes with discounts.
Parameters:
type: The type of clothes ("T-shirt" or "shoes").
quantity: The quantity of the clothes.
Returns:
The total price after discount.
Discounts:
T-shirt: 10% off on Rs. 500 each.
Shoes: 5% off on Rs. 1000 each.


> buyNowforMobile(String companyName, int quantity):
--------------------------------------------------------------------------------
This method calculates the total price for mobile phones with discounts.
Parameters:
companyName: The name of the company ("Apple" or "Samsung").
quantity: The quantity of the mobile phones.
Returns:
The total price after discount.
Discounts:
Apple: 20% off on Rs. 40,000 each.
Samsung: 25% off on Rs. 30,000 each.

> bill(String product, String companyName, String type, int quantity, double price):
------------------------------------------------------------------------------------
This method prints the bill for the purchased product.
Parameters:
product: The name of the product.
companyName: The name of the company.
type: The type of the product.
quantity: The quantity of the product.
price: The total price after discount.

public static void main(String[] args):
--------------------------------------------------------------------------------------
This method is the entry point of the program.
It should create an object of the Flipkart class and test the functionality by 
calling the clothes and mobile methods with appropriate arguments.*/

class Flipkart
{
	//This method is responsible for adding clothes to the cart.
	public static void clothes(String product, String companyName, String type, int quantity)
	{
		if(companyName.equals("Nike") || companyName.equals("Reebok") && type.equals("clothe"))
		{
			int price=buyNowforClothes(type, quantity);
			System.out.println(price);
			//bill(product,companyName,type,quantity,price);
		}
		else
		{
			System.out.println("This product is not available!!");	
		}
	}
	
	//This method is responsible for adding mobile phones to the cart.
	public static void mobile(String product, String companyName, int quantity)
	{
		if(product.equals("phone") && companyName.equals("Apple") || companyName.equals("Apple"))
		{
			int price=buyNowforMobile(companyName, quantity);
			System.out.println(price);
			//bill(product,comapanyName, quantity,price);
		}
		else
		{
			System.out.println("This Product is not available");
		}
	}
	
	public static int buyNowforClothes(String type, int quantity)
	{
		int tshirtPrice=500;
		int shoesPrice=300;
		int price=0;
		if(type.equals("T-shirt")) price=tshirtPrice*quantity;
		else price=shoesPrice*quantity;
		
		return price;
	}
	
	public static int buyNowforMobile(String companyName, int quantity)
	{
		int applePrice=40000;
		int samsungPrice=30000;
		int price=0;
		
		if(companyName.equals("Apple")) price=applePrice*quantity;
		else price=samsungPrice*quantity;
		
		return price;
	}
	
	public void bill(){
		
	}
	public static void main(String[] args) 
	{
		clothes("t-shirt", "Nike", "cloths", 5);
		mobile("Mobile", "Apple", 7);
	}
}

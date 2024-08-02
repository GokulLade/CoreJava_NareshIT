/*Que-3
____________
Write a Java program that includes a method to print characters in a specified range, with a specified number of characters per line. Your program should include the following:

A main method that calls a method print_Chars().
The print_Chars method should take three parameters:
char char1: The starting character.
char char2: The ending character.
int n: The number of characters to print per line.

The print_Chars method should print all characters from char1 to char2 inclusive,
with each line containing at most n characters. After every n characters, 
the method should print a newline.

For example, calling print_Chars('(', 'z', 20) should output the characters from '(' to 'z' with 20 characters per line.

Implement this functionality in a class named Program03.

Input as:
________________
Calling method as:   print_Chars('(', 'z', 20);

Solution as:
_________________
( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;                                                                       
< = > ? @ A B C D E F G H I J K L M N O                                                                       
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c                                                                       
d e f g h i j k l m n o p q r s t u v w                                                                       
x y z*/

class PrintChar
{
	public void print_Chars(char char1,char char2, int n){
		
		int count=0;
		while(char1<='z')
		{
			System.out.print(char1+" ");
			char1++;
			count++;
			if(count==n)
			{
				System.out.println();
				count=0;
			}
		}
		
	}
	public static void main(String[] args) 
	{
		PrintChar pc=new PrintChar();
		pc.print_Chars('(','z',20);
	}
}

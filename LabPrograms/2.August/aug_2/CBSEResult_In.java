/*Que-2
_____________________________
Create a Java class named CBSEResult_In that accepts and processes details of a student and calculates their grade based on their marks in five subjects. The class should contain methods to accept details, calculate the grade, and display the details and the calculated grade.

The method acceptDetailAndSubmit should accept the following parameters:
-------------------------------------------------------------------------
studentName (String): The name of the student.
rollNo (long): The roll number of the student.
schoolRegNo (String): The registration number of the school.
schoolName (String): The name of the school.
gender (char): The gender of the student.
citizenShip (String): The citizenship of the student.
board (String): The education board of the student.

Verification
___________________________________________________________
The program should check if the schoolRegNo is "CBSE01-100",
The citizenShip is "INDIA" (case insensitive),
and the board is "CBSE".
If these conditions are met, it should assign specific marks to the subjects:

If match
---------------------
Math: 90
Science: 85
English: 50
Social Science (sst): 90
Physical Education: 100

And after that it will call the method inside this method name as calculateGrade()
|- having 5 subject marks as parameter 
|- return type char 
|- method type non static 
|- modifier as public 

It should then calculate the average marks and assign a grade based on the following criteria:
----------------------------------------------------------------------------------------------
A: 80 < average <= 100
B: 60 < average <= 80
C: 40 < average <= 60
F: average <= 40

THIS METHOD WILL RETURN BACK THE GRADE TO THE CALLING PLACE AND THEN THE NEXT METHOD WILL ALL THE DETAILS 
OF THE STUDENT AND ALL SUBJECTS MARKS AND WITH THE GRADE WILL BE CALLED WHICH IS NAME AS 
|- DisplayDetails()
   |- Having the parameter as student details ,5 subject marks and grade 
   |- return type will be void 
   |- method type Non static 
   |- modifier as public 


Finally, the program should display the student details, marks, and the grade
If the conditions are not met, it should print an message.

Example
Given the following input:

INPUT AS:
____________________
studentName = "mahi"
rollNo = 00000007
schoolRegNo = "CBSE01-100"
schoolName = "DAV"
gender = 'M'
citizenShip = "INDIA"
board = "CBSE"

The expected output should be:
-------------------------------------------
The name of student : mahi
The rollNo : 7
The schoolRegNo  : CBSE01-100
The SchoolName : DAV
Gender : M
Citizenship : INDIA
Board : CBSE
_____________________________________________
==========Marks=================
                 Math || 90
                 Science || 85
                 English || 50
                 SocialScience || 90
                 PHE || 100
===================================
=============GRADE==================
THE TOTAL MARKS AS GRADE IS  A

-----------------------------------------------------------------
If the conditions are not met, the output should be:

The form submission not accepted
-------------------------------------------------------------------------------------------*/
class CBSEResult_In {
	public void acceptDetailAndSubmit(String studentName, long rollNo, String schoolRegNo, String schoolName,
			char gender, String citizenship, String board) {

		CBSEResult_In cbse = new CBSEResult_In();

		if (schoolRegNo.equals("CBSE01-100") && citizenship.equals("INDIA") && board.equals("CBSE")) {
			int math = 90, science = 85, english = 50, socialScience = 90, physicalEducation = 100;

			char g = cbse.calculateGrade(math, science, english, socialScience, physicalEducation);

			cbse.displayDetails(studentName, rollNo, schoolRegNo, schoolName, gender, citizenship, board, math, science,
					english, socialScience, physicalEducation, g);
		} else {
			System.out.println("The form submission not accepted");
		}
	}

	public char calculateGrade(int math, int science, int english, int socialScience, int physicalEducation) {
		int avg = (math + science + english + socialScience + physicalEducation) / 5;
		char grade = 'F';
		if (avg > 80 && avg <= 100) {
			grade = 'A';
		} else if (avg > 60 && avg <= 80) {
			grade = 'B';
		} else if (avg > 40 && avg <= 60) {
			grade = 'C';
		} else if (avg <= 40) {
			grade = 'F';
		}

		return grade;

	}

	public void displayDetails(String studentName, long rollNo, String schoolRegNo, String schoolName, char gender,
			String citizenship, String board, int math, int science, int english, int socialScience,
			int physicalEducation, char g) {

		System.out.println("The name of student : " + studentName);
		System.out.println("The rollNo :" + rollNo);
		System.out.println("The schoolRegNo  :" + schoolRegNo);
		System.out.println("The SchoolName : " + schoolName);
		System.out.println("Gender : " + gender);
		System.out.println("Citizenship :" + citizenship);
		System.out.println("Board :  " + board);

		System.out.println("-----------------------------------------------------");
		System.out.println("=========================Marks=======================");
		System.out.println("Math :  " + math);
		System.out.println("Science :  " + science);
		System.out.println("English :  " + english);
		System.out.println("Social Science :  " + socialScience);
		System.out.println("Physical Education :  " + physicalEducation);

		System.out.println("-----------------------------------------------------");
		System.out.println("==========================GRADE======================");
		System.out.println("THE TOTAL MARKS AS GRADE IS " + g);

	}

	public static void main(String[] args) {
		CBSEResult_In cb = new CBSEResult_In();
		cb.acceptDetailAndSubmit("Gokul", 000007, "CBSE01-100", "DAV", 'M', "INDIA", "CBSE");
	}
}

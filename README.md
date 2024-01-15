# OIBSIP-LibraryManagement
This repository contains the Library Management code developed for 
the JavaDevelopment Internship conducted by Oasis Infobyte

THE LIBRARY MANAGMENT

The library management project is developed with Javanetbeans 17 and connected to the database using xampp.
This mainly focusses on the administration side as well as userside

ADMIN SIDE
Page 1: Login page
	The login name is admin and password is admin123.
	When there are empty fields, it asks to fill in the details.
	When the password or admin name does not match the declared ,then it results in unauthorized access.

Page 2: Admin Home Page
	There are four buttons add reader,add book,issue book ,return book and logout
Page 3:Add Reader page
	It asks for user name,their profession, their area of interest and their contact details.
 	When fields are empty it asks for you to fill in the details and check the contact details too.
	If correct it is inserted into the table 'register' of database 'lib'.
Page 4: Add book
        It asks for the book name,their id ,the author ,the genre and the published year.
	Once all fields are entered it is inserted into the database 'book'.
	In the table present in this page ,the database contents is viewed using the fetch button.
Page 5: Issue book
	There is a table that displays the book details.
	Once the readerid is entered and searched using the searchbutton and  details are displayed if it is a valid id.
        The required book id is choosen and the issue date and due date is choosen using the JCalender.
	The data is entered only if it  has a valid bookid and readerid.
Page 6:Return book
	There are two tables one for displaying the issued books and the other for the returned books.
	The book to be returned is selected from the issue book table and the contents are automatically filled and the issue date is changed as 'returned'
        to denote that the book is returned and inserted into 'returnbk' table of the database.
Page 7:Fine details
	This page issues fine for the book not returned , lost, damaged pages with amount according to the defect
Logout:
	The logout button logsout to the adminlogin page.

USERSIDE:

Page 1: Login page
	The login name and password is retrieved from the usereg table in lib database
	When there are empty fields, it asks to fill in the details.
	When the password or username does not match the declared ,then it results in validaccess.
Page 2 :Registration Page
	If user is not registered ,he/she shouuld firt register and then perform 
	the login
Page 3 :User Homepage
	 In this page there are three buttons  statistic,issue and return book
Page 4: Statistic page
	In this page user has to provide his/her readerid to get the details such as his/her borrowed,returned and fine details
Page 5:Issue book
	In this page the user can perform search to search the book and just click on the  book to  select it and  then provide with the issue  date and the 	
	due date is automatically generated
Page 6:Return book
	In this page user can return his/her book by just selecting the issued book and then click return to return the book











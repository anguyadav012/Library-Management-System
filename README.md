LibrayManagementSystem
This is core java console base project. We are creating library Management System. In this project we are adding book, remove book, update book and fetch Book. for this project we are using MVC(Model-View-Controller) architecture. The Model-View-Controller (MVC) architecture is a design pattern that separates an application into three interconnected components, allowing for better organization and maintenance of code. Here's a brief overview of each component:

Model: Represents the application's data and business logic. Manages data and notifies observers (views) about changes. Independent of the user interface. Examples in a library management system could include classes for books and Library

View: Displays the data from the model to the user. Observes changes in the model and updates the user interface accordingly. Sends user input to the controller. Examples in a library management system could include the user interface elements, such as displaying a list of books..

Controller: Handles user input and updates the model and view accordingly. Acts as an intermediary between the model and view, facilitating communication. Processes user actions and invokes appropriate methods in the model. Examples in a library management system could include handling the issuance or return of books.

Entities : present inside Model Book - Includes bookName , bookAuther and bookPrice Library - Includes libraryName , libraryAddress and Pincode

Methods -: present inside Controller addBook() : to add book in LibraryList removeBook() : to remove book from LibraryList getBook() : to get respective Book from LibraryList update() : to update book according to user choice (by book name , Author name , Book Price)

View View is taking all inputs from the user it is nothing but user interaction. We are 4 operations in this project using switch case 1.Add Book For adding book we ask user for Book name ,author name and book price

Remove Book For deleting book we ask user for book name to delete

Update Book For updating book we ask user as per book name, author name and book price and update it

Fetch Book For fetching book we ask user to book name and display the whole details of that book.

OUTPUT -:

Starting window :
we are adding Library Details

![image](https://github.com/anguyadav012/Library-Management-System/assets/99881114/fe3aa519-b71e-4551-b8d4-26d4a14c007b)


To Add book

To add a book we taking input from user such as book name, Author name, book price

![image](https://github.com/anguyadav012/Library-Management-System/assets/99881114/60e86bb1-589b-4816-999d-ac6b43eb00f2)




To fetch book
enter the book name and we fetch the all details of book
![image](https://github.com/anguyadav012/Library-Management-System/assets/99881114/ec02a61e-e268-441f-b9e2-ef9f1a2555a6)



update Book
update book as per book name , author name and book price
![image](https://github.com/anguyadav012/Library-Management-System/assets/99881114/a2fee677-6510-4985-85d4-5580e6266109)




Delete Book
![image](https://github.com/anguyadav012/Library-Management-System/assets/99881114/5105a411-9d56-42f7-aeef-e888292086d6)




Java
100.0%
Footer
© 2024 G



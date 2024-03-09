package com.jsp.view;

import java.util.Scanner;

import com.jsp.model.Book;
import com.jsp.model.Library;
import com.jsp.model.Book;
import com.jsp.model.Library;

public class view {
	private static Library library = new Library();
	static Controller controller = new Controller();

	public static Library getLibrary() {
		return library;
	}

	public static void setLibrary(Library library) {
		view.library = library;
	}

	static Scanner myInput = new Scanner(System.in);
	static {
		System.out.println("------Welcome to LMS-w------");
		System.out.println("Enter name of library : ");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		//
		System.out.println("Enter address of library : ");
		library.setLibraryAddress(myInput.nextLine());
		System.out.println("Enter pincode : ");
		library.setPincode(myInput.nextInt());
		myInput.nextLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Name : "+library.getLibraryName());
//		System.out.println("Address : " +library.getLibraryAddress());
//		System.out.println("pincode : " +library.getPincode());
//		
		do {
			System.out.println("select option to perform");
			System.out.println("1.add book\n2.Remove\n3.Update book\n4.Get book\n0.Exist");
			System.out.print("Enter digit recpective to desire option :");
//			myInput.nextLine();
			byte userChoice = myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("-----EXITED------");
				System.exit(0);

				break;
			case 1:
				Book book = new Book();
				System.out.print("Enter book name :");
				book.setBookName(myInput.nextLine());
				System.out.print("Enter Auther name :");
				book.setBookAuther(myInput.nextLine());
				System.out.print("Enter the price :");
				book.setBookprice(myInput.nextDouble());
				myInput.nextLine();
				controller.addBook(book);
				System.out.println("Successfully added");
				break;
			case 2:
				System.out.println("Enter the book name to be removed : ");
				String bookToRemove = myInput.nextLine();
				// controller.removeBook(bookToRemove
				if ((controller.removeBook(bookToRemove))) {
					System.out.println("Requested book has  been remove :");

				} else {
					System.out.println("Book does not exist");
				}

				break;
			case 3:
				System.out.println("Enter book name to update :");
				Book BookUpdate = controller.getBook(myInput.nextLine());
				if (BookUpdate != null) {// Book exist
					System.out.println("What to update :");
					System.out.println("1. Book name\n2.Auther name\n3.Book Price");
					System.out.println("Enter digit respective to desire option :");
					byte updateChoice = myInput.nextByte();
					myInput.nextLine();
					switch (updateChoice) {
					case 1:
						System.out.println("Enter book name to update :");
//						String newBookName = myInput.nextLine();
						BookUpdate.setBookName(myInput.nextLine());
						break;
					case 2:
						System.out.println("Enter auther name to update :");
						String newAutherName = myInput.nextLine();
						BookUpdate.setBookAuther(newAutherName);
						break;
					case 3:
						System.out.println("Enter the new price to update : ");
						double newBookPrice = myInput.nextDouble();
						myInput.nextLine();
						BookUpdate.setBookprice(newBookPrice);
						break;
					default:
						System.out.println("Enter the valid operation : ");
						break;
					}

				} else {

				}

				break;
			case 4:
				System.out.println("Enter book name you are looking for : ");
				Book fetchedBook1 = controller.getBook(myInput.nextLine());
				if (fetchedBook1 != null) {
					System.out.println("Book is available.");
					System.out.println("Details : ");
					System.out.println(fetchedBook1);
				} else {
					System.out.println("Book not available.");
				}

				break;

			default:
				System.out.println("Invalid selection");
				break;
			}

		} while (true);

	}

}

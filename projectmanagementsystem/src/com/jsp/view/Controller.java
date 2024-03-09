package com.jsp.view;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import com.jsp.model.Book;
import com.jsp.model.Library;

public class Controller {
	private static Library library=view.getLibrary();
	
	public void addBook(Book book) {
		List<Book> books = library.getBooks();
		if( books==null) {// for add book
			books=new ArrayList<>();//we created new arrayList for BokList
			
		}
		books.add(book);//add book new temp		
		library.setBooks(books);//book is added in main library
	}
	public Book getBook(String bookName) {
	List<Book> books = library.getBooks();
		if(books!=null) {//List of book exist
			for(Book book : books) {
				if(book.getBookName().equalsIgnoreCase(bookName));
				return book;
			}
		}
		return null;
		}
	 public boolean update(Book bookExists, Book bookUpdate) {
		 List<Book> books = library.getBooks();
		 for (Book book : books) {
			if (book.getBookName().equalsIgnoreCase(bookExists.getBookName())) {
				books.remove(bookExists);
				books.add(bookUpdate);
				library.setBooks(books);
				return true;
			}
		}
		return false;
	 }


	
	public boolean removeBook(String BookName) {
		 Book book= getBook(BookName);
		if (book!=null) {//book exist
			List<Book> books = Library.getBooks();
			boolean remove = books.remove(book);
			library.setBooks(books);//delete the book and update in library bookList
			return true;
			
		}
		return false; 
	}
	 
	
}

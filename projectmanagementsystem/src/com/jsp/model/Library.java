package com.jsp.model;

import java.util.List;

public class Library {
	private String libraryName;
	private String libraryAddress;
	private int pincode;
	private static List<Book> books;
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryAddress() {
		return libraryAddress;
	}
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public static List<Book> getBooks() {
		return books;
	}
	public  void setBooks(List<Book> books) {
		this.books = books;
	}	

}

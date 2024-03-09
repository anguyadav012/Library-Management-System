package com.jsp.model;

public class Book {
	private String bookName;
	private String bookAuther;
	private double bookPrice;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuther() {
		return bookAuther;
	}
	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}
	public double getBookprice() {
		return bookPrice;
	}
	public void setBookprice(double bookprice) {
		this.bookPrice = bookprice;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book Name = " +bookName+ "\nAuther Name= "+bookAuther+ "\nBook Price= "+bookPrice;
	}

}

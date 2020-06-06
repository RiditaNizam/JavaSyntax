package com.fdmgroup.bookShop;

public class Book {

	private String title;
	private String author;
	private String ISBC;
	private double price;
	private int numberOfPages;

	public Book() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBC() {
		return ISBC;
	}

	public void setISBC(String iSBC) {
		ISBC = iSBC;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

}

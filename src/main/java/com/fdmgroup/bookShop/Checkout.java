package com.fdmgroup.bookShop;

public class Checkout {
	public double calculatePrice(Book[] books) {
		double priceTotal = 0.0;
		for (int i = 0; i < books.length; i++) {
			priceTotal += books[i].getPrice();
		}
		return priceTotal;
	}
}

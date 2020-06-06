package com.fdmgroup.bookShop;

public class Client {

	public static void main(String[] args) {
		int pages = 100;

		// Book 1
		Book book1 = new Book();
		book1.setTitle("Head First Java");
		book1.setAuthor("O'Reilly");
		book1.setISBC("0596009208");
		book1.setPrice(25.99);
		book1.setNumberOfPages(720);

		// Book 2
		Book book2 = new Book();
		book2.setTitle("Java: How to Program");
		book2.setAuthor("Deitel");
		book2.setISBC("0131364839");
		book2.setPrice(29.99);
		book2.setNumberOfPages(1560);

		// Book 3
		Book book3 = new Book();
		book3.setTitle("Head First Design Patterns");
		book3.setAuthor("O’Reilly");
		book3.setISBC("0596007124");
		book3.setPrice(22.49);
		book3.setNumberOfPages(694);

		Book[] books = { book1, book2, book3 };

		Checkout myCheckout = new Checkout();

		double totalPrice = myCheckout.calculatePrice(books);

		System.out.println("Total price of books: " + totalPrice);

	}

}
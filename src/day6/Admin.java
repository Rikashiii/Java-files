package day6;

import java.util.ArrayList;

public class Admin {

	public static void main(String[] args) {
		ArrayList<Book> booklist = new ArrayList<>();
		booklist.add(new Book(123, "Harry Potter 1"));
		booklist.add(new Book(110, "Harry Potter 2"));
		booklist.add(new Book(280, "Harry Potter 3" ));
		booklist.add(new Book(134, "Harry Potter 4"));
	
		
		try {
			Library.addBook(booklist, new Book(134, "Harry Potter 4"));
		} catch (DuplicateBookException e) {
			System.out.println(e.getMessage());
			System.out.println("Try adding book with unique reg nos only");
		}
	}
}

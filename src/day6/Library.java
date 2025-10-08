package day6;

import java.util.ArrayList;

public class Library {
	
	public static void addBook(ArrayList<Book> books, Book book) throws DuplicateBookException
	{
		for(Book b : books)
		{
			if(book.getRegno() == b.getRegno())
			{
				throw new DuplicateBookException("Book with the same reg no exists");
			}
		}
		books.add(book);
	}

	
	
}

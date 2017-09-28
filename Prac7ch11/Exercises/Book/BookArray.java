package Book;

public class BookArray
{
	public static void main(String[] args)
	{
		Book[] books = new Book[10];

		for(int i = 0; i < 10; i++)
		{
			if(i % 2 == 0)
				books[i] = new Fiction("Fiction");
			else
				books[i] = new NonFiction("Non Fiction");
		}

		for(Book book : books)
		{
			System.out.println(book.getTitle());
			System.out.println(book.getPrice());
		}
	}
}

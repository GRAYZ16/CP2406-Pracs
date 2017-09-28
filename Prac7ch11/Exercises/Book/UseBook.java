package Book;

public class UseBook
{


	public static void main(String[] args)
	{
		Book fiction = new Fiction("Game Of Thrones");
		Book nonFiction = new NonFiction("Digital Systems Design");

		System.out.println(fiction.getTitle());
		System.out.println(fiction.getPrice());
		System.out.println(nonFiction.getTitle());
		System.out.println(nonFiction.getPrice());
	}

}

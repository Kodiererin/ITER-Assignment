package Dec_09;
public class Library 
{
	int size = 2;
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	private Book[] book = new Book[size];
	Library()
	{
//		Creating a Library of 10 Books
		for(int i=0 ; i<book.length; i++)
		{
			this.book[i] = new Book();
		}
	}
	public void addBook()
	{
//		Add elements here
		System.out.println("Enter The Book Details That you want to Add");
		for(int i=0 ; i<book.length ; i++)
		{
			System.out.println("Enter The Name Of The Book ");
			book[i].setName(sc.next());
			System.out.println("Enter Author Name, Email and  Qualification");
			book[i].setAuthor(sc.next(),sc.next(),sc.next());
			System.out.println("Enter Price Of the Book");
			book[i].setPrice(sc.nextDouble());
			System.out.println("Enter The ISBN of the Book");
			book[i].setISBN(sc.next());
		}
	}
	public void deleteBook()
	{
		System.out.println("Enter The ISBN Number of the Book That You want to Delete");
		String delete = sc.next();
		for(int i=0 ; i<book.length; i++)
		{
			if(delete.equals(book[i].getISBN()))
			{
				book[i] = book[i+1];
				this.size = size-1;
			}
		}
	}
	public void displayBook()
	{
		System.out.println("Showing the Books and Its Details");
		for(int i=0 ; i<size ; i++)
		{
			System.out.println(book[i].getName());
			System.out.println(book[i].getISBN());
			System.out.println(book[i].getPrice());
			System.out.println(book[i].getAuthor().getHighestQualification());
			System.out.println(book[i].getAuthor().getName());
			System.out.println(book[i].getAuthor().getEmail());
		}
	}
}

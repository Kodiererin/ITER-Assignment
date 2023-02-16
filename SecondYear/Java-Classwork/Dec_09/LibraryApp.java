package Dec_09;
public class LibraryApp 
{
	public static void main(String[] args) throws Exception
	{
		Library lib = new Library();
		System.out.println("Adding Elements to the Book");
		lib.addBook();
		lib.displayBook();
		System.out.println("Deleting The Book");
		lib.deleteBook();
		
		System.out.println("Finally The Library has");
		lib.displayBook();
	}
}

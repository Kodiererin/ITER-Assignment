package Jan_06;
import java.util.ArrayList;
import java.util.Collections;
class Books implements Comparable<Books>
{
	int bookId;
	String BookName;
	Books(int booksid , String name)
	{
		this.bookId = booksid;
		this.BookName = name;
	}
//	Prototype jo hota h compareTo function ka jo predefined hota h!
//	usi tarike se krna chaiye wrna naai hoga
	public int compareTo(Books b) {
//		Books b = (Books)o;
		if(this.bookId>b.bookId) return 1;
		else if(this.bookId<b.bookId) return -1;
		else return 0;
	}
	public String toString(Books b)
	{
		return ""+this.bookId+"    "+this.BookName;
	}
}
public class books_compareTo {
	public static void main(String[] args) {
		ArrayList<Books> al = new ArrayList<>();
		
		al.add(new Books(13 , "ABC"));
		al.add(new Books(26 , "ACV"));
		al.add(new Books(19 , "xyz"));
		
		Collections.sort(al);
		
		for(Books i : al)
		{
			System.out.println(i.toString(i));
		}
	}
}

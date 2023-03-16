package Dec_09;

class Author
{
	private String Name;
	private String Email;
	private String HighestQualification;
	Author(String name, String email, String qualification){
		this.Email = email;
		this.Name = name;
		this.HighestQualification = qualification;
	}
	public String getHighestQualification() {
		return HighestQualification;
	}
	public String getName() {
		return this.Name;
	}
	public String getEmail() {
		return this.Email;
	}
	
}
public class Book
{
	private String Name;
	private String ISBN;
	private Author author;
	private double price;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(String name, String email , String HighestQualification ) {
		this.author = new Author(name,email,HighestQualification);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

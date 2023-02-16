//	Write a Program to create book class having members Name and id of the Book.
//	Create a tree set of book object, insert some element into the Tree set , and display the first and last elemennt in the treeeset.
//	Also sear ch a particular object in the tree set.
package Jan13;
class Book implements Comparable{
	int id;
	String name;
	Book(String name , int id){
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Book s = (Book)o;
		if(this.id>s.id) {
			return 1;
		}
		else if(this.id<s.id) {
			return -1;
		}
		else
			return 0;
	}
	public int hashCode() {
		return this.id;
	}
	public boolean equalsTo(Object o,Object o2) {
		Book s = (Book)o;
		Book t = (Book)o2;
		return s.id==t.id;
	}
}
public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.TreeSet<Book> obj = new  java.util.TreeSet<>();
		obj.add(new Book("Atommic Habits",12112));
		obj.add(new Book("The Power Of subcousious Mind" , 123));
		obj.add(new Book("Begineers Java",112));
		
		for(Book b : obj) {
			System.out.println(b.name+" "+b.id);
		}	
		System.out.println("The First Book Name is "+obj.first().name);
		System.out.println("The Last Book Name is "+obj.last().name);
		
		System.out.println("Searching Book "+obj.contains(new Book("Atomic Habits ",12112)));
		System.out.println();
//		Checking the Duplicates 
		System.out.println("Checking Duplicates and Printing Books");
		obj.add(new Book("Atommic Habits",12112));
		for(Book b : obj) {
			System.out.println(b.name+" "+b.id);
		}
		
//		Remove the Book form the Library
		System.out.println("\nRemoving the Book");
		obj.remove(new Book("Atommic Habits",12112));
		System.out.println("Book Removed");
		
//		Is the Library Empty
		System.out.println("\nIs the Library Empty "+obj.isEmpty());
		
//		Checking the size of the Library
		System.out.println("\nWhat is the Size of of the Library "+obj.size());
	}

}


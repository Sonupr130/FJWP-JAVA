package collections;
import java.util.ArrayList;

public class Book {
	
       //Declare variable 
		private long bookId;
		private String bookName;
		private String authorName;
		
       //Create a parameterized constructor
		public Book (long bookId ,String bookName , String authorName ) {
			 
			 this.bookId = bookId;
			 this.bookName = bookName;
			 this.authorName = authorName;
		 }
		
		//Using get method 
		public long getBookId() {
			return bookId;
		}
		
		public String getBookName() {
			return bookName;
		}
		
		public String getAuthorName() {
			return authorName;
		}
	
public static void main(String []args) {
	
	ArrayList<Book> books = new ArrayList<>();
	
	//create book objects and add into arraylist
	Book book1 = new Book(78709, "Uncharted", "Raj Vishwakarma");
	Book book2 = new Book(95734, "Alone", "Akash Raj");
	
	books.add(book1);
	books.add(book2);
	
	//Using advance for loop display book details
	for(Book book : books) {
		System.out.println("Book ID: "+book.getBookId());
		System.out.println("Book Name: "+book.getBookName());
		System.out.println("Author Name: "+book.getAuthorName());
		System.out.println();
	}
  }
}

//----- OUTPUT------------------------------------------------------------
 
/*

Book ID: 78709
Book Name: Uncharted
Author Name: Raj Vishwakarma

Book ID: 95734
Book Name: Alone
Author Name: Akash Raj

*/
 

 


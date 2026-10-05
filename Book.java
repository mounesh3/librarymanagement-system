package library_management;

public class Book {
	int BookId;
	String BookName;
	String BookAuthor;
	Boolean BookAvailable=true;
	public Book(int bookid, String bookname, String bookAuthor) {
		BookId = bookid;
		BookName = bookname;
		BookAuthor = bookAuthor;
	}
	public void issueBook() {
	    if (BookAvailable) {
	        BookAvailable = false;
	        System.out.println("Book issued successfully");
	    } else {
	        System.out.println("Book is already issued");
	    }
	}
	public void returnBook() {
	    if (!BookAvailable) {
	        BookAvailable = true;
	        System.out.println("Book returned sucessfully");
	    } else {
	        System.out.println("Book is already available");
	    }
	}

}

package library_management;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
	ArrayList<Book> books=new ArrayList<Book>();
	Map<String, Book> issuedBooks = new HashMap<>();
	Map<String, Issuerecord> issueRecords = new HashMap<>();
	public void addbook(Book book) {
		books.add(book);
	}
	public void displayBook() {

	    if (books.isEmpty()) {
	        System.out.println("No books available in the library.");
	        return;
	    }

	    System.out.println("\n===== BOOK LIST =====");

	    for (Book b : books) {

	        System.out.println(
	            "Book ID: " + b.BookId +
	            " | Book Name: " + b.BookName +
	            " | Author: " + b.BookAuthor +
	            " | Available: " + b.BookAvailable
	        );
	    }
	}
	public void searchBooks(String bookname) {
	    boolean found = false;

	    for(Book b : books) {
	        if(b.BookName.equalsIgnoreCase(bookname)) {
	            System.out.println("Book ID: " + b.BookId
	                    + " | Book Name: " + b.BookName
	                    + " | Author: " + b.BookAuthor
	                    + " | Available: " + b.BookAvailable);

	            found = true;
	        }
	    }

	    if(!found) {
	        System.out.println("Book not found.");
	    }
	}
	public void issueBook(Student student, int bookid) {

	    for (Book b : books) {

	        if (b.BookId == bookid) {

	            if (b.BookAvailable) {

	                b.issueBook();

	                issuedBooks.put(student.getStudentName(), b);

	                Issuerecord record = new Issuerecord(student, b);

	                issueRecords.put(student.getStudentName(), record);

	            } else {

	                System.out.println("Book is already issued.");
	            }

	            return;
	        }
	    }

	    System.out.println("Book ID not found.");
	}
	public void returnBook(Student student) {

	    Book b = issuedBooks.get(student.getStudentName());

	    if (b != null) {

	        b.returnBook();

	        issuedBooks.remove(student.getStudentName());

	    } else {

	        System.out.println(
	            "ERROR: No issued book found for student: "
	            + student.getStudentName()
	        );
	    }
	}
	public void displayIssueRecord(Student student) {

	    Issuerecord record =
	            issueRecords.get(student.getStudentName());

	    if (record != null) {

	        System.out.println("\n======= ISSUE DETAILS =======");

	        record.displayRecord();

	        System.out.println("=============================");

	    } else {

	        System.out.println("\nERROR: No issue record found for student: "
	                + student.getStudentName());
	    }
	}

}
package library_management;

import java.time.LocalDate;

public class Issuerecord {
	Student student;
    Book book;
    LocalDate issueDate;
    LocalDate dueDate;

    public Issuerecord(Student student, Book book) {
        this.student = student;
        this.book = book;
        this.issueDate = LocalDate.now();
        this.dueDate = issueDate.plusDays(14);
    }
    public void displayRecord() {
        System.out.println("Student: " + student.getStudentName());
        System.out.println("Book: " + book.BookName);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Due Date: " + dueDate);
    }

}

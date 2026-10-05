package library_management;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        boolean running = true;

        while (running) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. View Issue Details");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String bookName = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    Book book = new Book(bookId, bookName, author);

                    library.addbook(book);

                    System.out.println("Book added successfully!");

                    break;

                case 2:

                    library.displayBook();

                    break;

                case 3:

                    sc.nextLine();

                    System.out.print("Enter Book Name to search: ");
                    String searchBook = sc.nextLine();

                    library.searchBooks(searchBook);

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String studentName = sc.nextLine();

                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();

                    Student student =
                            new Student(studentId, studentName);

                    library.issueBook(student, issueBookId);

                    break;

                case 5:

                    System.out.print("Enter Student ID: ");
                    int returnStudentId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String returnStudentName = sc.nextLine();

                    Student returnStudent =
                            new Student(
                                    returnStudentId,
                                    returnStudentName
                            );

                    library.returnBook(returnStudent);

                    break;

                case 6:

                    System.out.print("Enter Student ID: ");
                    int detailStudentId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String detailStudentName = sc.nextLine();

                    Student detailStudent =
                            new Student(
                                    detailStudentId,
                                    detailStudentName
                            );

                    library.displayIssueRecord(detailStudent);

                    break;

                case 7:

                    running = false;

                    System.out.println(
                            "Thank you for using the Library Management System!"
                    );

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }

}

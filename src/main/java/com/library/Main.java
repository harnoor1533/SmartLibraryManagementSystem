package com.library;
import com.library.model.Book;
import java.util.Scanner;
import com.library.service.LibraryService;
import com.library.model.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryService libraryService = new LibraryService();

        while (true) {
            System.out.println("\n===============================");
            System.out.println(" SMART LIBRARY MANAGEMENT SYSTEM");
            System.out.println("===============================");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Update");
            System.out.println("6.Add student");
            System.out.println("7 View Students");
            System.out.println("8 Search Student");
            System.out.println("9 Delete Student");
            System.out.println("10 Update Student");
            System.out.println("11 Issue Book");
            System.out.println("12 ViewIssuedBook");
            System.out.println("13 Exist");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();

                    Book book = new Book(
                            id,
                            title,
                            author,
                            category,
                            isbn,
                            quantity,
                            quantity
                    );

                    libraryService.addBook(book);
                    break;

                case 2:
                    libraryService.viewBooks();
                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();

                    libraryService.searchBook(searchId);

                    break;

                case 4:

                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = sc.nextInt();

                    libraryService.deleteBook(deleteId);

                    break;

                case 5:

                    System.out.print("Enter Book ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Title: ");
                    String newTitle = sc.nextLine();

                    System.out.print("New Author: ");
                    String newAuthor = sc.nextLine();

                    System.out.print("New Category: ");
                    String newCategory = sc.nextLine();

                    System.out.print("New ISBN: ");
                    String newIsbn = sc.nextLine();

                    System.out.print("New Quantity: ");
                    int newQuantity = sc.nextInt();

                    libraryService.updateBook(
                            updateId,
                            newTitle,
                            newAuthor,
                            newCategory,
                            newIsbn,
                            newQuantity
                    );

                    break;
                case 6:

                    System.out.print("Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Department: ");
                    String department = sc.nextLine();

                    Student student = new Student(
                            studentId,
                            name,
                            email,
                            phone,
                            department
                    );

                    libraryService.addStudent(student);

                    break;
                case 7:

                    libraryService.viewStudents();

                    break;
                case 8:

                    System.out.print("Enter Student ID: ");
                    int searchStudentId = sc.nextInt();

                    libraryService.searchStudent(searchStudentId);

                    break;
                case 9:

                    System.out.print("Enter Student ID to delete: ");
                    int deleteStudentId = sc.nextInt();

                    libraryService.deleteStudent(deleteStudentId);

                    break;
                case 10:

                    System.out.print("Enter Student ID to update: ");
                    int updateStudentId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("New Email: ");
                    String newEmail = sc.nextLine();

                    System.out.print("New Phone: ");
                    String newPhone = sc.nextLine();

                    System.out.print("New Department: ");
                    String newDepartment = sc.nextLine();

                    libraryService.updateStudent(
                            updateStudentId,
                            newName,
                            newEmail,
                            newPhone,
                            newDepartment
                    );

                    break;
                case 11:

                    System.out.print("Enter Student ID: ");
                    int issueStudentId = sc.nextInt();

                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();

                    libraryService.issueBook(issueStudentId, issueBookId);

                    break;
                case 12:
                    libraryService.viewIssuedBooks();

                    break;
                case 13:
                    System.out.println("Thank you");
                    return;


                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}


package com.library.service;

import com.library.model.Book;
import java.util.ArrayList;
import com.library.model.Student;
import com.library.model.IssueRecord;


public class LibraryService {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<IssueRecord> issuedBooks = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("\n✅ Book added successfully!");
    }

    // View Books
    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("\nNo books available.");
            return;
        }

        System.out.println("\n========= BOOK LIST =========");

        for (Book book : books) {
            System.out.println(book);
            System.out.println("----------------------------");
        }
    }

    // Search Book
    public void searchBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                System.out.println("\nBook Found!");
                System.out.println(book);
                return;
            }
        }

        System.out.println("\nBook not found!");
    }

    // Delete Book
    public void deleteBook(int bookId) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getBookId() == bookId) {

                books.remove(i);
                System.out.println("\nBook deleted successfully!");
                return;
            }
        }

        System.out.println("\nBook not found!");
    }

    public void updateBook(int bookId, String title, String author,
                           String category, String isbn, int quantity) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                book.setTitle(title);
                book.setAuthor(author);
                book.setCategory(category);
                book.setIsbn(isbn);
                book.setQuantity(quantity);
                book.setAvailableQuantity(quantity);

                System.out.println("\n✅ Book updated successfully!");
                return;
            }
        }

        System.out.println("\nBook not found!");
    }
    public void addStudent(Student student) {

        students.add(student);
        System.out.println("\n✅ Student added successfully!");
    }
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo students available.");
            return;
        }

        System.out.println("\n========= STUDENT LIST =========");

        for (Student student : students) {
            System.out.println(student);
            System.out.println("----------------------------");
        }
    }
    public void searchStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {

                System.out.println("\nStudent Found!");
                System.out.println(student);
                return;
            }
        }

        System.out.println("\nStudent not found!");
    }
    public void deleteStudent(int studentId) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentId() == studentId) {

                students.remove(i);
                System.out.println("\n✅ Student deleted successfully!");
                return;
            }
        }

        System.out.println("\nStudent not found!");
    }
    public void updateStudent(int studentId, String name, String email,
                              String phone, String department) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {

                student.setName(name);
                student.setEmail(email);
                student.setPhone(phone);
                student.setDepartment(department);

                System.out.println("\n✅ Student updated successfully!");
                return;
            }
        }

        System.out.println("\nStudent not found!");
    }
    public void issueBook(int studentId, int bookId) {

        Student foundStudent = null;
        Book foundBook = null;

        // Find Student
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                foundStudent = student;
                break;
            }
        }

        // Find Book
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                foundBook = book;
                break;
            }
        }

        // Check if Student exists
        if (foundStudent == null) {
            System.out.println("\nStudent not found!");
            return;
        }

        // Check if Book exists
        if (foundBook == null) {
            System.out.println("\nBook not found!");
            return;
        }

        // Check Availability
        if (foundBook.getQuantity() <= 0) {
            System.out.println("\nBook is not available!");
            return;
        }

        // Issue Book
        foundBook.setQuantity(foundBook.getQuantity() - 1);

        IssueRecord record = new IssueRecord(studentId, bookId);
        issuedBooks.add(record);

        System.out.println("\n✅ Book issued successfully!");
    }
    public void viewIssuedBooks() {

        if (issuedBooks.isEmpty()) {
            System.out.println("\nNo books have been issued.");
            return;
        }

        System.out.println("\n========= ISSUED BOOKS =========");

        for (IssueRecord record : issuedBooks) {
            System.out.println(record);
            System.out.println("----------------------------");
        }
    }

}
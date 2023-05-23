package com.takinglibrarymanagementfurther;

import java.util.ArrayList;
import java.util.List;

public class User {

    public String name;
    public String libraryCardNumber;
    public List<Book> loanedBooks;

    public User(String name, String libraryCardNumber, List<Book> loanedBooks) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.loanedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(String libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public List<Book> getLoanedBooks() {
        return loanedBooks;
    }
    public void setLoanedBooks(List<Book> loanedBooks) {
        this.loanedBooks = loanedBooks;
    }
    public void addLoanBook(Book book) {
        loanedBooks.add(book);
    }

    public void removeLoanBook(Book book) {
        loanedBooks.remove(book);
    }
    public void loanBook(Book book, User user) {
        if (!book.isOnLoan()) {
            book.setOnLoan(true);
            user.getLoanedBooks().add(book);
        } else {
            System.out.println("Book is already loaned out.");
        }
    }

    public void returnBook(Book book, User user) {
        if (book.isOnLoan()) {
            book.setOnLoan(false);
            user.getLoanedBooks().remove(book);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", libraryCardNumber='" + libraryCardNumber + '\'' +
                ", loanedBooks=" + loanedBooks +
                '}';
    }
}

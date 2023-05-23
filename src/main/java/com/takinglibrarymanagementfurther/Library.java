package com.takinglibrarymanagementfurther;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Library {

    private List<Book> books;
    private List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));

    }

    public List<Book> findBooksPublishedInYear(int year) {
        return books.stream()
                .filter(book -> book.getPublicationYear() == year)
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public Book findBookWithMostPages() {
        return books.stream()
                .max(Comparator.comparing(Book::getPages))
                .orElse(null);
    }

    public List<Book> findBooksWithMorePagesThan(int n) {
        return books.stream()
                .filter(book -> book.getPages() > n)
                .collect(Collectors.toList());
    }
    public void displayBookTitlesAlphabetically() {
        books.stream()
                .map(Book::getTitle)
                .sorted()
                .forEach(System.out::println);
    }


    public List<Book> findBooksByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public List<Book> filterBooks(Predicate<Book> bookPredicate) {
        return books.stream()
                .filter(bookPredicate)
                .collect(Collectors.toList());

    }
}



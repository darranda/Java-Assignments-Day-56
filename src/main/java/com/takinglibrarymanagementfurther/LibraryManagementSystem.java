package com.takinglibrarymanagementfurther;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.List;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Book book1 = new Book("The Chronicles of Narnia", "C.S. Lewis", 1950, 784, "fiction");
        Book book2 = new Book("Matilda", "Roald Dahl", 1988, 240, "fiction");
        Book book3 = new Book("The Cat in the Hat", "Dr. Seuss", 1957, 31, "fiction");

        Library library = new Library();

        // add books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //remove books
        library.removeBook("Matilda");

        // Find books by year
        List<Book> booksByYear = library.findBooksPublishedInYear(1988);
        booksByYear.forEach(book -> System.out.println(book.getTitle()));

        // Find books by author
        List<Book> booksByAuthor = library.findBooksByAuthor("Dr. Seuss");
        booksByAuthor.forEach(book -> System.out.println(book.getTitle()));

        // Find book with most pages
        Book bookWithMostPages = library.findBookWithMostPages();
        System.out.println(bookWithMostPages.getTitle());

        // Find books with more pages than 300
        List<Book> booksWithMorePages = library.findBooksWithMorePagesThan(200);
        booksWithMorePages.forEach(book -> System.out.println(book.getTitle()));

        // Find books by category
        List<Book> booksByCategory = library.findBooksByCategory("Fiction");
        booksByCategory.forEach(book -> System.out.println(book.getTitle()));

        //display  books
        Supplier<List<Book>> allBooksSupplier = library::getAllBooks;
        List<Book> allBooks = allBooksSupplier.get();
        allBooks.forEach(book -> System.out.println(book.getTitle()));

        // Predicate to filter books
        Predicate<Book> bookPredicate = book -> book.getPages() > 200;
        List<Book> filteredBooks = library.filterBooks(bookPredicate);
        filteredBooks.forEach(book -> System.out.println(book.getTitle()));


    }
    public Consumer<Book> printBookDetails = (book) -> {
        System.out.println("Title = " + book.getTitle());
        System.out.println("Publish Date = " + book.getPublicationYear());
        System.out.println("Author = " + book.getAuthor());
};
}

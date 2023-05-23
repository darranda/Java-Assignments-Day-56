package com.takinglibrarymanagementfurther;

public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private int pages;
    public String category;
    public Boolean isOnLoan;


    public Book(String title, String author, int publicationYear, int pages,String category) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.category = category;
        this.isOnLoan = false;
    }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        public int getPages() {
            return pages;
        }

        public String getCategory() {
            return category;

    }

    public Boolean getOnLoan() {
        return isOnLoan;
    }

    public void setOnLoan(Boolean onLoan) {
        isOnLoan = onLoan;
    }

    public boolean isOnLoan() {
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", pages=" + pages +
                ", category='" + category + '\'' +
                ", isOnLoan=" + isOnLoan +
                '}';
    }

    public void add(Book book) {
    }

    public void remove(Book book) {
    }
}


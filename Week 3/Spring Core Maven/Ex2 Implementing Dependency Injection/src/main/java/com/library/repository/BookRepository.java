package com.library.repository;

public class BookRepository {
    public void saveBook(String bookName) {
        System.out.println("Book '" + bookName + "' saved to the database.");
    }
    public void displayBooks() {
        System.out.println("Fetching books from the repository");
    }
}

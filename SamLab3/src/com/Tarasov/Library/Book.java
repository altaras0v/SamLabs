package com.Tarasov.Library;

import java.util.*;

/**
 * Creates the book
 */
public class Book {
    private String author;
    private String bookName;
    private Date date;
    private static Set<String> authors = new HashSet<>();

    /**
     * Constructor of Book
     * @param author - author of the book
     * @param bookName - name of the book
     * @param date - date that book published
     */
    public Book(String author,String bookName, Date date){
        this.author = author;
        this.bookName = bookName;
        this.date = date;
        authors.add(author);
    }

    /**
     * Gets authors of book
     * @return Set<String> of authors.
     */
    public static Set<String> getAuthors() {
        return authors;
    }

    /**
     * Get information about book
     * @return String - name of author and name of book
     */
    public String getBook(){
        return author + " - " + bookName;
    }

    /**
     * Get date thar book published
     * @return date
     */
    public Date getDate() {
        return date;
    }
}

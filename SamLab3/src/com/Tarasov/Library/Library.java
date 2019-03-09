package com.Tarasov.Library;

import java.util.Date;
import java.util.Iterator;

/**
 * Creates library
 */
public class Library {
    private String name;
    private String address;
    private Book[] books;

    /**
     * Constructor of Library
     * @param name - name of library
     * @param address - address of library
     * @param books = array of books which has library
     */
    public Library(String name, String address, Book[] books){
        this.name = name;
        this.address = address;
        this.books = books;
    }

    /**
     * Shows authors of all books in the library
     */
    public void showAuthors(){
        Iterator iterator = Book.getAuthors().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * Show all books in library
     */
    public void showBooks(){
        for (Book b:books){
            System.out.println(b.getBook());
        }
    }

    /**
     * Search books in library by date
     * @param dateFirst - date from which to search
     * @param dateLast - date to which to search
     */
    public void searchByDate(Date dateFirst,Date dateLast){
        for (Book b:books){
            if(b.getDate().after(dateFirst)&&b.getDate().before(dateLast)){
                System.out.println(b.getBook());
            }
        }
    }
}

package com.bookstore;

import com.bookstore.Book;
import com.bookstore.genres.Horror;
import com.bookstore.interfaces.BookGenres;
import com.bookstore.types.FictionBook;

public class Dracula extends Book {
    public Dracula(){
        bookType = new FictionBook();
        bookGenres = new Horror();
    }
}

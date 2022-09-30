package com.bookstore;

import com.bookstore.interfaces.BookGenres;
import com.bookstore.interfaces.BookType;

public abstract class Book {
    BookGenres bookGenres;
    BookType bookType;

    public void type(){
        bookType.bookType();
    }

    public void genre(){
        bookGenres.bookGenre();
    }

}

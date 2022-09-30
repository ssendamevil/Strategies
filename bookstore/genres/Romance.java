package com.bookstore.genres;

import com.bookstore.interfaces.BookGenres;

public class Romance implements BookGenres {
    @Override
    public void bookGenre() {
        System.out.println("All Romance genre books displayed...");
    }
}

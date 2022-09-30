package com.bookstore.genres;

import com.bookstore.interfaces.BookGenres;

public class Horror implements BookGenres {
    @Override
    public void bookGenre() {
        System.out.println("All Horror genre books displayed...");
    }
}

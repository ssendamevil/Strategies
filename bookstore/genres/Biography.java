package com.bookstore.genres;

import com.bookstore.interfaces.BookGenres;

public class Biography implements BookGenres {
    @Override
    public void bookGenre() {
        System.out.println("All Biography genre books displayed...");
    }
}

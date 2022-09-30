package com.bookstore.genres;

import com.bookstore.interfaces.BookGenres;

public class Fantasy implements BookGenres {
    @Override
    public void bookGenre() {
        System.out.println("All fantasy genre book displayed...");
    }
}

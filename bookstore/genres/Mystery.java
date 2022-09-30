package com.bookstore.genres;

import com.bookstore.interfaces.BookGenres;

public class Mystery implements BookGenres {
    @Override
    public void bookGenre() {
        System.out.println("All Mystery genre books displayed...");
    }
}

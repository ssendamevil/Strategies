package com.bookstore.genres;

import com.bookstore.interfaces.BookGenres;

public class Action_Adventure implements BookGenres {
    @Override
    public void bookGenre() {
        System.out.println("All Action & Adventure genre books displayed...");
    }
}

package com.bookstore.types;

import com.bookstore.interfaces.BookType;

public class Ebook implements BookType {

    @Override
    public void bookType() {
        System.out.println("It's an ebook!");
    }
}

package com.bookstore.types;

import com.bookstore.interfaces.BookType;

public class FictionBook implements BookType {

    @Override
    public void bookType() {
        System.out.println("It's a fiction book");
    }
}

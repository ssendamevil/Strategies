package com.bookstore.types;

import com.bookstore.interfaces.BookType;

public class NonfictionBook implements BookType {
    @Override
    public void bookType() {
        System.out.println("It's non-fiction book");
    }
}

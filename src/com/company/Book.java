package com.company;

public class Book {
    String name;
    BookMover status;

    public Book(String name, BookMover status){
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return  name +" " + BookMover.ARCHIVED;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        Book mat = new Book("Математика", BookMover.ARCHIVED);
        Book eng = new Book("Английский",BookMover.AVAILABLE);
        Book java = new Book("Программирование",BookMover.BORROWED);



                System.out.println(mat);
                mat.status = BookMover.AVAILABLE;
        System.out.println(mat);

        // write your code here}
    }

}
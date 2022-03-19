package com.syntax.class19;

public class Books {
    String bookName="Default BookName";
    String author="Default Author";
    String isbn="Default isbn";
    int year=0000;

    Books(){

    }
    Books(String bName, String authorName, String isbn, int year){
        this.bookName=bName;
        this.author=authorName;
        this.isbn=isbn;
        this.year=year;

    }

    void printInfo(){
        System.out.println("Book Name: "+this.bookName);
        System.out.println("Author Name: "+this.author);
        System.out.println("ISBN #: "+this.isbn);
        System.out.println("Year Released: "+this.year);
    }
}

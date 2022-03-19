package com.syntax.class19;

public class BookTester {
    public static void main(String[] args) {
        Books book1 = new Books("Java from Scratch", "Rando",
                "UNMA-1223434234", 1998);
        book1.printInfo();

        System.out.println("-------------------------");
        Books book2 = new Books();
        book2.printInfo();

    }
}

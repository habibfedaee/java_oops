package com.syntax.TestCodes;

public class Main {
    int m_x, m_y;

    public Main() {

        System.out.println("I am constructor");

    }


    public Main(int x, int y) {

        m_x = x;

        m_y = y;

    }

    public void print(){

    }
    public static void main(String args[])  {
        Main m = new Main();
        m.print();
    }
}
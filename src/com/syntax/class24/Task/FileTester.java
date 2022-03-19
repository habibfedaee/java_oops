package com.syntax.class24.Task;

public class FileTester {
    public static void main(String[] args) {
        File file = new File() {
            @Override
            public void open() {
                System.out.println("file class opening");
            }
        };
        file.open();        file.edit();     file.close();

        JavaFile jf = new JavaFile();     jf.open();

        WordFile wf = new WordFile();     wf.open();

        PdfFile pf = new PdfFile();       pf.open();

    }
}

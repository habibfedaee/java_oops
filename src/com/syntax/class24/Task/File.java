package com.syntax.class24.Task;

public abstract class File {
    public abstract void open();
    void edit(){
        System.out.println("File editing");
    }
    void close(){
        System.out.println("File closing");
    }

}
class JavaFile extends File{
    @Override
    public void open() {
        System.out.println("Java file Opening with notepad++");
    }
}
class WordFile extends File{
    @Override
    public void open() {
        System.out.println("Word file Opening with ms word");
    }
}
class PdfFile extends File{
    @Override
    public void open() {
        System.out.println("Pdf file Opening with adobe acrobat");
    }
}
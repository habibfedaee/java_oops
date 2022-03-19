package com.syntax.GroupProject;

public class ChromeDriver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("chrome driver navigate to ...");
    }

    @Override
    public void getScreenshot() {
        System.out.println("chrome driver takes screenshot");
    }

    @Override
    public void open() {
        System.out.println("chrome driver opens");
    }

    @Override
    public void close() {
        System.out.println("chrome driver closes");
    }

    @Override
    public String getTitle() {
        return "Chrome Driver Title";
    }
}

package com.syntax.GroupProject;

public class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("FireFox navigates to...");
    }

    @Override
    public void getScreenshot() {
        System.out.println("FireFox takes screenshot");
    }

    @Override
    public void open() {
        System.out.println("FireFox opens");

    }

    @Override
    public void close() {
        System.out.println("FireFox closes");
    }

    @Override
    public String getTitle() {
        return "FireFox title";
    }
}

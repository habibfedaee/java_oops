package com.syntax.class25.Tasks;

public class BrowserTest {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.openBrowser();
        chrome.minimizeWindow();
        chrome.maximizeWindow();
        chrome.findElement();
        chrome.closeBrowser();

        System.out.println("-----------------------------");

        FireFoxDriver firefox = new FireFoxDriver();
        firefox.openBrowser();
        firefox.minimizeWindow();
        firefox.maximizeWindow();
        firefox.findElement();
        firefox.closeBrowser();

    }
}

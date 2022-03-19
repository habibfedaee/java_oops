package com.syntax.class24;

public class Tester {
    public static void main(String[] args) {
//        GoogleChrome chrome = new GoogleChrome();
//        chrome.openBrowser();
//        chrome.loadPage("www.google.com");
//        chrome.testThePage();
//        chrome.closeBrowser();
//
//        // firefox
//        FireFox firefox = new FireFox();
//        firefox.openBrowser();
//        firefox.loadPage("www.google.com");
//        firefox.testThePage();
//        firefox.closeBrowser();
//
//        // safari
//        Safari safari = new Safari();
//        safari.openBrowser();
//        safari.loadPage("www.google.com");
//        safari.testThePage();
//        safari.closeBrowser();

        Browser[] browsers = {new Browser(), new GoogleChrome(), new FireFox(), new Safari(), new IE()};
        for(Browser browser: browsers){
            browser.openBrowser();
            browser.openBrowser();
            System.out.println();

        }

    }
}

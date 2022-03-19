package com.syntax.class25.Tasks;

public interface WebDriver {
    void openBrowser();     void closeBrowser();   void minimizeWindow();     void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {   System.out.println("chrome browser opens");   }
    @Override
    public void closeBrowser() {   System.out.println("chrome browser closed");    }
    @Override
    public void minimizeWindow() {  System.out.println("chrome browser minimized");   }
    @Override
    public void maximizeWindow() {   System.out.println("chrome browser maximized");   }
    @Override
    public void findElement() {  System.out.println("finding element in chrome");    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {  System.out.println("Firefox browser opens");   }
    @Override
    public void closeBrowser() {  System.out.println("Firefox browser closed");  }
    @Override
    public void minimizeWindow() {  System.out.println("Firefox browser minimized");  }
    @Override
    public void maximizeWindow() {  System.out.println("Firefox browser maximized");  }
    @Override
    public void findElement() {     System.out.println("finding element in Firefox");  }
}

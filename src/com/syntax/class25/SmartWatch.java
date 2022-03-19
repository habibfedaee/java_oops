package com.syntax.class25;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class SmartWatch {
    private int RAM;
    protected int ROM;
    double displaySize;
    public String make;
    static boolean showTime=true;

    SmartWatch(int RAM, int ROM, double displaySize, String make, boolean showTime){
        this.RAM=RAM; this.ROM=ROM; this.displaySize=displaySize; this.make=make;
        this.showTime=showTime;
    }
    // for abstract methods, 1, access modifier, 2, non-access modifiers, 3, return type,
    // 4, method name, 5, parenthesis, 6, ;   no body
    public abstract void showHealthTips();
    public void displayTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    private void updateOS(){
        checkOSUpdate();
        downloadUpdate();
        installUpdate();
        System.out.println("Updating the OS");
    }
    private void checkOSUpdate(){
        System.out.println("checking if update is available");
    }
    private void downloadUpdate(){
        System.out.println("downloading the update");
    }

    private void installUpdate(){
        System.out.println("installing the update");
    }

}

class AppleWatch extends SmartWatch{

    AppleWatch(int RAM, int ROM, double displaySize, String make, boolean showTime) {
        super(RAM, ROM, displaySize, make, showTime);
    }

    @Override
    public void showHealthTips() {
        System.out.println("Showing your health tips");
    }
}
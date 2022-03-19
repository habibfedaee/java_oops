package com.syntax.class23;

public class Car {

    void start(){
        System.out.println("car starts with key");
    }
    void stop(){
        System.out.println("car stops when break pushed");
    }
    void park(){
        System.out.println("car automatically or manually gets parked");
    }
}
class BMW extends Car{
    @Override
    void start(){
        System.out.println("start me with App or remote");
    }
    void stop(){
        System.out.println("stop me with break pedal or auto-break");
    }
    void park(){
        System.out.println("use parking sensor to park me");
    }
}

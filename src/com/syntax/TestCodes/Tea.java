package com.syntax.TestCodes;

public abstract class Tea {
    String teaType;
    Tea(String teaType){
        this.teaType = teaType;
    }
    public abstract void addSugar();
}

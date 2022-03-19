package com.syntax.class25;

public interface Healthy {
    void healthy();
}
interface Portable{
    void canCarry();
}
interface eatable {
    void canEat();
}
class Orange implements Healthy, Portable, eatable{

    @Override
    public void healthy(){
        System.out.println("orange is healthy");
    }

    @Override
    public void canCarry() {
        System.out.println("orange can be carried");
    }

    @Override
    public void canEat() {
        System.out.println("orange can be eaten");
    }

}
class Laptop implements Portable{

    @Override
    public void canCarry() {
        System.out.println("laptop can be carried");
    }
}




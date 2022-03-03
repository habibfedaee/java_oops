package com.syntax.class18;

public class Facebook {
    private String userName;
    private String password;
    private int age;

    void setAge(int personAge){
        if(age>5 && age<80){
            age = personAge;
        } else {
            System.out.println(" Not allowed its not a Horse");
        }
    }


    public int getAge() {
        return age;
    }
}

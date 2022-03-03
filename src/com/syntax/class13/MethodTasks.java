package com.syntax.class13;
public class MethodTasks {
    // 1. Method that returns larger number from two numbers
    int larger(int n1, int n2){
        return Math.max(n1, n2);
    }
    // 2. Method that will check if number is even/odd
    void checkEvenOdd(int number){
        if(number%2==0){
            System.out.println(number+" is Even");
        } else{
            System.out.println(number+" is Odd");
        }
    }
    // 3. Method to say hello in different language based on lang id
    void sayHello(int langID){
        // 1. English, 2. French, 3. Deutsche, 4. Spanish, 5. Persian, 6. Arabic
        String greeting;
        if(langID==1){
            greeting= "Hello";
        } else if(langID==2){
            greeting = "Bonjour";
        } else if(langID==3){
            greeting = "Halo";
        } else if(langID==4){
            greeting = "Hola";
        } else if(langID==5){
            greeting = "Salam";
        } else if(langID==6){
            greeting = "Assalam o Alaikum";
        } else {
            greeting = "N/A";
        }System.out.println(greeting);
    }
    // 4. Method createEmail() from parameters (fname, lname, domain)
    String createEmail(String fname, String lname, String domain){
        return fname+lname+"@"+domain+".com";
    }

    // 5. Method to return if number prime or not prime
    boolean isPrime(int number){
        boolean flag = false;
        for(int i=2; i<=number/2; ++i){
            // not prime
            if(number%1==0){
                flag = true;
                break;
            }
        }
        return !flag;
    }




    // main method -----------
    public static void main(String[] args) {
        MethodTasks obj = new MethodTasks();
        boolean pr = obj.isPrime(3);
        System.out.println(pr);
    }

}

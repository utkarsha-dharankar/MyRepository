package com.test;

public class SwitchExample {

    public static void main(String[] args) {       
        
        char choice='a';
        
        switch(choice)
        {
        case 'a':System.out.println("Good Morning!!");    //Fall through execution
                break;
        case 'b':System.out.println("Hi, Good Morning!!");
                break;
        case 'c','d':System.out.println("Hello, Good Morning!!");
               break;
        default: System.out.println("Wrong choice!!");
               break;   
        }
    }

}
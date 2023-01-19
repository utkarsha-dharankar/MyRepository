package java_fullstack_first_project;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

public static void main(String[] args) {
        
        int mainArray[]= {11,22,33,44,55,66,77,88,99,111};
        Scanner scan=new Scanner(System.in);
        
        
        
        System.out.println("Original Array");
        System.out.println(Arrays.toString(mainArray));
        
        int lastElement=mainArray[mainArray.length-1];
        
        
        //System.out.println(lastElement);
        
        for(int i=mainArray.length-1;;i++ )
        {
            
            mainArray[i]=mainArray[i+1];
        }
        
        mainArray[0]=lastElement;
        
        System.out.println("After Rotation Array");
        System.out.println(Arrays.toString(mainArray));
        
        
        

    }

}
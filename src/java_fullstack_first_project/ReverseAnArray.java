package java_fullstack_first_project;

import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {
        
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=scan.nextInt();
        
        //array declaration
        int myArray1[]=new int[size];
        
        
        //Dynamic initialization
        for(int i=0;i<myArray1.length;i++)
        {
          System.out.println("Enter element:");
          myArray1[i]=scan.nextInt();
        }
        
        
        System.out.println("Original Array:");
        System.out.println("================================================");
        for(int i=0;i<myArray1.length;i++)
        {
            System.out.print(myArray1[i]+",");
        }
        System.out.println();
        
        System.out.println("Reverse form of the Array:");
        System.out.println("================================================");
        for(int i=myArray1.length-1;i>=0;i--)
        {
            System.out.print(myArray1[i]+",");
        }

    }

}
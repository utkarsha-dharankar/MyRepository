package java_fullstack_first_project;


import java.util.Scanner;

public class ArrayDeclarationExample {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        //static initialization
        int[] myArray= {11,22,33,44,55,66,77,88,99};
        
        System.out.println(myArray[9]);
        
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
        
        
        
        for(int i=0;i<myArray1.length;i++)
        {
        System.out.println(myArray1[i]);
        }

    }

}
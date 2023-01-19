package java_fullstack_first_project;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenArrays {

    public static void main(String[] args) {
        
        int mainArray[]=new int[10];
        Scanner scan=new Scanner(System.in);
        
        for(int i=0;i<mainArray.length;i++)
        {
          System.out.println("Enter element:");
          mainArray[i]=scan.nextInt();
        }
        
        /* int oddArray[]=new int[10];
        int evenArray[]=new int[10];
        */
        int oddArray[]=new int[5];
        int evenArray[]=new int[5];
        int i=0,j=0,k=0;
        
        
        for( i=0;i<mainArray.length;i++)
        {
            if(mainArray[i]%2==0)
            {
                evenArray[j++]=mainArray[i];
            }
            else
            {
                oddArray[k++]=mainArray[i];
            }
        }
        
        
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(mainArray));
        
        System.out.println("Even Array:");
        System.out.println(Arrays.toString(evenArray));
        
        System.out.println("Odd Array:");
        System.out.println(Arrays.toString(oddArray));
        
        
        /*
        System.out.println("Even Array:");
        for( i=0;i<j;i++)
        {
        System.out.print(evenArray[i]+" ");
        }
        
        
        System.out.println();
        
        
        
        System.out.println("Odd Array:");
        for( i=0;i<k;i++)
        {
        System.out.print(oddArray[i]+" ");
        }
        */

    }

}
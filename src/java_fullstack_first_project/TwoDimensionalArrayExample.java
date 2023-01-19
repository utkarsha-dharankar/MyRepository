package java_fullstack_first_project;



import java.util.Scanner;

public class TwoDimensionalArrayExample {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=scan.nextInt();
        
        System.out.println("Enter the number of columns:");
        int cols=scan.nextInt();
        
        
        int my2DArray[][]=new int[rows][cols];
        
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println("Enter element:");
                my2DArray[i][j]=scan.nextInt();
                
            }
        }
        
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(my2DArray[i][j]+"\t");
                
            }
            System.out.println();
        }
        
        //static initialization of the array
        int my2DArray1[][]= {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(my2DArray1[i][j]+"\t");
                
            }
            System.out.println();
        }
        
    }
}

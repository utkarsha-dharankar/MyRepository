package java_fullstack_first_project;



import java.util.Scanner;

public class Calculator_Example {

    
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        
        int operation=0,  firstValue=0,  secondValue=0;
        boolean status=true;
        
        
    do
    {
        System.out.println("=========================================================================="); 
        System.out.println("============================ Calculator    ==============================="); 
        System.out.println("=========================================================================="); 
        
        System.out.println("\t Perform an operation:");
        System.out.println("\t 1 -> Addition operation:");
        System.out.println("\t 2 -> Subtraction operation:");
        System.out.println("\t 3 -> Multiplication operation:");
        System.out.println("\t 4 -> Division operation:");
        System.out.println("\t 5 -> Exit");
        System.out.println("==========================================================================");
        System.out.println("Enter you choice:");
        operation=ob.nextInt();
        
            if(operation==5)
            {
                System.out.println("==========================================================================");
                System.out.println("Bye..");
                System.out.println("==========================================================================");

                break;
            }
            
        if(operation<5)
        {
            System.out.println("==========================================================================");
            System.out.println("Enter the first number:");
            firstValue=ob.nextInt();
            
            System.out.println("Enter the second number:");
            secondValue=ob.nextInt();
            System.out.println("==========================================================================");
        }
        switch(operation)
        {
         case 1:System.out.println("result:"+ (firstValue+secondValue));
                break;
         case 2:System.out.println("result:"+( firstValue - secondValue));
                break;
         case 3:System.out.println("result:"+( firstValue * secondValue));
                break;
         case 4:System.out.println("result:"+( firstValue / secondValue));
                break;  
         default: System.out.println("Wrong choice!!");     
        }
        
        
        
    }while(status);
    }
}